package _16_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class obedient_robot {
	static Robot bob =new Robot();
public static void main(String[] args) {
	bob.setSpeed(100);
	drawCircle();
	
}

void drawSquare() {
	
	bob.penDown();
	bob.turn(90);
	bob.move(50);
	bob.turn(90);
	bob.move(50);
	bob.turn(90);
	bob.move(50);
	bob.turn(90);
	bob.move(50);
	
	
}
void drawTriangle() {
	
	bob.penDown();
	bob.turn(60);
	bob.move(50);	bob.turn(60);
	bob.move(50);	bob.turn(60);
	bob.move(50);
	
	
	
	
}
static void drawCircle() {
	for (int i=0;i<36;i++) {
	bob.penDown();
	bob.turn(10);
	bob.move(10);	
	}
	
	
	
	
}

}
