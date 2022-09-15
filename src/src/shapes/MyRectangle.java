package src.shapes;

import src.Shape;

import java.awt.*;

public class MyRectangle extends Shape {
    protected double width;
    protected double length;

    public MyRectangle() { }

    public MyRectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public MyRectangle(int x, int y, Color color, boolean filled, double width, double length) {
        super(x, y, color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return width * length * 2;
    }

    @Override
    public String toString() {
        return "MyRectangle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
