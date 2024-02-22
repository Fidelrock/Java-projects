import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextFieldExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Field Example");
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(200, 50)); // set preferred size
        frame.add(textField);
        frame.pack();
        frame.setVisible(true);
    }
}
