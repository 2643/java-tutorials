package com.team2643.tutorial.oop;

public class RobotWorld {

	public static void main(String[] args) {
		System.out.println("Welcome to robot world!");
		
		Robot firstRobotObject = new Robot();
		printRobotInfo(firstRobotObject);
		
		Robot secondRobotObject = new Robot();
		printRobotInfo(secondRobotObject);
		
	}
	
	private static void printRobotInfo(Robot robot) {
		System.out.println("\nRobot object ID: " + robot);
	}

}
