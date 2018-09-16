package com.team2643.tutorial.oop;

import java.awt.Point;

public class WesternMotion implements Motion {

	@Override
	public Point move(Point point, Integer distance) {
		Integer x = point.x + distance;
		point.move(x, point.y);
		return point;
	}

	@Override
	public Direction getDirection() {
		return Direction.WEST;
	}

}
