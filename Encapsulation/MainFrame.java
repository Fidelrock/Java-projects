
import java.awt.*;
import javax.swing.*;
class MainFrame extends JFrame {
    MainFrame(int width, int height, int x, int y){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setSize(width,height);
         setTitle("Main Frame");
         setLocation(x,y);
          JLabel label = new JLabel("Hello, World");

       label.setFont(new Font("serif",Font.BOLD|Font.ITALIC,height/20));

         label.setForeground(Color.red);
         getContentPane().add(label);

         //JPanel panel = new JPanel();
         //Mypanel panel = new MyPanel();
         //getContentPane().add(panel);
         //add.label();
    }
}