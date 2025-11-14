package home.coding.order_system;

public class DigitalProduct extends Product{

    private int fileSize;

    public DigitalProduct(String title, int price, int fileSize) {
        super(title, price);
        this.fileSize = fileSize;
    }

    public int getFileSize() {
        return fileSize;
    }
}
