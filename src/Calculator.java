import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    private JTextField display;
    private double num1, num2, result;
    private String operator;

    public Calculator() {
        // Create the GUI components
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 300);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4));

        display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "%", "+",
                "C", "="
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent event) {
        String label = event.getActionCommand();

        if (label.equals("C")) {
            num1 = 0;
            num2 = 0;
            result = 0;
            operator = "";
            display.setText("");
        } else if (label.equals("=")) {
            num2 = Double.parseDouble(display.getText());
            if (operator.equals("+")) {
                result = num1 + num2;
            } else if (operator.equals("-")) {
                result = num1 - num2;
            } else if (operator.equals("*")) {
                result = num1 * num2;
            } else if (operator.equals("/")) {
                result = num1 / num2;
            } else if (operator.equals("%")) {
                result = num1 % num2;
            }
            display.setText(String.valueOf(result));
        } else if (label.equals("+") || label.equals("-") || label.equals("*") || label.equals("/") || label.equals("%")) {
            num1 = Double.parseDouble(display.getText());
            operator = label;
            display.setText("");
        } else {
            display.setText(display.getText() + label);
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.setVisible(true);
    }
}
