package practice_4.ferm;

public class Chicken extends Animal {
    @Override
    public void getProduct() {
        System.out.println("Курица несет яйца");
    }

    @Override
    public void eat() {
        System.out.println("Курица клюет зерно");
    }
}
