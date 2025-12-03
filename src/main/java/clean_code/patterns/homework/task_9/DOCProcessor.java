package clean_code.patterns.homework.task_9;

public class DOCProcessor implements DocumentProcessor{

    private String text;

    public DOCProcessor(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public void process() {
        System.out.println("Document doc contains: " + text);
    }
}
