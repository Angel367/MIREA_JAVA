package src.dishes;

import src.Dish;

public class Cup extends Dish {
    protected int volume;

    public Cup(int weight, String color, boolean isClean, int volume) {
        super(weight, color, isClean);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", isClean=" + isClean +
                ", volume=" + volume +
                '}';
    }
}
