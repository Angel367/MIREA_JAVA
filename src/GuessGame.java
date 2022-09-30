import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessGame {
    private int attemptCount;
    JTextPane textArea;
    JFrame frame;
    GuessGame() {
        attemptCount = 0;
        frame = new JFrame("Угадайка");
        initializeFrame(frame);
        addTextArea();
        addJLabel();
        addButton();
    }
    private void initializeFrame(JFrame frame) {
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(300, 150);
        frame.setVisible(true);
    }
    private void addJLabel() {
        JLabel jLabel = new JLabel("Введите число от 0 до 20:");
        jLabel.setBounds(5, 5, 165, 15);
        frame.add(jLabel);
    }
    private void addTextArea() {
        textArea = new JTextPane();
        textArea.setBounds(170, 5, 50, 20);
        StyledDocument documentStyle = textArea.getStyledDocument();
        SimpleAttributeSet centerAttribute = new SimpleAttributeSet();
        StyleConstants.setAlignment(centerAttribute, StyleConstants.ALIGN_CENTER);
        documentStyle.setParagraphAttributes(0, documentStyle.getLength(), centerAttribute, false);
        frame.add(textArea);
    }
    private void addButton() {
        JButton jButton = new JButton("Угадай!");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                attemptCount += 1;
                int inputNum = stringHandler(textArea.getText());
                if (inputNum == -1)
            }
        });
    }
    private int stringHandler(String inputString) {
        int result;
        try {
            result = Integer.parseInt(inputString);
        } catch (NumberFormatException e) {
            return -1;
        }
        return result;
    }

}
