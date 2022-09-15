package src;

import src.shapes.*;

import java.awt.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DrawShapes drawShapes = new DrawShapes();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int shapeNum = random.nextInt(3);

            if (shapeNum == 0)    // Circle
                drawShapes.addCircle(new Circle(random.nextInt(1000), random.nextInt(600),
                        new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)),
                                random.nextBoolean(), random.nextInt(200)));

            else if (shapeNum == 1)    // MyRectangle
                drawShapes.addMyRectangle(new MyRectangle(random.nextInt(1000), random.nextInt(600),
                        new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)),
                        random.nextBoolean(), random.nextInt(200), random.nextInt(200)));


            else {   // Square
                int side = random.nextInt(200);
                drawShapes.addSquare(new Square(random.nextInt(1000), random.nextInt(600),
                        new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)),
                        random.nextBoolean(), side, side));
            }
        }
        DrawPicture imagePanel = new DrawPicture(args[0]);
        DrawPicture imagePanel2 = new DrawPicture("SHREK.gif");
    }
}
