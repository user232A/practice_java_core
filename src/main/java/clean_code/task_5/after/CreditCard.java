package clean_code.task_5.after;

public class CreditCard implements Payable{

    private String title;

    public CreditCard(String title) {
        this.title = title;
    }

    @Override
    public void payment(double amount) {
        System.out.println("Оплата кредитной картой на сумму " + amount);
    }
}
