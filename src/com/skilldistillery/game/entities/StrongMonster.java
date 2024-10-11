package com.skilldistillery.game.entities;

public class StrongMonster extends Monster {
	private String noise = "Vicious Growl";

// methods

	public StrongMonster() {
		super("Weak Monster Name");
	}

	public StrongMonster(String name) {
		super(name);
	}

	public StrongMonster(String name, String noise) {
		super(name);
		this.noise = noise;

	}

	@Override
	public void makeNoise() {
		super.makeNoise();
		System.out.println("I am the strong monster");
		System.out.println(noise);

	}

}