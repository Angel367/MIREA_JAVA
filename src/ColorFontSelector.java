import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorFontSelector {
    private JFrame frame;
    JTextArea textArea;
    ColorFontSelector() {
        JMenuBar menuBar = new JMenuBar();
        createColorMenu();
        // Добавление в главное меню выпадающих пунктов меню
        menuBar.add(createColorMenu());
        menuBar.add(createEditMenu());
        frame = new JFrame();
        textArea = new JTextArea();
        textArea.setBounds(0, 0, 100, 100);
        frame.add(menuBar);
        frame.add(textArea);
        frame.setSize(3000, 3000);
        frame.setVisible(true);
    }
    private JMenu createColorMenu() {
        JMenu fileMenu = new JMenu("Файл");
        JMenuItem menuItemBlackColor = new JMenuItem("Чёрный");
        menuItemBlackColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.select(0, textArea.getText().length()-1);
                textArea.setSelectedTextColor(Color.green);
            }
        });
        JMenuItem menuItemBlueColor = new JMenuItem("Синий");
        JMenuItem menuItemRedColor = new JMenuItem("Красный");

       // fileMenu.add(menuItemSave);
        //fileMenu.add(menuItemExit);

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

    class ExitAction extends AbstractAction {
        ExitAction() {
            putValue(NAME, "Выход");
        }
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

}
