package com.skilldistillery.game.entities;


public class Queen extends GameCharacter{
	private String name = "I'm the Queen";
	private String noise;
	private int points = 50;

	public Queen() {
		super();
	}

	public Queen(String name) {
		super(name);
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
		System.out.println("Let the light of my reign guide us forward!");
	}

	@Override
	public void health(int points) {
		System.out.println("You have" + points);
		super.health(points);
	}

	@Override
	public String toString() {
		return "Queen [name=" + name + ", noise=" + noise + ", points=" + points + "]";
	}

}
