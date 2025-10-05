package practice_1;

public class Main {

    public static void main(String[] args) {

        // class Company

        Company company1 = new Company(1, "David");
        Company company2 = new Company(2, "Bob");
        Company company3 = new Company(3, "Donald");

        Company.companyName = "Apple";
        System.out.println(Company.companyName);
        System.out.println();


        // class MathConstants

        System.out.println(MathConstants.calculateCircleArea(34.2));
        System.out.println(MathConstants.calculateCircumference(56.8));
        System.out.println();

        // class Library

        Library library = new Library("tail", "Pushkin", 1995, "tail");
        System.out.println(library.getBookTitle());
        System.out.println(library.author);
        System.out.println(library.year);
        System.out.println(library.category);
        System.out.println();

        // class University

        University university1 = new University(1, "Bob");
        University university2 = new University(2, "David");
        University university3 = new University(3, "Mike");

        University.changeUniversityName("example");
        university1.printStudentInfo();
        System.out.println();

        // class GameSettings

        GameSettings game1 = new GameSettings("game1", 5);
        GameSettings game2 = new GameSettings("game2", 8);

        GameSettings.setMaxPlayers(6);

        game1.printGameStatus();
        game2.printGameStatus();

        game1.addPlayer();
        game1.printGameStatus();

        game1.addPlayer();
        game1.printGameStatus();
        System.out.println();

        // class Person

        Person person1 = new Person("Иван", "Иванов", "2357675");
        Person person2 = new Person("Петр", "Петров", "576643437");
        Person person3 = new Person("Миша", "Сидоров", "72734623");

        person2.setFirstName("Яков");

        person1.printPersonInfo();
        person2.printPersonInfo();
        person3.printPersonInfo();

        person1.printInfo();
        person2.printInfo();
        person3.printInfo();



    }
}
