package humanParts;

public class Leg {
    private int length;
    private boolean isHairy;
    private int amountOfFingers;

    public Leg(int length, boolean isHairy, int amountOfFingers) {
        this.length = length;
        this.isHairy = isHairy;
        this.amountOfFingers = amountOfFingers;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isHairy() {
        return isHairy;
    }

    public void setHairy(boolean hairy) {
        isHairy = hairy;
    }

    public int getAmountOfFingers() {
        return amountOfFingers;
    }

    public void setAmountOfFingers(int amountOfFingers) {
        this.amountOfFingers = amountOfFingers;
    }

    @Override
    public String toString() {
        return "humanParts.Leg{" +
                "length=" + length +
                ", isHairy=" + isHairy +
                ", amountOfFingers=" + amountOfFingers +
                '}';
    }
}
