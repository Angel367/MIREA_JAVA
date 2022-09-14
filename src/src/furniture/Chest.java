package src.furniture;

import src.Furniture;

public class Chest extends Furniture {
    public Chest(String material, int age, boolean isFlammable, boolean isDamaged) {
        super(material, age, isFlammable, isDamaged);
    }

    @Override
    public String toString() {
        return "Chest{" +
                "material='" + material + '\'' +
                ", age=" + age +
                ", isFlammable=" + isFlammable +
                ", isDamaged=" + isDamaged +
                '}';
    }
}
