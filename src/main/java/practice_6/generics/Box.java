package practice_6.generics;

import jdk.jfr.BooleanFlag;

public class Box<T> {
    // 1. Задача на дженерик класс
    // Условие задачи: Разработайте дженерик класс Box, который может хранить объекты любого типа.
    // Класс должен иметь методы для установки и получения значения объекта, хранящегося внутри.

    private T box;

    public T getBox() {
        return box;
    }

    public void setBox(T box) {
        this.box = box;
    }


    public static void main(String[] args) {

        // Integer
        Box<Integer> box1 = new Box<>();
        box1.setBox(45);
        System.out.println(box1.getBox());

        // Boolean
        Box<Boolean> box2 = new Box<>();
        box2.setBox(true);
        System.out.println(box2.getBox());

        // Car
        Box<Car> box3 = new Box<>();
        Car car = new Car("Nissan");
        box3.setBox(car);
        System.out.println(box3.getBox());

    }
}

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car {" +
                "name='" + name + '\'' +
                '}';
    }
}
