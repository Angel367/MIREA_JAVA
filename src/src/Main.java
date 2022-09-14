package src;

import src.dogs.Brabanson;
import src.dogs.Retriever;

public class Main {
    public static void main(String[] args) {
        Brabanson Taya = new Brabanson("Тая", "Рыжий", 7, false, 2);
        Brabanson Medynitsa = new Brabanson("Медуница", "Конопатый", 6, false, 2);

        Retriever Albus = new Retriever("Альбус", "Золотистый", 30, true, 7);

        Medynitsa.setWeight(8);

        System.out.println(Taya);
        System.out.println(Medynitsa);
        System.out.println(Albus);

        FurnitureShop furnitureShop = new FurnitureShop();
        furnitureShop.openShift();



    }
}
