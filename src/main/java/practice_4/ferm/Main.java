package practice_4.ferm;

public class Main {
    public static void main(String[] args) {

        Animal cow = new Cow();
        Animal chicken = new Chicken();
        Ferm ferm = new Ferm();

        ferm.addAnimal(cow);
        ferm.manageAnimal();

        //ferm.addAnimal(chicken);
        //ferm.manageAnimal();
    }
}
