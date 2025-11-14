package home.practice;

public class Main {

    //Спроектировать систему которая управляет заказами и скидками.

    /*

    1) Сущности:
    Item:
    PhysicalItem
    DigitalItem

    Discount:
    FixedDiscount
    PercentageDiscount

    Service

    2) Действия + вопросы
    - Добавление заказа в список
    - Добавление заказов в список
    - Применение скидки
    - Применение всех скидок сразу
    - Подсчет итоговой суммы заказа

    3) Проектирование классов
    Item
    PhysicalItem extends Item
    DigitalItem extends Item

    Discountable
    FixedDiscount (double fixedSum)
    PercentageDiscount (double percentage)

    Service (содержит items, discounts)
    calculateTotalSum()

     */

    public static void main(String[] args) {

        Service service = new Service();

        service.addItemToList(new DigitalItem("Lesson 1", 50, 53),
                new PhysicalItem("char", 10, 2.2), new DigitalItem("Lesson 2", 10, 24));

        service.addDiscountsToList(new PercentageDiscount(10), new FixedDiscount(20));

        System.out.println(service.calculateTotalPrice());

    }
}
