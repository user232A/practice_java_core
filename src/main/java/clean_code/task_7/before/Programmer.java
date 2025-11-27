package clean_code.task_7.before;

public class Programmer implements Worker{
    @Override
    public void work() {
        System.out.println("Программист пишет код");
    }
    @Override
    public void eat() {
        throw new UnsupportedOperationException("Программист не ест на работе");
    }
}
