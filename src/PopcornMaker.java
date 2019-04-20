import javax.swing.JOptionPane;

public class PopcornMaker {

	public static void main(String[] args) {
		
		Popcorn p; 
		Microwave m = new Microwave();
		String flavor = JOptionPane.showInputDialog("What flavor of popcorn would you like?");
		p = new Popcorn(flavor);
		String setTime = JOptionPane.showInputDialog("How long would you like your popcorn cooked for?");
		m.putInMicrowave(p);
		m.setTime(Integer.parseInt(setTime));
		m.startMicrowave();
	}
	
	
}
