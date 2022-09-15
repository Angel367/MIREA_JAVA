package src.shapes;

public class Square extends Rectangle{
    public Square() {}

    public Square(double width, double length) {
        super(width, length);
    }

    public Square(int x, int y, String color, boolean filled, double width, double length) {
        super(x, y, color, filled, width, length);
    }

    public Square(double side) {
        this.length = side;
        this.width = side;
    }

    public double getSide() {
        return this.length;
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setWidth(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", side=" + width +
                '}';
    }
}
