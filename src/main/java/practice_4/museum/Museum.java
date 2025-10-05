package practice_4.museum;

public class Museum {

    public void addExhibit(Exhibit exhibit) {
        System.out.println(exhibit.getName() + " добавлен в музей");
    }

    public void getInfo(Exhibit exhibit) {
        System.out.println("Название экспоната " + exhibit.getName());
        System.out.println("История экспоната " + exhibit.getHistory());
    }
}
