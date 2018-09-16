package com.team2643.tutorial.oop;

import java.awt.Point;

public class Robot {
	private String name = "";
	private Point location = new Point();
	private Motion motion = new NorthernMotion();
	
	public Robot(String name) {
		setName(name);
	}
	
	public void moveForward(Integer distance) {
		move(distance);
	}
	
	public void moveBackward(Integer distance) {
		move(-distance);
	}
	
	public Direction getDirection() {
		return this.motion.getDirection();
	}
	
	public void setNorthernMotion() {
		this.motion = new NorthernMotion();
	}
	
	public void setSouthernMotion() {
		this.motion = new SouthernMotion();
	}
	
	public void setEasternMotion() {
		this.motion = new EasternMotion();
	}
	
	public void setWesternMotion() {
		this.motion = new WesternMotion();
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
		motion.move(this.location, distance);
	}
}