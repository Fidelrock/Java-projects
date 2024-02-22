import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JmenuBarTest extends JFrame implements ActionListener {
    JmenuBarTest() {
        // Create a frame
        setTitle("JMenuBar Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        JMenuBar n = new JMenuBar();
        JMenu login = new JMenu("Login");

        JMenuItem student = new JMenuItem("Student");
        JMenuItem lecturer = new JMenuItem("Lecturer");

        login.setForeground(Color.BLUE);

        student.setFont(new Font("monospaced", Font.BOLD, 16));
        student.setMnemonic('S');
        student.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        student.setBackground(Color.WHITE);

        lecturer.setFont(new Font("monospaced", Font.BOLD, 16));
        lecturer.setMnemonic('L');
        lecturer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        lecturer.setBackground(Color.WHITE);

        student.addActionListener(this);
        lecturer.addActionListener(this);

        // exit option
        JMenu exit = new JMenu("Exit");
        JMenuItem ex = new JMenuItem("Exit");
        exit.setForeground(Color.RED);

        ex.setFont(new Font("monospaced", Font.BOLD, 16));
        ex.setMnemonic('Z');
        ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
        ex.setBackground(Color.WHITE);

        ex.addActionListener(this);

        // Add components to the menu
        login.add(student);
        login.add(lecturer);

        exit.add(ex);

       // Add components to the menu bar
       n.add(Box.createHorizontalGlue());
       n.add(login);
       n.add(exit);

       // Set the horizontal alignment of the menu components
       login.setHorizontalAlignment(JMenu.RIGHT);
       exit.setHorizontalAlignment(JMenu.RIGHT);

        setJMenuBar(n);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        if (msg.equals("Student")) {
            JOptionPane.showMessageDialog(this, "Add Student form will open here");
        } else if (msg.equals("Lecturer")) {
            JOptionPane.showMessageDialog(this, "Add Lecturer form will open here");
        } else if (msg.equals("Exit")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new JmenuBarTest();
    }
}
