package practice_4.aquarium;

abstract public class Fish {

    private String name;

    public Fish(String name) {
        this.name = name;
    }

    abstract public void move();
}
