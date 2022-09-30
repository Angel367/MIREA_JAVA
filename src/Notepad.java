import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Notepad {
    JFrame jFrame = new JFrame("Дикий блокнот");
    public Notepad()
    {
        jFrame.setDefaultCloseOperation( EXIT_ON_CLOSE );
        JMenuBar menuBar = new JMenuBar();
        // Добавление в главное меню выпадающих пунктов меню
        menuBar.add(createFileMenu());
        menuBar.add(createEditMenu());
        menuBar.add(createHelpMenu());
        // Подключаем меню к интерфейсу приложения
        jFrame.setJMenuBar(menuBar);

        JButton button1 = new JButton("Кнопка 1");
        button1.setBounds(30, 10, 100, 20);
        button1.setBorder(new Calc.RoundedBorder(10));
        JButton button2 = new JButton("Кнопка 2");
        button2.setBounds(150, 10, 100, 20);
        button2.setBorder(new Calc.RoundedBorder(10));

        Container container = jFrame.getContentPane();
        GridBagConstraints c = new GridBagConstraints();

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridBagLayout());

        JButton button = new JButton("5");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 0;       //reset to default
        c.weighty = 1.0;   //request any extra vertical space
        c.anchor = GridBagConstraints.PAGE_END; //bottom of space
        c.insets = new Insets(10,0,0,0);  //top padding
        c.gridx = 1;       //aligned with button 2
        c.gridwidth = 2;   //2 columns wide
        c.gridy = 2;       //third row
        jPanel.add(button, c);
        jPanel.setBounds(100, 100, 3000, 3000);
        container.add(jPanel);

        jFrame.add(button1);
        jFrame.add(button2);
        jFrame.add(jPanel);
        jFrame.setLayout(null);
        jFrame.setSize(300, 200);jFrame.setVisible(true);

        jFrame.repaint();
        SwingUtilities.updateComponentTreeUI(jFrame);

    }

    private JMenu createFileMenu() {
        JMenu fileMenu = new JMenu("Файл");
        JMenuItem menuItemSave = new JMenuItem("Сохранить");
        JMenuItem menuItemExit = new JMenuItem(new ExitAction());
        fileMenu.add(menuItemSave);
        fileMenu.add(menuItemExit);

        return fileMenu;
    }
    private JMenu createEditMenu() {
        JMenu editMenu = new JMenu("Правка");
        JMenuItem menuItemCopy = new JMenuItem("Копировать");
        JMenuItem menuItemCut = new JMenuItem("Вырезать");
        JMenuItem menuItemPaste = new JMenuItem("Вставить");

        editMenu.add(menuItemCopy);
        editMenu.add(menuItemCut);
        editMenu.add(menuItemPaste);
        return editMenu;
    }
    private JMenu createHelpMenu() {
        return new JMenu("Справка");
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