package practice_6.additional_tasks;

public class Cont implements Container<StringBuilder>{

    // Обобщённый интерфейс
    // Задача: Создайте интерфейс Container<T>, содержащий методы add(T item) и get().

    StringBuilder name = new StringBuilder("Misha");

    @Override
    public void add(StringBuilder item) {
        name.append(item);
    }

    @Override
    public void get() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Cont cont = new Cont();
        cont.add(new StringBuilder(" Ivanov"));
        cont.get();
    }
}
