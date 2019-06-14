//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		for (int i = 0;i<10;i++) {
		//1. Create a new Robot
		Random red = new Random();
		Random blue = new Random();
		Random green = new Random();
		
		Robot bob = new Robot();
		//3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("What color would you like?");
		int r = red.nextInt(255);
		int g = green.nextInt(255);
		int b = blue.nextInt(255);
		//5. Use an if/else statement to set the pen color that the user requested
if (color.equalsIgnoreCase("red")) {
	bob.setPenColor(255,0,0);
}
if (color.equalsIgnoreCase("blue")) {
	bob.setPenColor(0,0,255);
}
if (color.equalsIgnoreCase("green")) {
	bob.setPenColor(0, 255, 0);
}


 
        //6. If the user doesn’t enter anything, choose a random color
else {
	bob.setPenColor(r, g, b);
}

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		//2432442342
		//4. Set the pen width to 10
		bob.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
bob.move(100);
bob.turn(90);
bob.move(100);
bob.turn(90);
bob.move(100);
bob.turn(90);
bob.move(100);
bob.turn(90);
		}
	}
}
