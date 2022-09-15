package src;

import src.shapes.Circle;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawShapes extends JPanel {
    private ArrayList<Circle> circles = new ArrayList<>();

    public DrawShapes(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setSize(1280, 720);
        frame.setVisible(true);
        circles.add(new Circle(3, 4, "Green", true, 50));

    }

    @Override
    public void paintComponent(Graphics g) {
        this.setBackground(Color.WHITE);

        g.setColor(Color.MAGENTA);
        g.drawRect(3, 2, 500, 300);
        circles.get(0).draw(g);
    }


}
