package practice_4.museum;

import java.util.List;

public class Sculpture extends Exhibit {

    public Sculpture(String name, String history) {
        super(name, history);
    }

    @Override
    public void exhibitCare() {
        System.out.println("Уход за экспонатом " + this.getName() + " нуждается в реставрации");
    }
}
