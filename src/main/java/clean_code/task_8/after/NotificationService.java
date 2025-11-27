package clean_code.task_8.after;

public class NotificationService {

    public void sendNotification(ISender sender, String message) {
        sender.send(message);
    }
}
