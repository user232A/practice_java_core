package practice_4.aquarium;

public class Main {
    public static void main(String[] args) {

        Shark shark = new Shark("White shark");
        SeaStar star = new SeaStar("Red star");
        Aquarium aquarium = new Aquarium();

        aquarium.addFish(star);
        aquarium.showInfo(shark);
        aquarium.addFish(shark);
        aquarium.getInfo();
        aquarium.showInfo(star);
    }
}
