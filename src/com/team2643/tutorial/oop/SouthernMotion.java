package com.team2643.tutorial.oop;

import java.awt.Point;

public class SouthernMotion implements Motion {

	@Override
	public Point move(Point point, Integer distance) {
		Integer y = point.y - distance;
		point.move(point.x, y);
		return point;
	}

	@Override
	public Direction getDirection() {
		return Direction.SOUTH;
	}

}
