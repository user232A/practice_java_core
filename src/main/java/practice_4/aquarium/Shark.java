package practice_4.aquarium;

public class Shark extends Fish {

    public Shark(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Акула плавает быстро и агрессивно");
    }
}
