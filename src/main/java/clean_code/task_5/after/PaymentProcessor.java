package clean_code.task_5.after;

public class PaymentProcessor {

    public void processPayment(Payable payable, double amount) {
        payable.payment(amount);
    }
}
