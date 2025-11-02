package complex_tasks.task_manager;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        TaskService<Integer> service = new TaskService<>();

        service.addTaskToList(new Task<>(1, TaskStatus.TO_DO, TaskPriority.MEDIUM,
                LocalDate.of(2025, 11, 25)));
        service.addTaskToList(new Task<>(3, TaskStatus.IN_PROGRESS, TaskPriority.MEDIUM,
                LocalDate.of(2025, 11, 29)));
        service.addTaskToList(new Task<>(7, TaskStatus.DONE, TaskPriority.HIGH,
                LocalDate.of(2025, 11, 9)));
        service.addTaskToList(new Task<>(12, TaskStatus.TO_DO, TaskPriority.LOW,
                LocalDate.of(2025, 11, 30)));
        service.addTaskToList(new Task<>(9, TaskStatus.IN_PROGRESS, TaskPriority.HIGH,
                LocalDate.of(2025, 11, 17)));
        service.addTaskToList(new Task<>(10, TaskStatus.TO_DO, TaskPriority.LOW,
                LocalDate.of(2025, 11, 10)));
        service.addTaskToList(new Task<>(15, TaskStatus.DONE, TaskPriority.HIGH,
                LocalDate.of(2025, 11, 11)));
        service.addTaskToList(new Task<>(19, TaskStatus.IN_PROGRESS, TaskPriority.MEDIUM,
                LocalDate.of(2025, 11, 25)));
        service.addTaskToList(new Task<>(1, TaskStatus.DONE, TaskPriority.LOW,
                LocalDate.of(2025, 11, 22)));

        System.out.println(service.getTaskList());

        service.removeTaskFromList(12);
        System.out.println(service.getTaskList());
        System.out.println();

        System.out.println("Задачи со статусом to_do: " + service.filterTasksByStatus("to_do"));
        System.out.println("Задачи с приоритетом high: " + service.filterTasksByPriority("high"));

        System.out.println("Задачи отсортированные от меньшей даты к большей: " + service.sortTasksByNaturalOrder());
        System.out.println("Задачи отсортированные от большей даты к меньшей: " + service.sortTasksByReverseNOrder());
    }
}
