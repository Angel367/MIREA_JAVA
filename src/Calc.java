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
        input.setBounds(50,30, 250,20);
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

        digits[0].setBounds(20, 200, 80, 25);
        digits[1].setBounds(20, 160, 80, 25);
        digits[2].setBounds(120, 160, 80, 25);
        digits[3].setBounds(220, 160, 80, 25);
        digits[4].setBounds(20, 120, 80, 25);
        digits[5].setBounds(120, 120, 80, 25);
        digits[6].setBounds(220, 120, 80, 25);
        digits[7].setBounds(20, 80, 80, 25);
        digits[8].setBounds(120, 80, 80, 25);
        digits[9].setBounds(220, 80, 80, 25);
        digits[10].setBounds(120, 200, 80, 25);
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
