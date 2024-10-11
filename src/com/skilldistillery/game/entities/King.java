package com.skilldistillery.game.entities;

public class King extends GameCharacter {
	private String name = "I'm the King";
	private String noise;
	private int points = 25;

	public King() {
		super();
	}

	public King(String name) {
		super(name);
	}
	public String getWalk(String walk) {
		return walk;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNoise() {
		return noise;
	}

	public void setNoise(String noise) {
		this.noise = noise;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
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
