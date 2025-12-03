package clean_code.patterns.homework.task_6;

public class Main {
    public static void main(String[] args) {

        GUIFactory factory;
        String typeOS = "MacOS";

        if ("Windows".equals(typeOS)){
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }

        factory.createButton().click();
        factory.createMenu().select();
        factory.createWindow().draw();

    }
}
