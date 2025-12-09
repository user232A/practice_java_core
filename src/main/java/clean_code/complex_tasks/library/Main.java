package clean_code.complex_tasks.library;

public class Main {
    public static void main(String[] args) {

        BookProxy proxy1 = new BookProxy("Михаил Булгаков", "Мастер и Маргарита");
        BookProxy proxy2 = new BookProxy("Дуглас Адамс", "Автостопом по галактике",
                "Юмористическая фантастика о приключениях землянина в космосе");

        proxy1.getContent();
        System.out.println();

        proxy2.getContent();
    }
}
