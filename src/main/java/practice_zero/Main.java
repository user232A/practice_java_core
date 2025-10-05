package practice_zero;

public class Main {
    public static void main(String[] args) {

        //Задача class practice_zero.Car
        Car car = new Car("Nissan", 2005);
        car.print();
        System.out.println();

        car.setYear(2015);
        car.print();
        System.out.println();

        //Задача class practice_zero.Rectangle

        Rectangle rectangle = new Rectangle(45.78, 14.94);
        System.out.println(rectangle.calculateArea());

        rectangle.setWidth(86.47);
        System.out.println(rectangle.calculateArea());
        System.out.println();

        //Задача class practice_zero.Book

        Book book = new Book("Example", "Pushkin");
        book.setAuthor("Block");
        book.printInfo();
        System.out.println();

        //Задача class practice_zero.BankAccount

        BankAccount account = new BankAccount("Bob", 1500);
        account.deposit(450);
        account.withdraw(50);
        account.printBalance();
        System.out.println();

        //Задача class practice_zero.Point

        Point point = new Point(7, 9);
        point.setX(5);
        point.print();
        System.out.println();

        //Задача class practice_zero.StudentGroup

        StudentGroup group = new StudentGroup("Historic", 25);
        group.setStudentCount(24);
        group.printInfo();
        System.out.println();

        //Задача class practice_zero.Circle

        Circle circle = new Circle(18);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculateCircumference());

        circle.setRadius(12);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculateCircumference());
        System.out.println();


        //Задача class practice_zero.Teacher

        Teacher teacher = new Teacher("Monica", "Biology");
        teacher.setSubject("History");
        teacher.printInfo();
        System.out.println();

        //Задача class practice_zero.Product

        Product product = new Product("practice_zero.Car", 15000);
        product.setPrice(10000);
        product.applyDiscount(15);
        product.printInfo();
        System.out.println();

        //Задача class practice_zero.Laptop

        Laptop laptop = new Laptop("Apple", 1500);
        laptop.setPrice(1400);
        laptop.printInfo();
    }
}
