package shapes;

import java.awt.*;

public abstract class Shape {
    protected int x, y;
    protected Color color;
    protected boolean filled;

    public Shape () {}
    public Shape(int x, int y, Color color, boolean filled) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.filled = filled;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor() { return color; }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "shapes.Shape{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
