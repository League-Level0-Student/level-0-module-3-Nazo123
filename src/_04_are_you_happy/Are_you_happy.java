package _04_are_you_happy;

import javax.swing.JOptionPane;

public class Are_you_happy {
public static void main(String[] args) {
	String happy = JOptionPane.showInputDialog( "Are you happy?");
	if (happy.equalsIgnoreCase("yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing what you are doing");
	}
	else {
		String sure = JOptionPane.showInputDialog("Do you wanna be happy?");
	if (sure.equalsIgnoreCase("yes")) {
		JOptionPane.showMessageDialog(null, "Then change something");
	}
	else {
JOptionPane.showMessageDialog(null, "Keep doing what you are doing");
	}
	}
}
}
