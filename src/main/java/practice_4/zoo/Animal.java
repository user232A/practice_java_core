package practice_4.zoo;

abstract class Animal {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Животное издает звук");
    }

    public void move() {
        System.out.println("Животное передвигается");
    }
}
