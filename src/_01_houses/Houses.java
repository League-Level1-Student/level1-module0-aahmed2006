package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static Robot robot = new Robot();
	public static void main(String[] args) {
		robot.setSpeed(100);
		robot.penDown();
		robot.setX(10);
		robot.setY(400);
		for(int i = 0; i < 10; i++) {
			robot.setRandomPenColor();
			Random random = new Random();
			int r = random.nextInt(251)+59;
			if(r>120) {
				drawFlatHouse(r);
			} else {
				drawPointyHouse(r);
			}
			
		}
		
	}
	public static void drawFlatHouse(int height) {
		robot.move(height);
		robot.turn(90);
		robot.move(25);
		robot.turn(90);
		robot.move(height);
		robot.turn(270);
		robot.setPenColor(Color.GREEN);
		robot.move(20);
		robot.turn(270);
		robot.setPenColor(Color.black);
	}
	public static void drawPointyHouse(int height) {
		robot.move(height);
		robot.turn(30);
		robot.move(10);
		robot.turn(60);
		robot.move(10);
		robot.turn(30);
		robot.move(height);
		robot.turn(270);
		robot.setPenColor(Color.GREEN);
		robot.move(20);
		robot.turn(270);
		robot.setPenColor(Color.black);
	}
}
