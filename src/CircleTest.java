public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println("Радиус: " + circle.getRadius() +
                "\nДиаметр: " + circle.getDiameter() +
                "\nПлощадь: " + circle.getSquare() +
                "\nДлина: " + circle.getLength());

        Arm arm1 = new Arm(30, 5, false);
        Arm arm2 = new Arm(30, 5, false);
        Leg leg1 = new Leg(70, false, 5);
        Leg leg2 = new Leg(70, false, 5);
        Head head = new Head(false, 2, 15);
        Human human = new Human("Печкин", (byte)0, 180, 69, false, arm1, arm2, head, leg1, leg2);
        System.out.print(human);
    }
}
