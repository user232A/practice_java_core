package home.coding.order_system;

import java.util.List;

public class Main {

    /*
    Спроектировать систему которая управляет заказами и скидками.

    Шаг 1: Зафиксировать условие

    Два типа товаров:
    Digital product (fileSize field)
    Physical product (weight field)

    Два типа скидок:
    Percentage discount (percentage)
    Fixed discount (fixSum)

    Шаг 2: Пример использования

    Создать заказ
    Положить товар в заказ
    Положить несколько товаров в заказ
    Применить скидку в 20% к заказу1
    Применить скидку на 10$ к заказу1
    Подсчитать сумму к оплате заказа1


    Вопросы:
    1) В заказе может быть несколько товаров? Да
    2) Как мы добавляем товар в заказ? По одному или скопом? И так и так
    3) Скидка применяется к товару или заказу? К заказу
    4) Можем ли мы применять несколько скидок к заказу? Да
    5) Считаем ли мы в заказе общую сумму? Да
    6) Какие поля/свойства есть у любого товара? Цена, название

    Шаг 3: Проектирование классов и связей

    1) Сущности, свойства, связи
    - Product (price, title) - сущность маркер
    - DigitalProduct (fileSize) extends Product
    - PhysicalProduct (weight) extends Product

    - Discountable (method discount())
    - PercentageDiscount (percentage) полиморфизм
    - FixedDiscount (fixSum) полиморфизм

    - Order (содержит products, discounts) - композиция
    - method calculateTotalPrice()

    Шаг 4: Реализация заказа

    Наследование - наследование
    Полиморфизм - интерфейс
    Композиция - поля
    Структуры данных - коллекция

    Шаг 5: Подведение итогов

     */

    public static void main(String[] args) {

        Order order = new Order();
        order.addProduct(new DigitalProduct("Lesson1", 100, 90));
        order.addProducts(List.of(
                new PhysicalProduct("Apple", 1, 2),
                new DigitalProduct("Lesson2", 98, 85),
                new PhysicalProduct("Orange", 3, 2))
        );
        order.addDiscount(new PercentageDiscount(10));
        order.addDiscount(new FixedDiscount(15));

        System.out.println(order.calculateTotalPrice());

    }
}
