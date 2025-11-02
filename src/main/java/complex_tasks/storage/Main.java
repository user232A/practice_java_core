package complex_tasks.storage;

public class Main {
    public static void main(String[] args) {

        InventoryService service = new InventoryService(true);

        Product smartphone = new Product("Galaxy X200", 1000, Category.ELECTRONICS);
        Product headphones = new Product("SoundMax", 400, Category.ELECTRONICS);
        Product smartwatch = new Product("FitTrack 5", 400, Category.ELECTRONICS);
        Product tablet = new Product("TabView 10", 700, Category.ELECTRONICS);

        Product coffee_machine = new Product("BrewMaster", 3000, Category.HOUSEHOLD_GOODS);
        Product vacuum_cleaner = new Product("TurboClean", 1200, Category.HOUSEHOLD_GOODS);
        Product microwave = new Product("QuickHeat", 1100, Category.HOUSEHOLD_GOODS);
        Product blender = new Product("PowerMix 1000", 200, Category.HOUSEHOLD_GOODS);
        Product kettle = new Product("RapidBoil", 3000, Category.HOUSEHOLD_GOODS);

        Product accumulator = new Product("Varta Blue", 500, Category.AUTO_PARTS);
        Product shock_absorbers = new Product("Bilstein", 2000, Category.AUTO_PARTS);
        Product brake_pads = new Product("brembo", 800, Category.AUTO_PARTS);
        Product oil_filter = new Product("Mann", 7000, Category.AUTO_PARTS);
        Product oil_filter2 = new Product("Mann2", 4000, Category.AUTO_PARTS);

        service.addProduct(smartphone);
        service.addProduct(headphones);
        service.addProduct(smartwatch);
        service.addProduct(tablet);
        service.addProduct(oil_filter);
        service.addProduct(kettle);
        service.addProduct(brake_pads);
        service.addProduct(microwave);
        service.addProduct(blender);
        service.addProduct(accumulator);
        service.addProduct(vacuum_cleaner);
        service.addProduct(shock_absorbers);
        service.addProduct(coffee_machine);

        service.getStorage().forEach((category, products) ->
                System.out.println("Category: " + category + " Products: " + products));
        System.out.println();

        try {
            System.out.println(service.getProduct(oil_filter2));
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(service.getProduct(blender));
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        System.out.println(service.getProductsByCategory("ELECTRONICS"));
        System.out.println();

        System.out.println(service.filterProductsByPrice("HOUSEHOLD_GOODS",
                goods -> goods.getPrice() > 1000 && goods.getPrice() < 2000));
    }
}
