import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CreateLoginForm extends JFrame implements ActionListener {

    JButton loginButton, registerButton;
    JPanel newPanel;
    JLabel userLabel, passLabel;
    final JTextField  textField1, textField2;

    CreateLoginForm() {
          
        userLabel = new JLabel();  
        userLabel.setText("Username");      
          
        textField1 = new JTextField(15);   
        textField1.setSize(100,50);

        passLabel = new JLabel();  
        passLabel.setText("Password");      

        textField2 = new JPasswordField(15);   
        textField2.setSize(100,50);

        loginButton = new JButton("LOGIN");
        loginButton.setSize(100,30);

        registerButton = new JButton("REGISTER");
        registerButton.setSize(100,30);

        newPanel = new JPanel(new GridLayout(4, 1));  
        newPanel.add(userLabel);    
        newPanel.add(textField1);   
        newPanel.add(passLabel);    
        newPanel.add(textField2);   
        newPanel.add(loginButton);          
        newPanel.add(registerButton);    
          
        add(newPanel, BorderLayout.CENTER);  
          
        loginButton.addActionListener(this);
        registerButton.addActionListener(this);

        setTitle("LOGIN FORM");         
        setSize(400, 250);
    } 

    public void actionPerformed(ActionEvent ae) {  
        String userValue = textField1.getText();        
        String passValue = textField2.getText();        

        if (ae.getSource() == loginButton) {
            if (userValue.equals("fidelisodhiambo254@gmail.com") && passValue.equals("Fidel@2002")) {  
                NewPage page = new NewPage();  
                page.setVisible(true);  
                JLabel wel_label = new JLabel("Welcome: "+userValue);  
                page.getContentPane().add(wel_label);  
            }  
            else {  
                JOptionPane.showMessageDialog(this, "Invalid username or password. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if (ae.getSource() == registerButton) {
            // Handle registration button click event
            JOptionPane.showMessageDialog(this, "Registration form will be displayed here.", "Registration", JOptionPane.INFORMATION_MESSAGE);
        }
    }  
}
