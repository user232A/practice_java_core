package complex_tasks.task_manager;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TaskService<T> {

    private List<Task<T>> taskList;

    public TaskService() {
        this.taskList = new CopyOnWriteArrayList<>();
    }

    public List<Task<T>> getTaskList() {
        return taskList;
    }

    public void addTaskToList(Task<T> task) {
        if (!taskList.contains(task)) {
            taskList.add(task);
        } else {
            System.out.println("В списке уже есть задача с ID: " + task.getID());
        }
    }

    public void removeTaskFromList(int id) {
        taskList.removeIf(task -> task.getID().equals(id));
    }

    public List<Task<T>> filterTasksByStatus(String status) {
        return taskList.stream().filter(
                task -> task.getStatus().toString().equalsIgnoreCase(status)).toList();
    }

    public List<Task<T>> filterTasksByPriority(String priority) {
        return taskList.stream().filter(
                task -> task.getPriority().toString().equalsIgnoreCase(priority)).toList();
    }

    public List<Task<T>> sortTasksByNaturalOrder() {
        return taskList.stream().sorted(Comparator.comparing(Task::getDate)).toList();
    }

    public List<Task<T>> sortTasksByReverseNOrder() {
        return taskList.stream().sorted(Comparator.comparing(Task::getDate)).toList().reversed();
    }
}
