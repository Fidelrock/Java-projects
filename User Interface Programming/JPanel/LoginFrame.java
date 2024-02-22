import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends JFrame implements ActionListener {

    private JLabel titleLabel, userLabel, passwordLabel;
    private JTextField userTextField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginFrame() {
        // Set the title of the login form
        setTitle("Lecturer Login");

        // Create and customize UI components
        titleLabel = new JLabel("Lecturer Login Form");
        titleLabel.setFont(new Font("Serif", Font.BOLD, 24));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);

        userLabel = new JLabel("Username:");
        userLabel.setFont(new Font("Serif", Font.PLAIN, 18));
        userTextField = new JTextField();

        passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Serif", Font.PLAIN, 18));
        passwordField = new JPasswordField();

        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Serif", Font.PLAIN, 18));
        loginButton.addActionListener(this);

        // Create a panel to hold the UI components
        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));
        panel.add(userLabel);
        panel.add(userTextField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel()); // empty label for spacing
        panel.add(loginButton);

        // Add UI components to the login form
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(titleLabel, BorderLayout.NORTH);
        container.add(panel, BorderLayout.CENTER);

        // Set the size and visibility of the login form
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Get the username and password from the UI components
        String username = userTextField.getText();
        String password = new String(passwordField.getPassword());

        // Check if the username and password are correct
        if (username.equals("lecturer") && password.equals("password")) {
            JOptionPane.showMessageDialog(this, "Login successful!");
            // TODO: Open the main application for the lecturer
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password");
        }
    }

    public static void main(String[] args) {
        // Create a new login form
        new LoginFrame();
    }
}
