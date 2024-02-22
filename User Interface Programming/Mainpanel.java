
import javax.swing.*;
import java.awt.*;

class Mainpanel extends JFrame{
    Mainpanel(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(500,300);
        setTitle("JPanel Test");
        setSize(300,200);

        JPanel panel = new Mypanel();
        panel.setBackground(Color.black);
        panel.setLayout(getLayout(FlowLayout.CENTER,10,5));
        Button button = new Button("Button");
        panel.add(button);

        getContentPane().add(panel);

       /* class mainpanel extends JPanel(){
            setBackground(Color.black);
            JLabel label = new JLabel("Hello , World!!");
    
            label.setFont(new Font(null,Font.BOLD|Font.ITALIC,24));
            label.setForeground(Color.red);
            add(label);
        }*/
        
    }
}