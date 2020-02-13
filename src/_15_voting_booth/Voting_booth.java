package _15_voting_booth;

import javax.swing.JOptionPane;

public class Voting_booth {
public static void main(String[] args) {
	
	String quantity = JOptionPane.showInputDialog("How old are you? (In years)");
	int num = Integer.parseInt(quantity);
	
	if(num>17) {
		JOptionPane.showMessageDialog(null, "Who should be the next president?");
	}else {
		JOptionPane.showMessageDialog(null, "Nobody cares what you think.");
	}
	}


	
	
	
}

