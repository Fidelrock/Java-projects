import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces

// An AWT GUI program inherits from the top-level container java.awt.Frame
public class AWTAccumulator extends Frame implements ActionListener {
   private Label lblInput;     // Declare input Label
   private Label lblOutput;    // Declare output Label
   private TextField tfInput;  // Declare input TextField
   private TextField tfOutput; // Declare output TextField
   private int numberIn;       // Input number
   private int sum = 0;        // Accumulated sum, init to 0

/** Constructor to setup the UI components and event handling */
   public AWTAccumulator() {
      setLayout(new FlowLayout());
 // "super" Frame sets layout to FlowLayout, which arranges the components
 //  from left-to-right, and flow to next row from top-to-bottom.

      lblInput = new Label("Enter an Integer: "); // Construct Label
      add(lblInput);               // "super" Frame adds Label

      tfInput = new TextField(10); // Construct TextField
      add(tfInput);                // "super" Frame adds TextField

      tfInput.addActionListener(this);
 // Hitting Enter on TextField fires ActionEvent
 // tfInput (TextField) registers this instance as ActionEvent listener

      lblOutput = new Label("The Accumulated Sum is: ");  // allocate Label
      add(lblOutput);               // "super" Frame adds Label

      tfOutput = new TextField(10); // allocate TextField
      tfOutput.setEditable(false);  // read-only
      add(tfOutput);                // "super" Frame adds TextField

      setTitle("AWT Accumulator");  // "super" Frame sets title
      setSize(350, 120);  // "super" Frame sets initial window size
      setVisible(true);   // "super" Frame shows
   }

/** The entry main() method */
   public static void main(String[] args) {
 // Invoke the constructor to setup the GUI, by allocating an anonymous instance
      new AWTAccumulator();
   }

/** ActionEvent handler - Called back upon hitting enter key on TextField */
   @Override
   public void actionPerformed(ActionEvent evt) {
 // Get the String entered into the TextField tfInput, convert to int
      numberIn = Integer.parseInt(tfInput.getText());
      sum += numberIn;      // Accumulate numbers entered into sum
      tfInput.setText("");  // Clear input TextField
      tfOutput.setText(sum + ""); // Display sum on the output TextField
 // convert int to String
   }
}
