package practice_4.pet;

abstract public class Pet {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void eat();

    abstract void walk();
}
