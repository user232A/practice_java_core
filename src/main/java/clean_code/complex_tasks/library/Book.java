package clean_code.complex_tasks.library;

public class Book {

    private String author;
    private String title;
    private String description;

    public Book(String author, String title, String description) {
        this.author = author;
        this.title = title;
        this.description = description;
    }

    public Book(BookBuilder builder) {
        this.author = builder.author;
        this.title = builder.title;
        this.description = builder.description;
    }

    public void printInfo() {
        System.out.println("Author: " + this.author + "\n" + "Title: " + this.title + "\n" +
                "Description: " + this.description);
    }

    static class BookBuilder {

        private String author;
        private String title;
        private String description;

        public BookBuilder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public BookBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
