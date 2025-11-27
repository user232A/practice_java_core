package clean_code.task_8.before;

public class NotificationService {

    private EmailSender emailSender = new EmailSender();

    public void sendNotification(String message) {
        emailSender.sendEmail(message);
    }
}

class EmailSender {
    public void sendEmail(String message) {
        System.out.println("Отправка email: " + message);
    }
}
