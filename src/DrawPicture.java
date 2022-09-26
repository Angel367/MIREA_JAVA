import javax.swing.*;
import java.awt.*;

public class DrawPicture extends JPanel {
    private ImageIcon imageIcon;

    public DrawPicture(String path){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        imageIcon = new ImageIcon(path);
        frame.setSize(imageIcon.getIconWidth()+15, imageIcon.getIconHeight()+39);
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        imageIcon.paintIcon(this, g, 0,0);
    }
}
