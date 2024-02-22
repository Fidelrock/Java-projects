import java.awt.*;
import javax.swing.*;

public class BackgroundImageExample extends JFrame {
    public BackgroundImageExample() {
        setTitle("Background Image Example");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        setContentPane(new JLabel(new ImageIcon("chuka-university-business-complex-at-night-view.png")));

        // Add other components here
        
        setVisible(true);
    }

    public static void main(String[] args) {
        BackgroundImageExample example = new BackgroundImageExample();
    }
}
