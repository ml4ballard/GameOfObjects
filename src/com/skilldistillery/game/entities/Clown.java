package com.skilldistillery.game.entities;

public class Clown extends GameCharacter {
	private String name = "I'm the Clown";
	private String noise;
	private int points = 10;

	public Clown() {
		super();
	}

	public Clown(String name) {
		super(name);
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
