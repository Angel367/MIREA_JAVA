public class Head {
    private boolean isHairy;
    private int eyesAmount;
    private double radius;

    public Head(boolean isHairy, int eyesAmount, double radius) {
        this.isHairy = isHairy;
        this.eyesAmount = eyesAmount;
        this.radius = radius;
    }

    public boolean isHairy() {
        return isHairy;
    }

    public void setHairy(boolean hairy) {
        isHairy = hairy;
    }

    public int getEyesAmount() {
        return eyesAmount;
    }

    public void setEyesAmount(int eyesAmount) {
        this.eyesAmount = eyesAmount;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Head{" +
                "isHairy=" + isHairy +
                ", eyesAmount=" + eyesAmount +
                ", radius=" + radius +
                '}';
    }
}
