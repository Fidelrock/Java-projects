import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ColorButtonListener implements ActionListener {

    private JFrame frame;
    private Color currentColor;
    
    // Constructor that takes a JFrame as argument
    public ColorButtonListener(JFrame frame) {
        this.frame = frame;
        this.currentColor = Color.BLUE;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (currentColor == Color.BLUE) {
            frame.getContentPane().setBackground(Color.BLACK);
            currentColor = Color.BLACK;
        } else {
            frame.getContentPane().setBackground(Color.BLUE);
            currentColor = Color.BLUE;
        }
    }
    
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Color Button");
        // Create a new JButton
        JButton colorButton = new JButton("Change Color");
        // Create a new ColorButtonListener and add it as an ActionListener to the JButton
        ColorButtonListener listener = new ColorButtonListener(frame);
        colorButton.addActionListener(listener);
        // Add the JButton to the JFrame
        frame.add(colorButton);
        // Set some properties of the JFrame
        pack();
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
