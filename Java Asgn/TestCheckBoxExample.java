
import javax.swing.*;
import java.awt.*;

public class TestCheckBoxExample extends JFrame{
    public TestCheckBoxExample(){


        JPanel panel = new JPanel();

        JCheckBox fidel = new JCheckBox("red");
        getContentPane().add(panel);
        panel.add(fidel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(400,200);
    }
    public static void main(String[]args){
        new TestCheckBoxExample();
    }
}