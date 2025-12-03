package clean_code.task_8.after;

public class NotificationService {

    private ISender sender;

    public NotificationService(ISender sender) {
        this.sender = sender;
    }

    public void sendNotification(String message) {
        sender.send(message);
    }
}
