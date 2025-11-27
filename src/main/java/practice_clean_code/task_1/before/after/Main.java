package practice_clean_code.task_1.before.after;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> userList = new ArrayList<>(){{
            add(new User("Tom", "tom@gmail.com"));
            add(new User("Jim", "jim@gmail.com"));
            add(new User("Bob", "bob@gmail.com"));
            add(new User("Sam", "sam@gmail.com"));
            add(new User("Dan", "dan@gmail.com"));
            add(new User("Paul", "paul@gmail.com"));
        }};

        UserRepository userRepository = new UserRepository(userList);
        TaskRepository taskRepository = new TaskRepository();

        Project project = new Project(userRepository, taskRepository);

        project.addTask(new Task("clean", "please", LocalDate.of(2025, 11, 27)));
        project.assignTaskToUser("clean", "Sam");

    }
}
