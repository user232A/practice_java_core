package clean_code.task_8.after;

public class Main {

    public static void main(String[] args) {

        NotificationService service = new NotificationService();
        service.sendNotification(new EmailSender(), "test email");
        service.sendNotification(new SmsSender(), "sms test");
    }
}
