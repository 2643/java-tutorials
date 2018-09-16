package com.team2643.tutorial.oop;

import java.awt.Point;

public interface Motion {
	public Point move(Point point, Integer distance);
	public Direction getDirection();
}
