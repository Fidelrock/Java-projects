import javax.swing.*;

public class EmptyWindow{

public static void main(String[]args){

JFrame frame = new MainFrame();

frame.show();

}

}

class MainFrame extends JFrame {
MainFrame(){
setDefaultCloseOperation(JFrame.Exit_ON_CLOSE);
setSize(300,200);
}
}