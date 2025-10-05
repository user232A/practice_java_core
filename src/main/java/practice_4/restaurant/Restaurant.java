package practice_4.restaurant;

public class Restaurant {

    public void addDish(Dish dish) {
        System.out.println("Добавили в меню " + dish.getName());
    }

    public void dishInfo(Dish dish) {
        dish.getInfo();
    }
}
