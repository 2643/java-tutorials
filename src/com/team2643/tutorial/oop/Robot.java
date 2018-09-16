package com.team2643.tutorial.oop;

import java.awt.Point;

public class Robot {
	private String name = "";
	private Point location = new Point();
	private Direction direction = Direction.NORTH;
	
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
		return this.direction;
	}
	
	public void setDirection(Direction direction) {
		this.direction = direction;
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
		Integer x, y = 0;
		switch(getDirection()) {
			case NORTH :
				y = getLocation().y + distance;
				getLocation().move(getLocation().x, y);
				break;
			case EAST :
				x = getLocation().x - distance;
				getLocation().move(x, getLocation().y);
				break;			
			case SOUTH :
				y = getLocation().y - distance;
				getLocation().move(getLocation().x, y);
				break;			
			case WEST :
				x = getLocation().x + distance;
				getLocation().move(x, getLocation().y);
				break;			
		}
	}
}
