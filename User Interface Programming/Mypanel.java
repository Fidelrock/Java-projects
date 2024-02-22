import javax.swing.*;
import java.awt.*;

class Mypanel extends JPanel {

    Mypanel(){
        setBackground(Color.black);

        JLabel login = new JLabel("LOGIN AS: ");
        login.setFont(new Font("timesNewRoman",Font.BOLD|Font.ITALIC,24));
        login.setForeground(Color.white);
        //login.setLocation(100,150);
        Mypanel.getContentPane().add(login);
    }
}