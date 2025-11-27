package clean_code.task_8.after;

public class EmailSender implements ISender{

    @Override
    public void send(String message) {
        System.out.println("Отправка email: " + message);
    }
}
