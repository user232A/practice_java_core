package complex_tasks.entity_manager;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EntityManager<Person> manager = new EntityManager<>();

        Person maria = new Person("Maria", 32, true);
        Person boris = new Person("Boris", 56, false);
        Person john = new Person("John", 27, true);
        Person marina = new Person("Marina", 40, false);
        Person bob = new Person("Bob", 22, true);
        Person donald = new Person("Donald", 33, false);
        Person david = new Person("David", 24, true);

        manager.addEntity(maria, bob, boris, john, marina, donald, david);
        System.out.println("Первоначальная коллекция: " + manager.getEntityList());

        manager.removeEntity(david);
        System.out.println("Удалили David " + manager.getEntityList());
        System.out.println();

        List<Person> anotherList = manager.getAnotherList(manager.getEntityList());
        try {
            anotherList.set(0, new Person("Monica", 20, false));
        } catch (UnsupportedOperationException e) {
            System.out.println("Операция по замене Person не поддерживается в копии списка");
        }
        System.out.println();

        System.out.println("Копия первоначальной коллекции: " + anotherList);
        System.out.println("Первоначальная коллекция: " + manager.getEntityList());
        System.out.println();

        List<Person> seniorList = manager.getPersonListMoreAge(person -> person.getAge() > 35);
        System.out.println("Persons старшего возраста: " + seniorList);

        List<Person> juniorList = manager.getPersonListLessAge(person -> person.getAge() < 25);
        System.out.println("Persons младшего возраста: " + juniorList);
        System.out.println();

        List<Person> listByFirstCharName = manager.getPersonListByName(
                person -> person.getName().startsWith("M"));
        System.out.println("Список отфильтрованный по первому символу имени: " + listByFirstCharName);

        List<Person> activeList = manager.getPersonListByActive(
                Person::getStatus);
        System.out.println("Список активных персон: " + activeList);

        List<Person> inactiveList = manager.getPersonListByActive(
                person -> !person.getStatus());
        System.out.println("Список неактивных персон: " + inactiveList);
    }
}
