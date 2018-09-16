package com.team2643.tutorial.oop;

import java.awt.Point;

public class Robot {
	private String name = "";
	private Point location = new Point();
	
	public Robot(String name) {
		setName(name);
	}
	
	public void moveForward(Integer distance) {
		move(distance);
	}
	
	public void moveBackward(Integer distance) {
		move(-distance);
	}
		
	public Point getLocation() {
		return location;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}
	
	private void move(Integer distance) {
		Integer y = getLocation().y + distance;
		getLocation().move(getLocation().x, y);
	}

}
