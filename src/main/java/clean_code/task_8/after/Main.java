package clean_code.task_8.after;

public class Main {

    public static void main(String[] args) {

        NotificationService service1 = new NotificationService(new EmailSender());
        NotificationService service2 = new NotificationService(new SmsSender());

        service1.sendNotification("test email");
        service2.sendNotification("sms test");
    }
}
