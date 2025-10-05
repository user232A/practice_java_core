package practice_4.park;

public class Carousel extends Attraction {

    public Carousel(String name) {
        super(name);
    }

    @Override
    public void check() {
        System.out.println(this.getName() + " техническое обслуживание");
    }
}
