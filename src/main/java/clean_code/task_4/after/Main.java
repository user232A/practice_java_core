package clean_code.task_4.after;

public class Main {
    public static void main(String[] args) {

        Order order = new Order();
        EmailConfirmation emailConfirmation = new EmailConfirmation();
        Invoice invoice = new Invoice();

        order.processOrder();
        emailConfirmation.sendEmailConfirmation();
        invoice.generateInvoice();
    }
}
