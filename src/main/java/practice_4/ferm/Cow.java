package practice_4.ferm;

public class Cow extends Animal {
    @Override
    public void getProduct() {
        System.out.println("Корова дает молоко");
    }

    @Override
    public void eat() {
        System.out.println("Корова ест траву");
    }
}
