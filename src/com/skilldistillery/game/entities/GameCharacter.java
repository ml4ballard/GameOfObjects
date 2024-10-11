package com.skilldistillery.game.entities;

public abstract class GameCharacter {
	private String name;
	private String noise;
	private int points;

	public GameCharacter() {
	}

	public GameCharacter(String name) {
		this.name = name;
	}

	public void makeNoise() {
		System.out.println(noise);
	}

	public void health(int points) {

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

}