package src;

public class Main {
    public static void main(String[] args) {
        DrawShapes drawShapes = new DrawShapes();
        drawShapes.addRandomShapes(20);
        DrawPicture imagePanel = new DrawPicture(args[0]);
        DrawPicture imagePanel2 = new DrawPicture("SHREK.gif");
    }
}
