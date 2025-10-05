package practice_4.pet;

public class Main {
    public static void main(String[] args) {

        Pet dog = new Dog();
        Pet cat = new Cat();
        Home home = new Home();

        dog.setName("Шарик");
        cat.setName("Митрик");

        home.addHome(dog);
        home.addHome(cat);

        home.interaction(dog);
        home.interaction(cat);
    }
}
