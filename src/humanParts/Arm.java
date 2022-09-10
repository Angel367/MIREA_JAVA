package src.humanParts;

public class Arm {
    private int length;
    private int amountOfFingers;
    private boolean isHairy;

    public Arm(int length, int amountOfFingers, boolean isHairy) {
        this.length = length;
        this.amountOfFingers = amountOfFingers;
        this.isHairy = isHairy;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getAmountOfFingers() {
        return amountOfFingers;
    }

    public void setAmountOfFingers(int amountOfFingers) {
        this.amountOfFingers = amountOfFingers;
    }

    public boolean isHairy() {
        return isHairy;
    }

    public void setHairy(boolean hairy) {
        isHairy = hairy;
    }

    public String toString() {
        return "Arm{" +
                "length=" + length +
                ", amountOfFingers=" + amountOfFingers +
                ", isHairy=" + isHairy +
                '}';
    }
}
