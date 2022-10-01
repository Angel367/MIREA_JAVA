import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ColorFontSelector {
    private JFrame frame;
    private final Font twr = new Font("Times New Roman", Font.PLAIN, 24);
    private final Font mss = new Font("MS Sans Serif", Font.PLAIN, 24);
    private final Font cn = new Font("Courier New", Font.PLAIN, 24);
    JTextArea textArea;
    ColorFontSelector() {
        JMenuBar menuBar = new JMenuBar();
        createColorsMenu();
        // Добавление в главное меню выпадающих пунктов меню
        menuBar.add(createColorsMenu());
        menuBar.add(createFontMenu());

        frame = new JFrame();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        textArea = new JTextArea();
        textArea.setBounds(0, 0, 100, 100);
        textArea.setFont(twr);
        frame.setJMenuBar(menuBar);
        frame.add(textArea);
        frame.setSize(3000, 3000);
        frame.setVisible(true);
    }
    private JMenu createColorsMenu() {
        JMenu fileMenu = new JMenu("Файл");
        JMenuItem menuItemBlack = new JMenuItem(new AbstractAction("Чёрный") {
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLACK);
            }
        });
        JMenuItem menuItemBlue = new JMenuItem(new AbstractAction("Синий") {
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLUE);
            }
        });
        JMenuItem menuItemRed = new JMenuItem(new AbstractAction("Красный") {
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.RED);
            }
        });


        fileMenu.add(menuItemBlack);
        fileMenu.add(menuItemBlue);
        fileMenu.add(menuItemRed);

        return fileMenu;
    }
    private JMenu createFontMenu() {
        JMenu editMenu = new JMenu("Шрифт");

        JMenuItem menuItemTWR = new JMenuItem(new AbstractAction("Times New Roman") {
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(twr);
            }
        });
        JMenuItem menuItemMSS = new JMenuItem(new AbstractAction("MS Sans Serif") {
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(mss);
            }
        });
        JMenuItem menuItemCN = new JMenuItem(new AbstractAction("Courier New") {
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(cn);
            }
        });
        JMenuItem menuItemPaste = new JMenuItem("Courier New");

        editMenu.add(menuItemTWR);
        editMenu.add(menuItemMSS);
        editMenu.add(menuItemCN);
        return editMenu;
    }

    class ExitAction extends AbstractAction {
        ExitAction() {
            putValue(NAME, "Выход");
        }
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

}
