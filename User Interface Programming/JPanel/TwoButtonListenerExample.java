import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TwoButtonListenerExample extends JFrame implements ActionListener {
    private JButton button1;
    private JButton button2;

    public TwoButtonListenerExample() {
        super("Two Button Listener Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        button1 = new JButton("Button 1");
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("Button 2");
        button2.addActionListener(this);
        add(button2);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            // Handle button1 event
            System.out.println("Button 1 clicked");
        } else if (e.getSource() == button2) {
            // Handle button2 event
            System.out.println("Button 2 clicked");
        }
    }

    public static void main(String[] args) {
        new TwoButtonListenerExample();
    }
}
