package practice_4.park;

public class Park {

    public void addAttraction(Attraction attraction) {
        System.out.println(attraction.getName() + " добавлен в парк");
    }

    public void manage(Attraction attraction) {
        System.out.println(attraction.getName());
        attraction.check();
    }
}
