import javax.swing.*;
import java.awt.*;

class Mypanel extends JPanel {

    MyPanel(){
        setBackground(Color.black);
        JLabel label = new JLabel("Hello , World!!");

        label.setFont(new Font(null,Font.BOLD|Font.ITALIC,24));
        label.setForeground(Color.red);
        add(label);
    }
}