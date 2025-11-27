package practice_clean_code.task_2.after;

import practice_clean_code.task_2.before.OnlineStore;

public class Main {
    public static void main(String[] args) {

        OnlineStore store = new OnlineStore();
        store.processOrder("Laptop", 1, 1200, "John Doe", true, true);
        store.processOrder("Smartphone", 2, 800, "Alice Smith", true, false);
        store.processOrder("Laptop", 5, 1200, "Bob Johnson", true, true);

    }
}
