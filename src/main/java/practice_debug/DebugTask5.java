package practice_debug;

public class DebugTask5 {

    // Код должен увеличить возраст человека, но почему-то возраст остаётся прежним.

    public static void main(String[] args) {
        Person person = new Person("Alice", 25);
        updateAge(person);
        System.out.println("Updated age: " + person.getAge());
    }

    public static void updateAge(Person person) {
        //person = new Person(person.getName(), person.getAge() + 1);
        person.setAge(person.getAge() + 1);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

