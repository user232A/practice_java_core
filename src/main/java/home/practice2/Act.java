package home.practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Act {

    static int age = 2;

    private List<Element> elements;
    private List<Discountable> discountableList;

    public Act() {
        this.elements = new ArrayList<>();
        this.discountableList = new ArrayList<>();
    }

    public void addElement(Element... element) {
        Collections.addAll(elements, element);
    }

    public void addDiscount(Discountable... discountable) {
        Collections.addAll(discountableList, discountable);
    }

    public double calculatePrice() {
        double sum = elements.stream().mapToDouble(Element::getPrice).sum();
        for (Discountable discount : discountableList) {
            sum -= discount.discount(sum);
        }
        return sum;
    }
}
