package com.team2643.tutorial.oop;

public class Robot {
	private String name = "";
	
	public Robot(String name) {
		setName(name);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

}
