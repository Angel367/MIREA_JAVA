import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc {
    final JTextField input = new JTextField();
    final JButton[] digits = new JButton[11];
    final JButton[] operations = new JButton[4];
    Calc() {
        JFrame frame = new JFrame("Дикий калькулятор");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        input.setBounds(20,20, 380,50);
        input.setFont(new Font("Serif", Font.PLAIN, 24));
        input.validate();
        input.setPreferredSize(new Dimension(240, input.getPreferredSize().height));
        initializeElements(frame);
        digits[0].setBorder(new RoundedBorder(10));
        frame.add(input);
        frame.setSize(435,280);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    private void initializeElements(JFrame frame) {
        ActionListener[] digitsAL = new ActionListener[10];
        for (int i = 0; i < 10; i++) {
            digits[i] = new JButton(Integer.toString(i));
            digits[i].setBorder(new RoundedBorder(10));
            int i1 = i;
            digitsAL[i] = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    input.setText(input.getText() + i1);
                }
            };
            digits[i].addActionListener(digitsAL[i]);
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
        digits[10].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + ".");
            }
        });

        initializeOperations(frame);

        JButton equalButton = new JButton("=");
        equalButton.setBorder(new RoundedBorder(10));
        frame.add(equalButton);
        equalButton.setBounds(220, 200, 80, 25);
        equalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currStr = stringHandler(input.getText());
                if (currStr.isEmpty() || currStr.charAt(currStr.length()-1) < '0' ||
                        currStr.charAt(currStr.length()-1) > '9') {
                    JOptionPane.showMessageDialog(null, "Так нельзя!");
                    input.setText("");
                }
                else
                    input.setText(currStr);
            }
        });

    }
    private void initializeOperations(Frame frame) {
        String[] operationChars = new String[]{"/", "*", "-", "+"};
        for (int i = 0; i < 4; i++) {
            operations[i] = new JButton(operationChars[i]);
            operations[i].setBorder(new RoundedBorder(10));
            frame.add(operations[i]);
        }

        operations[1].setBounds(320, 120, 80, 25);
        operations[2].setBounds(320, 160, 80, 25);
        operations[3].setBounds(320, 200, 80, 25);

        operations[0].setBounds(320, 80, 80, 25);
        operations[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currStr = stringHandler(input.getText());
                if (currStr.isEmpty() || currStr.charAt(currStr.length()-1) < '0' ||
                        currStr.charAt(currStr.length()-1) > '9') {
                    JOptionPane.showMessageDialog(null, "Так нельзя!");
                    input.setText("");
                }
                else
                    input.setText(currStr + "/");
            }
        });
        operations[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currStr = stringHandler(input.getText());
                if (currStr.isEmpty() || currStr.charAt(currStr.length()-1) < '0' ||
                        currStr.charAt(currStr.length()-1) > '9') {
                    JOptionPane.showMessageDialog(null, "Так нельзя!");
                    input.setText("");
                }
                else
                    input.setText(currStr + "*");
            }
        });
        operations[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currStr = stringHandler(input.getText());
                if (currStr.isEmpty()) {
                    input.setText("-");
                    return;
                }
                if (currStr.charAt(currStr.length()-1) < '0' ||
                        currStr.charAt(currStr.length()-1) > '9') {
                    JOptionPane.showMessageDialog(null, "Так нельзя!");
                    input.setText("");
                }
                else
                    input.setText(currStr + "-");
            }
        });
        operations[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currStr = stringHandler(input.getText());
                if (currStr.isEmpty() || currStr.charAt(currStr.length()-1) < '0' ||
                        currStr.charAt(currStr.length()-1) > '9') {
                    JOptionPane.showMessageDialog(null, "Так нельзя!");
                    input.setText("");
                }
                else
                    input.setText(currStr + "+");
            }
        });
    }
    public static class RoundedBorder implements Border {
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
    String stringHandler (String currStr) {
        StringBuilder firstNumberStr = new StringBuilder(), secondNumberStr = new StringBuilder();
        String result;
        double firstNumber, secondNumber;
        boolean firstNumberFinished = false, firstNumIsNegative = false;
        char op = '0';
        if (currStr.length() < 3) return currStr;
        if (currStr.charAt(0) == '-') {
            firstNumIsNegative = true;
            currStr = currStr.substring(1);
        }

        for (int i = 0; i < currStr.length(); i++) {
            char currChar = currStr.charAt(i);
            if (currChar == '+' || currChar == '-' || currChar == '*' || currChar == '/') {
                op = currChar;
                firstNumberFinished = true;
            }
            else if (!firstNumberFinished)
                firstNumberStr.append(currChar);
            else
                secondNumberStr.append(currChar);
        }
        if (firstNumberStr.isEmpty() || secondNumberStr.isEmpty()) {
            if (firstNumIsNegative) return "-" + currStr;
            else return currStr;
        }
        try {
            firstNumber = Double.parseDouble(firstNumberStr.toString().replace(',', '.'));
            secondNumber = Double.parseDouble(secondNumberStr.toString().replace(',', '.'));
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Шаманство с точками осуждаю");
            return "";
        }
        if (firstNumIsNegative) firstNumber *= -1;

        switch (op) {
            case '+':
                result = String.format("%.2f", firstNumber + secondNumber);
                break;
            case '-':
                result = String.format("%.2f", firstNumber - secondNumber);
                break;
            case '/':
                result = String.format("%.2f", firstNumber / secondNumber);
                break;
            case '*':
                result = String.format("%.2f", firstNumber * secondNumber);
                break;
            default:
                return currStr;
        }
        return result;
    }
}
