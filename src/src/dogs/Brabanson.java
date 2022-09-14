package src.dogs;

import src.Dog;

public class Brabanson extends Dog {

    public Brabanson(String nickname, String color, int weight, boolean sex, int age) {
        super(nickname, color, weight, sex, age);
        iq = 80;
    }

    @Override
    public void sayYourBreedAndName() {
        System.out.println("Мая парода - брабансон, а имя - " + nickname);   // Средний iq
    }

}
