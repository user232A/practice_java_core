package clean_code.patterns.homework.task_7;

public class Main {
    public static void main(String[] args) {

        Order order1 = new Order.OrderBuilder().setPaymentMethod("Credit Card").build();
        Order order2 = new Order.OrderBuilder()
                .setDiscount(10)
                .setPaymentMethod("Crypto")
                .build();

        order1.addProductToList(new Product("bread", 10), new Product("milk", 15));
        order2.addProductToList(new Product("potato", 30), new Product("juice", 30));

        order1.printInfo();
        System.out.println(order1.totalPrice());

        order2.printInfo();
        System.out.println(order2.totalPrice());

    }
}
