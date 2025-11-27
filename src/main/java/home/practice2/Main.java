package home.practice2;

public class Main {

    public static void main(String[] args) {

        Act act = new Act();
        act.addElement(
                new DigitalElement("Lesson1", 50, 45),
                new DigitalElement("Lesson2", 40, 415),
                new DigitalElement("Lesson3", 20, 145),
                new PhysElement("char", 15, 1.0),
                new PhysElement("table", 25, 2.0)
        );
        act.addDiscount(new FixedDiscount(10), new PercentDiscount(10));
        System.out.println(act.calculatePrice());
    }
}
