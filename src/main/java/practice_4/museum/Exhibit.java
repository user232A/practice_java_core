package practice_4.museum;

public class Exhibit {

    private String name;
    private String history;

    public Exhibit(String name, String history) {
        this.name = name;
        this.history = history;
    }

    public String getName() {
        return name;
    }

    public String getHistory() {
        return history;
    }

    public void exhibitCare() {
        System.out.println("Уход за экспонатом");
    }
}
