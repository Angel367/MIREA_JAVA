package src;

import src.shapes.*;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.7, "green", true);
        System.out.println("Площадь: " + circle.getArea() + "\n" + circle);

        Square square = new Square(15.2, "purple", false);
        System.out.println("Периметр: " + square.getPerimeter() + "\n" + circle);

        Rectangle rectangle = new Rectangle(3.2, 7.1);
        System.out.println("Площадь: " + rectangle.getArea() + "\n" + circle);

    }
}
