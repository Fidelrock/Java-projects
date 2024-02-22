import javax.swing.JFrame;

public class MaximizedGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Maximized Window Example");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // set window state to maximized
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set default close operation
        frame.setVisible(true); // make the window visible
    }
}
