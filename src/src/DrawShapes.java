package src;

import src.shapes.Circle;
import src.shapes.MyRectangle;
import src.shapes.Square;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class DrawShapes extends JPanel {
    private ArrayList<Circle> circles = new ArrayList<>();
    private ArrayList<MyRectangle> rectangles = new ArrayList<>();
    private ArrayList<Square> squares = new ArrayList<>();
    private ImageIcon imageIcon;

    public DrawShapes(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setSize(1280, 720);
        frame.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        this.setBackground(Color.WHITE);
        for (Circle circle : circles) {
            g.setColor(circle.getColor());
            if (circle.isFilled())
                g.fillOval(circle.getX(), circle.getY(), (int) circle.getRadius()/2+1,
                        (int) circle.getRadius()/2+1);
            else
                g.drawOval(circle.getX(), circle.getY(), (int) circle.getRadius()/2,
                        (int) circle.getRadius()/2);
        }
        for (MyRectangle myRectangle : rectangles) {
            g.setColor(myRectangle.color);
            if (myRectangle.isFilled())
                g.fillRect(myRectangle.getX(), myRectangle.getY(), (int) myRectangle.getWidth()+1,
                        (int) myRectangle.getLength()+1);
            else
                g.drawRect(myRectangle.getX(), myRectangle.getY(), (int) myRectangle.getWidth(),
                        (int) myRectangle.getLength());
        }
        for (Square square : squares) {
            g.setColor(square.getColor());
            if (square.isFilled())
                g.fillRect(square.getX(), square.getY(), (int) square.getSide()+1,
                        (int) square.getSide()+1);
            else
                g.drawRect(square.getX(), square.getY(), (int) square.getSide(), (int) square.getSide());
        }

        JLabel jLabel = new JLabel();
        jLabel.setIcon(imageIcon);
        jLabel.setPreferredSize(new Dimension(imageIcon.getIconWidth(), imageIcon.getIconHeight()));

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

    public void addImage (String path) {
        imageIcon = new ImageIcon(path);
    }

}
