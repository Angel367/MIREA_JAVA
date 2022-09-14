package src;

import src.movable.Movable;
import src.movable.MovableCircle;
import src.movable.MovablePoint;
import src.movable.MovableRectangle;
import src.shapes.*;

public class Main {
    public static void main(String[] args) {
        Movable movable = new MovableRectangle(1, 1, 3, 3, 2, 3);
        System.out.println(movable);

    }
}
