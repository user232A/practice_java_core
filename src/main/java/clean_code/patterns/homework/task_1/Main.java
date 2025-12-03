package clean_code.patterns.homework.task_1;

public class Main {

    public static void main(String[] args) {

        ConfigurationManager configuration1 = ConfigurationManager.getInstance();
        ConfigurationManager configuration2 = ConfigurationManager.getInstance();

        configuration1.printInfo();
        configuration2.printInfo();

        System.out.println();
        configuration2.setPassword("test_password_888");
        configuration1.printInfo();
    }
}
