import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StudentPortal extends JFrame implements ActionListener {

    private JLabel welcomeLabel;
    private JButton gradesButton;
    private JButton coursesButton;
    private JButton messagesButton;

    public StudentPortal() {
        super("Student Portal");

        // create GUI components
        welcomeLabel = new JLabel("Welcome to the Student Portal");
        gradesButton = new JButton("View Grades");
        coursesButton = new JButton("Register for Courses");
        messagesButton = new JButton("View Messages");
        gradesButton.addActionListener(this);
        coursesButton.addActionListener(this);
        messagesButton.addActionListener(this);

        // create layout
        JPanel welcomePanel = new JPanel(new FlowLayout());
        welcomePanel.add(welcomeLabel);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 3));
        buttonPanel.add(gradesButton);
        buttonPanel.add(coursesButton);
        buttonPanel.add(messagesButton);

        // add components to frame
        getContentPane().add(welcomePanel, BorderLayout.NORTH);
        getContentPane().add(buttonPanel, BorderLayout.CENTER);
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == gradesButton) {
            // display grades page
            JOptionPane.showMessageDialog(this, "Grades page not yet implemented.");
        } else if (event.getSource() == coursesButton) {
            // display courses page
            JOptionPane.showMessageDialog(this, "Courses page not yet implemented.");
        } else if (event.getSource() == messagesButton) {
            // display messages page
            JOptionPane.showMessageDialog(this, "Messages page not yet implemented.");
        }
    }

    public static void main(String[] args) {
        new StudentPortal();
    }
}
