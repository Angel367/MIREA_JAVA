package src.dogs;

import src.Dog;

public class Pug extends Dog {


    public Pug(String nickname, String color, int weight, boolean sex, int age) {
        super(nickname, color, weight, sex, age);
        iq = 65;
    }

    @Override
    public void sayYourBreedAndName() {
        System.out.println("Майя парода - мопсс, а иммя - " + nickname);   // низкий iq
    }

}
