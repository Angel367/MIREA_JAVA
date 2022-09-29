import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;

public class Calc {
    final TextField input = new TextField();
    final JButton[] digits = new JButton[11];
    final Button[] operations = new Button[5];
    Calc() {
        JFrame frame = new JFrame("Калькулятор");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        input.setBounds(50,50, 250,20);
        /*Button b=new Button("Click Here");
        b.setBounds(50,100,60,30);
        b.setSize(100,50);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                input.setText("Добро пожаловать в мир Джава.");
            }
        });*/
        initializeElements(frame);
        digits[0].setBorder(new RoundedBorder(10));
        frame.add(input);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    private void initializeElements(JFrame frame) {
        for (int i = 0; i < 10; i++) {
            digits[i] = new JButton(Integer.toString(i));
            digits[i].setBorder(new RoundedBorder(10));
            frame.add(digits[i]);
        }
        digits[10] = new JButton(".");
        digits[10].setBorder(new RoundedBorder(10));
        frame.add(digits[10]);

        digits[0].setBounds(20, 300, 80, 25);
        digits[10].setBounds(120, 300, 80, 25);
    }
    private class RoundedBorder implements Border {
        private int radius;
        RoundedBorder(int radius) {
            this.radius = radius;
        }
        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
        }
        public boolean isBorderOpaque() {
            return true;
        }
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width-1, height-1, radius, radius);
        }
    }
}
