import javax.swing.*;
import java.awt.*;
public class MyFrame extends JFrame {
    public MyFrame(){
        //Create a panel container and add it to the frame
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        //Construct a CheckboxGroup object called Languages

        CheckboxGroup languages = new CheckboxGroup();
        Checkbox englishCheckBox = new  Checkbox("English",languages,true);
        Checkbox swahiliCheckBox = new  Checkbox("Swahili",languages,false);
        Checkbox germanCheckBox = new Checkbox("German",languages,false);
        Checkbox frenchCheckBox = new  Checkbox("French",languages,false);

        //Adding the checkBoxes to the panel

        panel.add(englishCheckBox);
        panel.add(swahiliCheckBox);
        panel.add(germanCheckBox);
       panel.add(frenchCheckBox);
       // languages.add(englishCheckBox);
        //languages.add(swahiliCheckBox);
        //languages.add(germanCheckBox);
       // languages.add(frenchCheckBox);

        //panel.add(languages);

        //Create an anonymous label called Anonymous
        System.out.println();

        JLabel anonymousLabel = new JLabel("Anonymous");

        panel.add(anonymousLabel);

        //Set up frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Exam Project");
        setSize(500,300);
        //pack();
        setVisible(true);


    }
    public static void main(String[]args){
        new MyFrame();
    }
}