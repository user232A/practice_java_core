package clean_code.task_5.after;

public class Bitcoin implements Payable{

    private String title;

    public Bitcoin(String title) {
        this.title = title;
    }

    @Override
    public void payment(double amount) {
        System.out.println("Оплата Bitcoin на сумму " + amount);
    }
}
