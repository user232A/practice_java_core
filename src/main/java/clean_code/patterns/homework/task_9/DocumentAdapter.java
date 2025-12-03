package clean_code.patterns.homework.task_9;

public class DocumentAdapter {

    public PDFProcessor convertDocToPdf(DOCProcessor docFile){
        return new PDFProcessor(docFile.getText());
    }

    public DOCProcessor convertPdfToDoc(PDFProcessor pdfFile){
        return new DOCProcessor(pdfFile.getText());
    }
}
