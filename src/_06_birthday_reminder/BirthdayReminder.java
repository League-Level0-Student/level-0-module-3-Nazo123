
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "December 25th";
		String dadsBirthday = "January 12th";
		String myBirthday = "December 13th";

		// 2. Find out which birthday the user wants and and 
		//store their response in a variable
	String q = JOptionPane.showInputDialog( "Who's birhtday do you want to know?");
		// 3. Print out what the user typed
		System.out.println(q);
		// 4. if user asked for "mom"
		if (q.equalsIgnoreCase("Mom")) {
			System.out.println(momsBirthday);
		}
			//print mom's birthday
		else if (q.equalsIgnoreCase("dad")) {
			System.out.println(dadsBirthday);
		}
		else if (q.equalsIgnoreCase("Ozan")) {
			System.out.println(myBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");//7. otherwise print ""
		}

	} 
}
