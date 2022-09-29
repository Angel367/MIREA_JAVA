import javax.swing.*;
import java.awt.*;

public class Notepad {
    final JTextField input = new JTextField();
    private String[][] menuStr = new String[][]{{"Файл", "Сохранить"},{"Edit"}};

    Notepad() {
        JFrame frame = new JFrame("Дикий блокнот");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        GridLayout menu = new GridLayout(1, 3);
        JMenu jMenu = createMenuItems(menuStr);
        input.setBounds(20,20, 380,50);
        input.setFont(new Font("Serif", Font.PLAIN, 24));
        input.validate();
        input.setPreferredSize(new Dimension(240, input.getPreferredSize().height));
        frame.add(input);
        frame.setSize(435,280);
        frame.setLayout(menu);
        frame.setVisible(true);
    }
    private JMenu createMenuItems(final String[][] items)
    {
        // Создание выпадающего меню
        JMenu menu = new JMenu(items[0][0]);
        menu.setMnemonic(items[0][1].charAt(0));
        for (int i = 1; i < items.length; i++) {
            // пункт меню "Открыть"
            JMenuItem item = new JMenuItem(items[i][0]);
            menu.add(item);
        }
        return menu;
    }

}
