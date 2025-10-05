package practice_4.pet;

public class Dog extends Pet {

    @Override
    void eat() {
        System.out.println("Собака ест сухой корм");
    }

    @Override
    void walk() {
        System.out.println("Собака гуляет");
    }
}
