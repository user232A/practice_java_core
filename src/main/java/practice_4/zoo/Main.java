package practice_4.zoo;

public class Main {
    public static void main(String[] args) {
        Animal bird = new Bird();
        Animal elephant = new Elephant();
        Zoo zoo = new Zoo();

        bird.setName("Чижик");
        elephant.setName("Вася");

        zoo.addAnimal(bird);
        zoo.addAnimal(elephant);

        zoo.showAllAnimal();
        zoo.demonstration(bird);
        zoo.demonstration(elephant);
    }
}
