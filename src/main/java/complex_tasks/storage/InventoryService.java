package complex_tasks.storage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class InventoryService {

    private Map<String, List<Product>> storage;
    private boolean isInventoryOpen;

    public InventoryService(boolean isInventoryOpen) {
        storage = new HashMap<>();
        this.isInventoryOpen = isInventoryOpen;
    }

    public Map<String, List<Product>> getStorage() {
        return storage;
    }

    public void setInventoryOpen(boolean inventoryOpen) {
        isInventoryOpen = inventoryOpen;
    }

    public void addProduct(Product product) {
        if (isInventoryOpen) {
            storage.computeIfAbsent(product.category.toString(), category -> new ArrayList<>()).add(product);
        } else {
            System.out.println("Склад закрыт");
        }
    }

    public Product getProduct(Product product) throws OutOfStockException {
        return storage.entrySet().stream().flatMap(entry -> entry.getValue().stream())
                .filter(p -> p.equals(product)).findFirst()
                .orElseThrow(() -> new OutOfStockException("Продукта нет на складе"));
    }

    public List<Product> getProductsByCategory(String category) {
        return storage.entrySet().stream().filter(entry -> entry.getKey().equals(category))
                .flatMap(entry -> entry.getValue().stream()).toList();
    }

    public List<Product> filterProductsByPrice(String category, Predicate<Product> predicate) {
        return storage.entrySet().stream().filter(entry -> entry.getKey().equals(category))
                .flatMap(entry -> entry.getValue().stream())
                .filter(predicate).toList();
    }
}
