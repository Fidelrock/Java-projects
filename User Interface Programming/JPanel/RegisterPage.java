import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RegisterPage extends JFrame implements ActionListener {
    private JTextField usernameField, emailField;
    private JPasswordField passwordField, confirmPasswordField;
    private JButton registerButton, cancelButton;

    public RegisterPage() {
        setTitle("Register Page");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        //setContentPane(new JLabel(new ImageIcon("background.jpg")));

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(20);
        usernameField.setPreferredSize(new Dimension(80,20));
        panel.add(usernameLabel);
        panel.add(usernameField);

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField(20);
        emailField.setPreferredSize(new Dimension(80,20));
        panel.add(emailLabel);
        panel.add(emailField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);
       passwordField.setPreferredSize(new Dimension(80,20));
        panel.add(passwordLabel);
        panel.add(passwordField);

        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordField = new JPasswordField(20);
        confirmPasswordField.setPreferredSize(new Dimension(80,20));
        panel.add(confirmPasswordLabel);
        panel.add(confirmPasswordField);

        registerButton = new JButton("Register");
        registerButton.setSize(80,30);
        registerButton.setForeground(Color.BLUE);
        cancelButton = new JButton("Cancel");
        cancelButton.setForeground(Color.RED);
        cancelButton.setSize(80,30);
        panel.add(registerButton);
        panel.add(cancelButton);

        add(panel, BorderLayout.CENTER);
        setVisible(true);

        registerButton.addActionListener(this);
        cancelButton.addActionListener(this);


    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==registerButton){

        }
        if(e.getSource()==cancelButton){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        RegisterPage registerPage = new RegisterPage();
        registerPage.setVisible(true);
    }
}
