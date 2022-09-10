package src;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.print("Радиус: " + circle.getRadius() +
                "\nДиаметр: " + circle.getDiameter() +
                "\nПлощадь: " + circle.getSquare() +
                "\nДлина: " + circle.getLength());
    }
}
