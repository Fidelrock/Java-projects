//Test GUI class

import javax.swing.*;
import java.awt.*;

public class GraphicsExample extends JFrame{
    JLabel login,label;

    GraphicsExample(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(300,200);
        setTitle("GraphicsExample. ");
        setLocation(500,300);

        JLabel label = new JLabel("HELLO WORLD!!! ");
        label.setFont(new Font("serif",Font.BOLD|Font.ITALIC,24));
        //login.setLocation(100,100);
        label.setForeground(Color.blue);
        getContentPane().add(label);

        JLabel login = new JLabel("LOGIN AS: ");
        login.setFont(new Font("timesNewRoman",Font.BOLD|Font.ITALIC,24));
        login.setForeground(Color.red);
        //login.setLocation(100,150);
        getContentPane().add(login);
    }
}