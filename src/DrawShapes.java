import shapes.*;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class DrawShapes extends JPanel {
    private ArrayList<Circle> circles = new ArrayList<>();
    private ArrayList<MyRectangle> rectangles = new ArrayList<>();
    private ArrayList<Square> squares = new ArrayList<>();

    public DrawShapes(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setSize(1280, 720);
        frame.setVisible(true);
        JButton jButton = new JButton("Добавить фигуру!");
        jButton.setSize(200, 30);
        jButton.setLocation(10,10);
        jButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addRandomShapes(1);
                repaint();
            }
        });
        this.add(jButton);
    }

    @Override
    protected void paintComponent(Graphics g) {
        this.setBackground(Color.WHITE);
        for (Circle circle : circles) {
            g.setColor(circle.getColor());
            if (circle.isFilled())
                g.fillOval(circle.getX()+50, circle.getY(), (int) circle.getRadius()/2+1,
                        (int) circle.getRadius()/2+1);
            else
                g.drawOval(circle.getX()+50, circle.getY(), (int) circle.getRadius()/2,
                        (int) circle.getRadius()/2);
        }
        for (MyRectangle myRectangle : rectangles) {
            g.setColor(myRectangle.getColor());
            if (myRectangle.isFilled())
                g.fillRect(myRectangle.getX()+50, myRectangle.getY(), (int) myRectangle.getWidth()+1,
                        (int) myRectangle.getLength()+1);
            else
                g.drawRect(myRectangle.getX()+50, myRectangle.getY(), (int) myRectangle.getWidth(),
                        (int) myRectangle.getLength());
        }
        for (Square square : squares) {
            g.setColor(square.getColor());
            if (square.isFilled())
                g.fillRect(square.getX()+50, square.getY(), (int) square.getSide()+1,
                        (int) square.getSide()+1);
            else
                g.drawRect(square.getX()+50, square.getY(), (int) square.getSide(), (int) square.getSide());
        }


    }
    public void addCircle (Circle newCircle) {
        this.circles.add(newCircle);
    }

    public void addMyRectangle (MyRectangle myRectangle) {
        this.rectangles.add(myRectangle);
    }

    public void addSquare (Square square) {
        this.squares.add(square);
    }

    public void addRandomShapes (int amount) {
        Random random = new Random();
        for (int i = 0; i < amount; i++) {
            int shapeNum = random.nextInt(3);

            if (shapeNum == 0)    // Circle
                this.addCircle(new Circle(random.nextInt(1000), random.nextInt(600),
                        new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)),
                        random.nextBoolean(), random.nextInt(200)));

            else if (shapeNum == 1)    // MyRectangle
                this.addMyRectangle(new MyRectangle(random.nextInt(1000), random.nextInt(600),
                        new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)),
                        random.nextBoolean(), random.nextInt(200), random.nextInt(200)));


            else {   // Square
                int side = random.nextInt(200);
                this.addSquare(new Square(random.nextInt(1000), random.nextInt(600),
                        new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)),
                        random.nextBoolean(), side, side));
            }
        }
    }

}
