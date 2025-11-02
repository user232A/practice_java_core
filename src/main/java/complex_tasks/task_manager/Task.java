package complex_tasks.task_manager;

import java.time.LocalDate;
import java.util.Objects;

public class Task<T> {

    private T ID;
    private TaskStatus status;
    private TaskPriority priority;
    private LocalDate date;

    public Task(T ID, TaskStatus status, TaskPriority priority, LocalDate date) {
        this.ID = ID;
        this.status = status;
        this.priority = priority;
        this.date = date;
    }

    public T getID() {
        return ID;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task<?> task = (Task<?>) o;
        return Objects.equals(ID, task.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ID);
    }

    @Override
    public String toString() {
        return "Task{" +
                "ID=" + ID +
                ", status=" + status +
                ", priority=" + priority +
                ", date=" + date +
                '}';
    }
}
