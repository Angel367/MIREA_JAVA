package src.furniture;

import src.Furniture;

public class Chair extends Furniture {
    boolean isFolding;

    public Chair(String material, int age, boolean isFlammable, boolean isDamaged, boolean isFolding) {
        super(material, age, isFlammable, isDamaged);
        this.isFolding = isFolding;
    }

    public boolean isFolding() {
        return isFolding;
    }

    public void setFolding(boolean folding) {
        isFolding = folding;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "material='" + material + '\'' +
                ", age=" + age +
                ", isFlammable=" + isFlammable +
                ", isDamaged=" + isDamaged +
                ", isFolding=" + isFolding +
                '}';
    }
}
