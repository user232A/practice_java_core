package clean_code.task_5.after;

public class PayPal implements Payable{

    private String title;

    public PayPal(String title) {
        this.title = title;
    }

    @Override
    public void payment(double amount) {
        System.out.println("Оплата через PayPal на сумму " + amount);
    }
}
