package com.skilldistillery.game.entities;

public class King extends Character {
	private String name = "I'm the King";
	private String noise;
	private int points = 25;
	
	public King() {
		super();
	}
	public King(String name) {
		super(name);
	}

	@Override
	public void makeNoise() {
		super.makeNoise();
		System.out.println("Stand firm, my brave warrior your King is here!");
	}
	
	@Override
	public void health(int points) {
		System.out.println("You have" + points);
		super.health(points);
	}

	@Override
	public String toString() {
		return "King [name=" + name + ", noise=" + noise + ", points=" + points + "]";
	}
	
	
}
