package home.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Service {

    private List<Item> itemList;
    private List<Discountable> discountList;

    public Service() {
        this.itemList = new ArrayList<>();
        this.discountList = new ArrayList<>();
    }

    public void addItemToList(Item ... items){
        Collections.addAll(itemList, items);
    }

    public void addDiscountsToList(Discountable ... discount){
        discountList.addAll(Arrays.asList(discount));
    }

    public double calculateTotalPrice(){
        double sum = itemList.stream().mapToDouble(Item::getPrice).sum();
        for (Discountable disc: discountList){
            sum -= disc.discount(sum);
        }
        return sum;
    }
}
