package com.skilldistillery.game.entities;

public class Clown extends GameCharacter {
	private String name = "I'm the Clown";
	private String noise;
	private int points = 10;
	private String walk;

	public Clown() {
		super();
	}

	public Clown(String name) {
		super(name);
	}

	public String getWalk() {
		return walk;
	}

	public void setWalk(String walk) {
		this.walk = walk;
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
		System.out.println("Prepare for a surprise! Laughter is the best weapon!");
	}

	@Override
	public void health(int points) {
		System.out.println("You have" + points);
		super.health(points);
	}

	@Override
	public String toString() {
		return "Clown [name=" + name + ", noise=" + noise + ", points=" + points + "]";
	}

}
