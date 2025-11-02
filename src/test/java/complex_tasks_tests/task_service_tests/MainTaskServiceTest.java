package complex_tasks_tests.task_service_tests;

import complex_tasks.task_manager.Task;
import complex_tasks.task_manager.TaskPriority;
import complex_tasks.task_manager.TaskService;
import complex_tasks.task_manager.TaskStatus;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.util.List;

public class MainTaskServiceTest {

    TaskService<Integer> service;

    @BeforeEach
    public void setUp() {
        service = new TaskService<>();
    }

    public static Task<Integer> createTask(int id) {
        return new Task<>(id, TaskStatus.IN_PROGRESS, TaskPriority.HIGH,
                LocalDate.of(2025, 11, 15));
    }

    public static List<Task<Integer>> createListTasksWithFiveElements() {
        return List.of(
                new Task<>(1, TaskStatus.IN_PROGRESS, TaskPriority.HIGH,
                        LocalDate.of(2025, 11, 15)),
                new Task<>(3, TaskStatus.IN_PROGRESS, TaskPriority.MEDIUM,
                        LocalDate.of(2025, 11, 29)),
                new Task<>(7, TaskStatus.DONE, TaskPriority.HIGH,
                        LocalDate.of(2025, 11, 9)),
                new Task<>(12, TaskStatus.TO_DO, TaskPriority.LOW,
                        LocalDate.of(2025, 11, 30)),
                new Task<>(9, TaskStatus.IN_PROGRESS, TaskPriority.HIGH,
                        LocalDate.of(2025, 11, 17))
        );
    }
}
