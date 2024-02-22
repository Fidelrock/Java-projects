
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelExample extends JFrame implements ActionListener {

    // Declare the buttons outside the constructor to be accessible to the actionPerformed method
    private JButton b1;
    private JButton b2;

    PanelExample() {
        JFrame f = new JFrame("Panel Example");
        JPanel panel = new JPanel();
        panel.setBounds(40, 80, 200, 200);
        panel.setBackground(Color.gray);

        JLabel label = new JLabel("LOGIN AS: ");
        label.setForeground(Color.red);
        label.setFont(new Font("serif", Font.BOLD, 20));

        panel.add(label);

        JPanel button = new JPanel();
        button.setBounds(40, 150, 200, 200);

        b1 = new JButton("STUDENT");
        b1.setBounds(50, 200, 80, 30);
        b1.setBackground(Color.yellow);

        b2 = new JButton("LECTURER");
        b2.setBounds(100, 100, 80, 30);
        b2.setBackground(Color.green);

        button.add(b1);
        button.add(b2);

        f.add(panel);
        f.add(button);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

        //Perform an action on button click

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            // Perform action for button 1
            JOptionPane.showMessageDialog(this, "Login as a student");
            CreateLoginForm form = new CreateLoginForm();
            form.setVisible(true);
            form.setSize(300,200);
           // JOptionPane.showMessageDialog(this, "Login as a student");
        } else if (e.getSource() == b2) {
            // Perform action for button 2
            JOptionPane.showMessageDialog(this, "Login as a lecturer");
            LoginFrame lec = new LoginFrame();
            lec.setSize(300,200);
            lec.setVisible(true);
        }
    }

    
}
