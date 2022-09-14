package src.movable;

import src.shapes.Circle;

public class MovableCircle extends Circle implements Movable {
    /*
    Непонятно, следовать методичке (и делать приватное поле radius), или указаниям из файла задания (и взять за
    основу существующий класс Circle). Было выбрано второе.
    */
    private MovablePoint center;

    public MovableCircle(double radius, int x, int y, int xSpeed, int ySpeed) {
        super(radius);
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
    public void moveUp() { center.y++; }
    public void moveDown() { center.y--; }
    public void moveLeft() { center.x--; }
    public void moveRight() { center.x++; }
}
