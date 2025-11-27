package practice_clean_code.task_2.after;

import java.util.ArrayList;
import java.util.List;

public class OnlineStore {

    private List<Order> orderList;
    private PaymentService paymentService;
    private DiscountStrategy discountStrategy;
    private BulkOrderStrategy bulkOrderStrategy;

    public OnlineStore(List<Order> orderList, PaymentService paymentService,
                       DiscountStrategy discountStrategy, BulkOrderStrategy bulkOrderStrategy) {
        this.orderList = orderList;
        this.paymentService = paymentService;
        this.discountStrategy = discountStrategy;
        this.bulkOrderStrategy = bulkOrderStrategy;
    }

    public void addOrder(Order order){
        orderList.add(order);
    }

    private List<Product> getActualProductList(List<Product> list){
        List<Product> actualProductList = new ArrayList<>();
        for (Product product: list){
            if (product.isInStock()){
                actualProductList.add(product);
            }
        }
        return actualProductList;
    }

    public void processOrder(){
        for (Order order: orderList){
            List<Product> actualProductList = getActualProductList(order.getProductList());
            order.setProductList(actualProductList);
            double sum = discountStrategy.applyDiscount(order.calculateTotalPrice());
            order.setTotalPrice(sum);
            bulkOrderStrategy.createBulkOrder(order);
        }
    }
}
