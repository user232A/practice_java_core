package clean_code.task_5.after;

public class Main {

    public static void main(String[] args) {

        PaymentProcessor processor = new PaymentProcessor();

        processor.processPayment(new CreditCard("credit card №22"), 10);
        processor.processPayment(new PayPal("pay pal card №105"), 44);
        processor.processPayment(new Bitcoin("invoice 1Awewei8289f"), 7000);
    }
}
