package practice_4.pet;

public class Home {

    public void addHome(Pet pet) {
        System.out.println("Взяли питомца " + pet.getName());
    }

    public void interaction(Pet pet) {
        pet.eat();
        pet.walk();
    }
}
