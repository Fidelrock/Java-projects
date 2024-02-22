import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KeyPadApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Keypad");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JTextField textField = new JTextField();
        textField.setHorizontalAlignment(JTextField.RIGHT);

        JPanel keypadPanel = new JPanel(new GridLayout(4, 3));

        String[] buttonLabels = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#"};
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String currentText = textField.getText();
                    String buttonText = button.getText();
                    textField.setText(currentText + buttonText);
                }
            });
            keypadPanel.add(button);
        }

        frame.add(textField, BorderLayout.NORTH);
        frame.add(keypadPanel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }
}
