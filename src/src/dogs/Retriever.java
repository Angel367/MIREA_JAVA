package src.dogs;

import src.Dog;

public class Retriever extends Dog {


    public Retriever(String nickname, String color, int weight, boolean sex, int age) {
        super(nickname, color, weight, sex, age);
        iq = 100;
    }

    @Override
    public void sayYourBreedAndName() {
        System.out.println("Моя порода - ретривер, а имя - " + nickname);   // Высокий iq
    }

}
