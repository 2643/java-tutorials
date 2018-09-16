package com.team2643.tutorial.oop;

public class RobotWorld {

	public static void main(String[] args) {
		System.out.println("Welcome to robot world!");
		
		Robot firstRobotObject = new Robot("C-3PO");
		printRobotInfo(firstRobotObject);
		firstRobotObject.moveForward(100);
		firstRobotObject.setEasternMotion();
		firstRobotObject.moveForward(50);
		printRobotInfo(firstRobotObject);
		
		Robot secondRobotObject = new Robot("R2-D2");
		printRobotInfo(secondRobotObject);
		secondRobotObject.moveBackward(50);
		secondRobotObject.setWesternMotion();
		secondRobotObject.moveForward(100);
		printRobotInfo(secondRobotObject);
	}
	
	private static void printRobotInfo(Robot robot) {
		System.out.println("\nRobot object ID: " + robot);
		System.out.println("Robot name: " + robot.getName());
		System.out.println("Robot location: [x=" + robot.getLocation().x + ",y=" + robot.getLocation().y + "]");
		System.out.println("Robot direction: " + robot.getDirection());
	}

}
