import javax.swing.*;

public class MenuBarExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Bar Example");
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu optionsMenu = new JMenu("Options");

        // Add menu items to file menu and options menu here...

        // Create a Box component with a horizontal glue to push the menu to the far right
        Box.Filler horizontalGlue = new Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(Integer.MAX_VALUE, 0));
        menuBar.add(horizontalGlue);
        menuBar.add(optionsMenu);
        menuBar.add(fileMenu);

        frame.setJMenuBar(menuBar);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
