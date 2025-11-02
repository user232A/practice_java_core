package complex_tasks_tests.inventory_service_tests;

import complex_tasks.storage.Category;
import complex_tasks.storage.InventoryService;
import complex_tasks.storage.OutOfStockException;
import complex_tasks.storage.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InventoryServiceTest {

    InventoryService service;

    @BeforeEach
    public void setUp() {
        service = new InventoryService(true);
    }

    @Test
    public void canAddProductToStorage() throws OutOfStockException {
        Product initialProduct = new Product("Galaxy X200", 1000, Category.ELECTRONICS);
        service.addProduct(initialProduct);
        Assertions.assertFalse(service.getStorage().isEmpty());
        Assertions.assertEquals(initialProduct, service.getProduct(initialProduct));
    }

    @Test
    public void cannotAddProductWhenStorageClosed() {
        Product initialProduct = new Product("Galaxy X200", 1000, Category.ELECTRONICS);
        service.setInventoryOpen(false);
        service.addProduct(initialProduct);
        Assertions.assertTrue(service.getStorage().isEmpty());
    }

}
