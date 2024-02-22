import java.awt.*;
import javax.swing.*;

class UserLogin{
    class UserLogin extends JFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setSize(200,200);
         setTitle("UserLogin Frame");
         setLocation(500,500);
          JLabel label = new JLabel("Hello, World");

       label.setFont(new Font("serif",Font.BOLD|Font.ITALIC,height/20));

         label.setForeground(Color.red);
         getContentPane().add(label);
}