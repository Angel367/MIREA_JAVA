import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Board {

     Board() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(250, 250);
        // Панель содержимого
        Container container = frame.getContentPane();
        /*
        *  Размещаем в панели компоненты
        *  В качестве параметров можно использовать
        *  строки и константы класса BorderLayout
        */
        JLabel north = new JLabel("Север");
        north.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        north.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseEntered(MouseEvent e) {
              JOptionPane.showMessageDialog(null, "Добро пожаловать в САО");
           }
        });
        container.add(north, BorderLayout.NORTH);

        JLabel south = new JLabel("Юг");
        south.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 2));
        south.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseEntered(MouseEvent e) {
              JOptionPane.showMessageDialog(null, "Добро пожаловать в ЮАО");
           }
        });
        container.add(south, BorderLayout.SOUTH);

        JLabel west = new JLabel("Запад");
        west.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 2));
        west.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseEntered(MouseEvent e) {
              JOptionPane.showMessageDialog(null, "Добро пожаловать в ЗАО!");
           }
        });
        container.add(west, BorderLayout.WEST);

        JLabel east = new JLabel("Восток");
        east.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
        east.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseEntered(MouseEvent e) {
              JOptionPane.showMessageDialog(null, "Добро пожаловать в ВАО");
           }
        });
        container.add(east, BorderLayout.EAST);
        // При отсутствии 2-го параметра компонент размещается в центре
        JLabel center = new JLabel("Центр");
        center.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
        center.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseEntered(MouseEvent e) {
              JOptionPane.showMessageDialog(null, "Добро пожаловать в ЦАО");
           }
        });
        container.add(center, BorderLayout.CENTER);
        // Открываем окно
        frame.setVisible(true);
    }

}
