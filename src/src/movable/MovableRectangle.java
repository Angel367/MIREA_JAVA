package src.movable;

import src.shapes.Rectangle;

public class MovableRectangle extends Rectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveUp() {
        topLeft.y++;
        bottomRight.y++;
    }

    @Override
    public void moveDown() {
        topLeft.y--;
        bottomRight.y--;
    }

    @Override
    public void moveLeft() {
        topLeft.x--;
        bottomRight.x--;
    }

    @Override
    public void moveRight() {
        topLeft.x++;
        bottomRight.x++;
    }
    public boolean isSpeedCorrect () {
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
    }
}
