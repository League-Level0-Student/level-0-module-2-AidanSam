package _14_rollercoaster;

import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
	
	String quantity = JOptionPane.showInputDialog("How tall are you? (In inches)");
	int num = Integer.parseInt(quantity);
	
	if(num<48) {
		JOptionPane.showMessageDialog(null, "You are too short to ride the rollercoaster.");
	}else {
		JOptionPane.showMessageDialog(null, "You are tall enough to ride the rollercoaster.");
	}
	}
}
