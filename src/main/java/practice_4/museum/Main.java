package practice_4.museum;

public class Main {
    public static void main(String[] args) {

        Manuscript manuscript = new Manuscript("Papirus", "IV");
        Sculpture sculpture = new Sculpture("Venera", "II");
        Museum museum = new Museum();

        museum.addExhibit(sculpture);
        museum.getInfo(sculpture);
    }
}
