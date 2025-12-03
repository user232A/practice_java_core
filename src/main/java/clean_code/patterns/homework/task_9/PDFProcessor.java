package clean_code.patterns.homework.task_9;

public class PDFProcessor implements DocumentProcessor{

    private String text;

    public PDFProcessor(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public void process() {
        System.out.println("Document pdf contains: " + text);
    }
}
