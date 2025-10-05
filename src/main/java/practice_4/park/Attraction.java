package practice_4.park;

abstract public class Attraction implements Checkable {

    private String name;

    public String getName() {
        return name;
    }

    public Attraction(String name) {
        this.name = name;
    }

    abstract public void check();
}
