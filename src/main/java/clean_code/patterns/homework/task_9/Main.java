package clean_code.patterns.homework.task_9;

public class Main {
    public static void main(String[] args) {

        DocumentAdapter adapter = new DocumentAdapter();

        PDFProcessor pdf = adapter.convertDocToPdf(new DOCProcessor("home"));
        pdf.process();

        DOCProcessor doc = adapter.convertPdfToDoc(new PDFProcessor("apple"));
        doc.process();

    }
}
