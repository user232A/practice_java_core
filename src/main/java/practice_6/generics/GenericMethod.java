package practice_6.generics;

public class GenericMethod {
    // 2. Задача на дженерик метод
    // Условие задачи: Напишите дженерик метод printArray, который принимает массив элементов любого типа и
    // выводит каждый элемент массива на консоль.

    public static <T> void printArray(T[] array){
        for (T element : array){
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {4, 59, 78, 61, 93};
        Character[] charArray = {'s', '@', '(', '!', '~', '='};
        Boolean[] boolArray = {true, false, false, true};

        printArray(intArray);
        System.out.println();

        printArray(charArray);
        System.out.println();

        printArray(boolArray);
    }
}
