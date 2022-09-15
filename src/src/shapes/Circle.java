package src.shapes;

import src.Shape;

import java.awt.*;

public class Circle extends Shape {
    protected double radius;

    public Circle() { }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(int x, int y, Color color, boolean filled, double radius) {
        super(x, y, color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", radius=" + radius +
                '}';
    }
    public void draw(Graphics g) {
        g.drawOval(x, y, (int)radius, (int)radius);
    }
}
