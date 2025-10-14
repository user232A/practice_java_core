package practice_7.function_interface;

@FunctionalInterface
public interface MathOperation<T, K> {
    int operation(T t, K k);
}
