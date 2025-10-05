package practice_4.park;

public class Main {
    public static void main(String[] args) {

        RollerCoaster coaster = new RollerCoaster("Американские горки");
        Carousel carousel = new Carousel("Карусель");
        Park park = new Park();

        park.addAttraction(carousel);
        park.manage(carousel);
    }
}
