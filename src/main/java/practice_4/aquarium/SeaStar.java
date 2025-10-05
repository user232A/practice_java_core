package practice_4.aquarium;

public class SeaStar extends Fish {

    public SeaStar(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Морская звезда медленно ползает");
    }
}
