package practice_6.additional_tasks;

public class Storage<T> {
    // Обобщённый класс
    // Задача: Создайте класс Storage<T>, который хранит элемент и возвращает его.

    private T element;

    public Storage(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public static void main(String[] args) {
        Storage<Boolean> storage1 = new Storage<>(true);
        System.out.println(storage1.getElement());

        Storage<Double> storage2 = new Storage<>(45.56);
        System.out.println(storage2.getElement());
    }
}
