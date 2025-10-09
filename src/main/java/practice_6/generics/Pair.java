package practice_6.generics;

public class Pair<K, V> {
    // 3. Задача на дженерик с двумя типами данных
    // Условие задачи: Создайте класс Pair, который может хранить два объекта разных типов.
    // Класс должен позволять получать и устанавливать каждый из этих объектов.

    K key;
    V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>();
        pair.setKey(55);
        pair.setValue("Number");

        System.out.println("Variable Key: " + pair.getKey());
        System.out.println("Variable Value: " + pair.getValue());

        Pair<Boolean, Character> pair1 = new Pair<>();
        pair1.setKey(true);
        pair1.setValue('^');

        System.out.println("Variable Key: " + pair1.getKey());
        System.out.println("Variable Value: " + pair1.getValue());
    }
}
