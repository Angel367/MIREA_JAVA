package src;

public class ShapeTester {
    private Shape shape;
    ShapeTester (Shape shp) {
        shape = shp;
    }
    public void test () {
        System.out.println(shape.toString());
    }
}
