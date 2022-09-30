import javax.swing.*;
import java.awt.*;

public class ColorFontSelector {
    private JFrame frame;
    ColorFontSelector() {
        frame = new JFrame();
        JTextArea textArea = new JTextArea();
        textArea.setSelectionColor(Color.green);
        textArea.setBounds(0, 0, 100, 100);
        frame.add(textArea);
        frame.setSize(3000, 3000);
        frame.setVisible(true);
    }

}
