package practice_4.museum;

public class Manuscript extends Exhibit {

    public Manuscript(String name, String history) {
        super(name, history);
    }

    @Override
    public void exhibitCare() {
        System.out.println("Уход за экспонатом " + this.getName() + " требует контролируемой влажности");
    }
}
