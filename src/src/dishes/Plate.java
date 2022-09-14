package src.dishes;

import src.Dish;

public class Plate extends Dish {
    public String size;

    public Plate(int weight, String color, boolean isClean, String size) {
        super(weight, color, isClean);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "size='" + size + '\'' +
                '}';
    }
}
