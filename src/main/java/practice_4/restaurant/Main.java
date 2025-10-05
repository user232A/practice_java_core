package practice_4.restaurant;

public class Main {
    public static void main(String[] args) {
        HotDish hotDish = new HotDish("Soup", 35);
        Juice juice = new Juice("Orange", 0.5);
        Restaurant restaurant = new Restaurant();

        restaurant.addDish(hotDish);
        restaurant.addDish(juice);

        restaurant.dishInfo(hotDish);
        restaurant.dishInfo(juice);
    }
}
