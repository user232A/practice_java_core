package practice_4.garden;

public class Main {
    public static void main(String[] args) {

        Plant cactus = new Cactus();
        Plant orchid = new Orchid();
        Garden garden = new Garden();

        garden.addPlant(cactus);
        garden.gardenCare();
    }
}
