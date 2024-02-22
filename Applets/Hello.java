import java.awt.*;
import javax.swing.*;

public class Hello extends JApplet {
    public void init(){
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        JLabel label = new JLabel("Hello, Babe!!");
        
    }
}