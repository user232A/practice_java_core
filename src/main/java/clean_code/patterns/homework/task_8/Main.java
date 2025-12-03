package clean_code.patterns.homework.task_8;

public class Main {
    public static void main(String[] args) {

        Character character1 = new Character.CharacterBuilder()
                .setHealth(5)
                .setDamage(7)
                .build();

        Character character2 = new Character.CharacterBuilder()
                .setArmor(8)
                .setMagic(6)
                .setHealth(9)
                .setDamage(4)
                .build();

        System.out.println(character1);
        System.out.println(character2);

    }
}
