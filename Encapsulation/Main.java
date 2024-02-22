
import java.awt.*;
import javax.swing.*;

public class Main{
    public static void main(String[]args){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int w = screenSize.width;
        int h = screenSize.height;
        JFrame frame = new MainFrame(w/2,h/2,w/4,h/4);
        frame.show();

    }
}

