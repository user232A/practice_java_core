package complex_tasks.storage;

public class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}
