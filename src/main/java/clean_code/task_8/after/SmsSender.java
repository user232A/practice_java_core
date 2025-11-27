package clean_code.task_8.after;

public class SmsSender implements ISender{

    @Override
    public void send(String message) {
        System.out.println("Отправка sms: " + message);
    }
}
