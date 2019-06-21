package _05_horoscope;

import javax.swing.JOptionPane;

public class horoscope {

public static void main(String[] args) {
	
	String q = JOptionPane.showInputDialog( "What is your star sign");
	
	if (q.equalsIgnoreCase("leo")) {
		JOptionPane.showMessageDialog(null, "The lion is the symbol for this sign because the lion embodies the best characteristics of the leo; proud, regal, relaxed, and in charge. ");
	}
	else if (q.equalsIgnoreCase("Gemini")) {
		JOptionPane.showMessageDialog(null, "The Gemini symbol is that of a pair of twins. This is because this sign rarely likes to do anything alone.");
	}
	else if (q.equalsIgnoreCase("Aries")) {
		JOptionPane.showMessageDialog(null, "The symbol for this sign is that of a ram for good reason.");
	}
	else if (q.equalsIgnoreCase("Libra")) {
		JOptionPane.showMessageDialog(null, "Libra people tend to need balance in their lives like no other sign of the zodiac, which makes the symbol of the scales particularly appropriate for this sign.");
	}
	else {
		JOptionPane.showMessageDialog(null, "This is not a star sign or I was too lazy to code it in");
	}
	
	
}


}
