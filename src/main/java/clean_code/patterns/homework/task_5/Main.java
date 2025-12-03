package clean_code.patterns.homework.task_5;

public class Main {
    public static void main(String[] args) {

        FurnitureFactory factory;
        String type = "Classic";

        if ("Modern".equals(type)){
            factory = new ModernFurnitureFactory();
        } else {
            factory = new ClassicFurnitureFactory();
        }

        factory.createChair().sitOn();
        factory.createTable().use();

    }
}
