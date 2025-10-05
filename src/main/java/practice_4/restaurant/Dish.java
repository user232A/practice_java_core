package practice_4.restaurant;

abstract public class Dish {

    private String name;

    public String getName() {
        return name;
    }

    public Dish(String name) {
        this.name = name;
    }

    public void getInfo() {
        System.out.println("Блюдо " + this.getName());
    }
}
