package clean_code.complex_tasks.library;

public class BookProxy {

    private Book book;
    private String author;
    private String title = "title";
    private String description = "description";

    public BookProxy(String author) {
        this.author = author;
    }

    public BookProxy(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public BookProxy(String author, String title, String description) {
        this.author = author;
        this.title = title;
        this.description = description;
    }

    public void getContent() {
        if (book == null) {
            book = new Book.BookBuilder()
                    .setAuthor(author)
                    .setTitle(title)
                    .setDescription(description)
                    .build();
        }
        book.printInfo();
    }
}
