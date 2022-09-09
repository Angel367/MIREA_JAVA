package src;

import java.util.ArrayList;

public class DogKennel {
    private ArrayList<Dog> dogArrayList = new ArrayList<Dog>();
    public void addDog (Dog dog) {
        dogArrayList.add(dog);
    }
    public void showKennel () {
        for (Dog dog : dogArrayList)
            System.out.println(dog);
    }
}
