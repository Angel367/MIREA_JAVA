public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return 2.0 * radius;
    }
    public double getSquare() {
        return Math.PI * radius * radius;
    }
    public double getLength() {
        return 2.0 * Math.PI * radius;
    }
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
