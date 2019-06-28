package _05_horoscope;

import javax.swing.JOptionPane;

public class horoscope {

public static void main(String[] args) {
	
	String q = JOptionPane.showInputDialog( "What is your star sign");
	
	if (q.equalsIgnoreCase("leo")) {
		JOptionPane.showMessageDialog(null, "The lion is the symbol for this sign because the lion embodies the best characteristics of the leo; proud, regal, relaxed, and in charge. Leo people know they are in charge, even when it may seem outwardly that they are not.\n" + 
				"\n" + 
				"");
	}
	else if (q.equalsIgnoreCase("Gemini")) {
		JOptionPane.showMessageDialog(null, "The Gemini symbol is that of a pair of twins. This is because this sign rarely likes to do anything alone.");
	}
	else if (q.equalsIgnoreCase("Aries")) {
		JOptionPane.showMessageDialog(null, "The symbol for this sign is that of a ram for good reason. Aries is full of life and possesses high energy, which makes this sign always looking for a challenge. The typical Aries person is full of vitality, curiosity, and has a heightened sense of justice. They often excel at anything where a bit of competition is involved, whether this is of a cognitive nature or physical. The challenge is the thing. If there is a chance to win, to best someone, to show off abilities, Aries is in it to win it. The Aries person feels most alive when they are in control and leading others. They are often impatient and abrupt with those whom they feel are not their equals and are in a leadership position. Most Aries do not like being told what to do if the person in charge is less talented than they.\n" + 
				"\n" + 
				"");
	}
	else if (q.equalsIgnoreCase("Libra")) {
		JOptionPane.showMessageDialog(null, "Libra people tend to need balance in their lives like no other sign of the zodiac, which makes the symbol of the scales particularly appropriate for this sign. Libra people need to keep a balance between work lives and recreational lives and an equal balance in their emotional and spiritual/physical lives. Because of this need Libra signs can sometimes seem wishy-washy when they are asked to make a decision. This is because they must ‘weigh’ all of their options. However, rest assured, that when a Libra makes up their mind the decision is likely to be the best win/win for all involved; benefiting the most people. This sign does not like to see people unhappy.");
	}
	else if (q.equalsIgnoreCase("Cancer")) {
		JOptionPane.showMessageDialog(null, "The crab symbolizes this sign for good reason. Just as the crab carries its own shell on its back, so too, does the typical cancerian…so to speak. The typical cancer person is all about home and family and is very dedicated and loyal to friends and family.");
	}
	else if (q.equalsIgnoreCase("Taurus")) {
		JOptionPane.showMessageDialog(null, "Tarus’s symbol is the bull because this sign’s characteristic is to be peaceful and methodical. This sign is often very deliberate in their actions, relaxed, and enjoys all of the sensual pleasures that abound in this dimension. Food, drink, sex, luxury, are all sought after by the typical taruean. Because this sign loves luxury they are willing to work hard to obtain it. They are slow to anger, but once disturbed it can be volatile. Taurus signs look for stability in their lives and in their partners and co-workers. Taurus people are not in a hurry, typically, and it can take them many years to decide what it is that they would like to do for a living, or where they’d like to go on vacation. Many of this sign prefer to live in the country as they are drawn to the earth and the natural world. Earth signs tend to have solid, reputable natures, which coincides with the Earth.\n" + 
				"\n" + 
				"");
	}
	else if (q.equalsIgnoreCase("Virgo")) {
		JOptionPane.showMessageDialog(null, "The cool, calm, clarity that this sign exudes is why the symbol of the Maiden was chosen. Virgo people are mild mannered on the surface, but underneath there is a flurry of activity. Their minds are never quiet; always thinking, calculating, assessing. They loves making something out of nothing, nurturing and growing small things. ");
	
	}
	else if (q.equalsIgnoreCase("Sagittarius")) {
		JOptionPane.showMessageDialog(null, "The centaur is the symbol for this sign. In mythology, the centaur was half man and half horse, given to pursing pleasure. The centaur is shown with a bow, which he shoots. Wherever the arrow lands, the centaur follows, retrieves the arrow and shoots again. ");
	
	}
	else if (q.equalsIgnoreCase("Scorpio")) {
		JOptionPane.showMessageDialog(null, "The symbol for Scorpio is the scorpion. This creature was chosen because it typifies many of the characteristics of this sign. The scorpio person is not necessarily aggressive on its own, unless provoked and in general would rather be contemplative. They crave alone time and often become extremely annoyed when they don’t get it. Scorpio people are great secret keepers and feel each emotion more intensely than other signs. Perhaps because of this they are able to be quite discerning when assisting people with their problems. ");
	}
	else if (q.equalsIgnoreCase("Capricorn")) {
		JOptionPane.showMessageDialog(null, "The mountain goat is the symbol for this sign because of the characteristic of the goat to climb higher and higher without losing his footing. Capricorn people are the type that are goal oriented and driven to succeed despite all odds. They will work long and hard hours toward a purposeful goal.");
	}
	else if (q.equalsIgnoreCase("Aquarius")) {
		JOptionPane.showMessageDialog(null, "The man who carries the pitcher of water is the symbol for this sign. This is because Aquarians are often generous with their time and resources. For this reason this sign often find themselves in occupations where they are helping on some humanitarian level. They are interested and have a deep concern for the welfare of others. They never know a stranger and are generally loved by all around them. Aquarians never meet a stranger and often will go out of their way to meet with people that they’ve not heard from for years. ");
	}
	else if (q.equalsIgnoreCase("Pisces")) {
		JOptionPane.showMessageDialog(null, "The fish is the symbol given to this sign, primarily because fish live in a secretive and mysterious place. Pisces tend to be daydreamers, often dreaming up brilliant ideas and plans which they are unable to facilitate themselves. They have a happy and vibrant inner life that few get to share or see. They are deeply caring about others and don’t like to see people become unhappy.");
	}


	else {
		JOptionPane.showMessageDialog(null, "This is not a star sign");
	}
	
	
}


}
