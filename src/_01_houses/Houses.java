package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static Robot robot = new Robot();
	public static int height = 0;

	public static void main(String[] args) {
		robot.setSpeed(100);
		robot.penDown();
		robot.setX(10);
		robot.setY(400);
		robot.setPenWidth(5);

		drawPointyHouse("red");
		drawHouse("medium", "black");
		drawPointyHouse("blue");
		drawHouse("large", "black");
		drawPointyHouse("blue");
		drawHouse("medium", "blue");
		drawHouse("medium", "red");
		drawHouse("large", "red");
		drawPointyHouse("black");
		
		
	}

	public static void drawHouse(String size, String color) {
		if (size == "small") {
			height = 60;
		} else if (size == "medium") {
			height = 120;
		} else if (size == "large") {
			height = 250;
		}
		if (color == "red") {
			robot.setPenColor(Color.red);
		} else if (color == "blue") {
			robot.setPenColor(Color.blue);
		} else {
			robot.setPenColor(Color.black);
		}
		robot.move(height);
		robot.turn(90);
		robot.move(25);
		robot.turn(90);
		robot.move(height);
		robot.turn(270);
		robot.setPenColor(Color.GREEN);
		robot.move(20);
		robot.turn(270);
		if (color == "red") {
			robot.setPenColor(Color.red);
		} else if (color == "blue") {
			robot.setPenColor(Color.blue);
		} else {
			robot.setPenColor(Color.black);
		}
	}
	public static void drawPointyHouse(String color) {
		if (color == "red") {
			robot.setPenColor(Color.red);
		} else if (color == "blue") {
			robot.setPenColor(Color.blue);
		} else {
			robot.setPenColor(Color.black);
		}
		robot.move(60);
		robot.turn(60);
		robot.move(10);
		robot.turn(60);
		robot.move(10);
		robot.turn(60);
		robot.move(60);
		robot.turn(270);
		robot.setPenColor(Color.GREEN);
		robot.move(20);
		robot.turn(270);
		if (color == "red") {
			robot.setPenColor(Color.red);
		} else if (color == "blue") {
			robot.setPenColor(Color.blue);
		} else {
			robot.setPenColor(Color.black);
		}
}
}
