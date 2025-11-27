package practice_clean_code.task_2.after;

public class TotalCostDiscount implements DiscountStrategy {

    @Override
    public double applyDiscount(double totalSum) {
        double totalFinalPrice = totalSum;
        if (totalSum > 500){
            totalFinalPrice -= totalSum * 10/100;
            System.out.println("This order qualifies for a 10% discount next time!");
        } else {
            System.out.println("This order does not qualify for a 10% discount");
        }
        return totalFinalPrice;
    }
}
