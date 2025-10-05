package practice_4.zoo;

public class Bird extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Птица чирикает");
    }

    @Override
    public void move() {
        System.out.println("Птица летает");
    }
}
