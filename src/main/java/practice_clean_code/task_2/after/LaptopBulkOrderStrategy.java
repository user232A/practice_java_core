package practice_clean_code.task_2.after;

public class LaptopBulkOrderStrategy implements BulkOrderStrategy{

    @Override
    public void createBulkOrder(Order order) {
        order.getProductList().stream().forEach(product -> {
            if (product.getName().equals("Laptop") && product.getQuantity() > 3){
                System.out.println("Bulk order for Laptops processed!");
            }
        });
    }
}
