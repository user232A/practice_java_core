package practice_4.pet;

public class Cat extends Pet {

    @Override
    void eat() {
        System.out.println("Кошка ест влажный корм");
    }

    @Override
    void walk() {
        System.out.println("Кошка играет");
    }
}
