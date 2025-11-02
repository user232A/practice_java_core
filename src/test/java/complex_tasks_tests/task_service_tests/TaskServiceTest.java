package complex_tasks_tests.task_service_tests;

import complex_tasks.task_manager.Task;
import complex_tasks.task_manager.TaskPriority;
import complex_tasks.task_manager.TaskStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;

public class TaskServiceTest extends MainTaskServiceTest {

    @Test
    public void canAddTaskToList() {
        Task<Integer> initialTask = createTask(1);
        service.addTaskToList(initialTask);
        Assertions.assertFalse(service.getTaskList().isEmpty());
        Assertions.assertEquals(initialTask, service.getTaskList().getFirst());
    }

    @Test
    public void cannotAddTaskToListWithExistsID() {
        Task<Integer> initialTask = createTask(1);
        service.addTaskToList(initialTask);
        service.addTaskToList(initialTask);
        Assertions.assertEquals(1, service.getTaskList().size());
    }

    @Test
    public void canRemoveTaskFromListByID() {
        Task<Integer> initialTask = createTask(1);
        service.addTaskToList(initialTask);
        Assertions.assertFalse(service.getTaskList().isEmpty());
        Assertions.assertEquals(initialTask, service.getTaskList().getFirst());

        service.removeTaskFromList(1);
        Assertions.assertTrue(service.getTaskList().isEmpty());
        Assertions.assertThrows(NoSuchElementException.class, () -> service.getTaskList().getFirst());
    }

    @Test
    public void canFilterTasksByStatus() {
        List<Task<Integer>> listTasksWithFiveElements = createListTasksWithFiveElements();
        listTasksWithFiveElements.forEach(task -> service.addTaskToList(task));

        List<Task<Integer>> expectedTasksList = List.of(new Task<>(12, TaskStatus.TO_DO, TaskPriority.LOW,
                LocalDate.of(2025, 11, 30)));

        Assertions.assertEquals(5, service.getTaskList().size());
        Assertions.assertEquals(expectedTasksList, service.filterTasksByStatus("to_do"));
    }

    @Test
    public void canFilterTasksByPriority() {
        List<Task<Integer>> listTasksWithFiveElements = createListTasksWithFiveElements();
        listTasksWithFiveElements.forEach(task -> service.addTaskToList(task));

        List<Task<Integer>> expectedTasksList = List.of(new Task<>(12, TaskStatus.TO_DO, TaskPriority.LOW,
                LocalDate.of(2025, 11, 30)));

        Assertions.assertEquals(5, service.getTaskList().size());
        Assertions.assertEquals(expectedTasksList, service.filterTasksByPriority("low"));
    }

    @Test
    public void canNaturalOrderSortTasksByDate() {
        List<Task<Integer>> initialListTasksWithFiveElements = createListTasksWithFiveElements();
        initialListTasksWithFiveElements.forEach(task -> service.addTaskToList(task));

        List<Task<Integer>> expectedSortedListByDate = List.of(
                new Task<>(7, TaskStatus.DONE, TaskPriority.HIGH,
                        LocalDate.of(2025, 11, 9)),
                new Task<>(1, TaskStatus.IN_PROGRESS, TaskPriority.HIGH,
                        LocalDate.of(2025, 11, 15)),
                new Task<>(9, TaskStatus.IN_PROGRESS, TaskPriority.HIGH,
                        LocalDate.of(2025, 11, 17)),
                new Task<>(3, TaskStatus.IN_PROGRESS, TaskPriority.MEDIUM,
                        LocalDate.of(2025, 11, 29)),
                new Task<>(12, TaskStatus.TO_DO, TaskPriority.LOW,
                        LocalDate.of(2025, 11, 30))
        );

        Assertions.assertNotEquals(expectedSortedListByDate, initialListTasksWithFiveElements);
        Assertions.assertEquals(expectedSortedListByDate, service.sortTasksByNaturalOrder());
    }

    @Test
    public void canReversedOrderSortTasksByDate() {
        List<Task<Integer>> initialListTasksWithFiveElements = createListTasksWithFiveElements();
        initialListTasksWithFiveElements.forEach(task -> service.addTaskToList(task));

        List<Task<Integer>> expectedSortedListByDate = List.of(
                new Task<>(12, TaskStatus.TO_DO, TaskPriority.LOW,
                        LocalDate.of(2025, 11, 30)),
                new Task<>(3, TaskStatus.IN_PROGRESS, TaskPriority.MEDIUM,
                        LocalDate.of(2025, 11, 29)),
                new Task<>(9, TaskStatus.IN_PROGRESS, TaskPriority.HIGH,
                        LocalDate.of(2025, 11, 17)),
                new Task<>(1, TaskStatus.IN_PROGRESS, TaskPriority.HIGH,
                        LocalDate.of(2025, 11, 15)),
                new Task<>(7, TaskStatus.DONE, TaskPriority.HIGH,
                        LocalDate.of(2025, 11, 9))
        );

        Assertions.assertNotEquals(expectedSortedListByDate, initialListTasksWithFiveElements);
        Assertions.assertEquals(expectedSortedListByDate, service.sortTasksByReverseNOrder());
    }
}
