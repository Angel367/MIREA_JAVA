package src;

import src.movable.Movable;
import src.movable.MovableCircle;
import src.movable.MovablePoint;
import src.shapes.*;

public class Main {
    public static void main(String[] args) {
        Movable movable = new MovableCircle(3, 0, 0, 1, 1);
        System.out.println(movable);

    }
}
