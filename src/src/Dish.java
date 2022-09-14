package src;

public abstract class Dish {
    protected int weight;
    protected String color;
    protected boolean isClean;

    public Dish(int weight, String color, boolean isClean) {
        this.weight = weight;
        this.color = color;
        this.isClean = isClean;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    @Override
    public abstract String toString();
}
