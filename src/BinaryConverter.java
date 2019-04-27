import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter {

	JFrame frame; 
	JPanel panel;
	JLabel label;
	JButton button;
	JTextField answer;
	
	public static void main(String[] args) {
	
	BinaryConverter bc;
	bc = new BinaryConverter();
	bc.method();
	}
	
	public void method() {
		frame = new JFrame("Convert 8 bits of binary to ASCII");
		frame.setVisible(true);
		panel = new JPanel();
		label = new JLabel();
		button = new JButton();
		button.setText("Convert");
		answer = new JTextField("        ");
		frame.add(panel);
		panel.add(answer);
		panel.add(button);
		panel.add(label);
		frame.pack();
		
	}
	
	String convert(String input) {
        if(input.length() != 8){
             JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
             return "-";
        }
        String binary = "[0-1]+";    //must contain numbers in the given range
        if (!input.matches(binary)) {
             JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
             return "-";
        }
        try {
             int asciiValue = Integer.parseInt(input, 2);
             char theLetter = (char) asciiValue;
             return "" + theLetter;
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
             return "-";
        }
   }
}