package com.team2643.tutorial.oop;

import java.awt.Point;

public class Robot {
	private String name = "";
	private Point location = new Point();
	
	public Robot(String name) {
		setName(name);
	}

	public String getName() {
		return name;
	}
	
	public Point getLocation() {
		return location;
	}

	private void setName(String name) {
		this.name = name;
	}

}
