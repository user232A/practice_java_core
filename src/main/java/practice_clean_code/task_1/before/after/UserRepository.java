package practice_clean_code.task_1.before.after;

import java.util.List;

public class UserRepository {

    private List<User> users;

    public UserRepository(List<User> list) {
        this.users = list;
    }

    public User findUser(String name){
        System.out.println("We are trying find usr: " + name);
        return users.stream().filter(user -> user.getUsername().equals(name)).findFirst().get();
    }
}
