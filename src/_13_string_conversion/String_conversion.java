package _13_string_conversion;

import javax.swing.JOptionPane;

public class String_conversion {
public static void main(String[] args) {
	
	
	String quantity = JOptionPane.showInputDialog("Enter a number");
	int num = Integer.parseInt(quantity);
	for(int i=0; i<num; i++) {
	JOptionPane.showMessageDialog(null, "click ok");
	}
}
}
