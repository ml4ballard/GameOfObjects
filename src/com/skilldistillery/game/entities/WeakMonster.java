package com.skilldistillery.game.entities;

public class WeakMonster extends Monster {
	private String noise = "wimper";

// methods

	public WeakMonster() {
		super("Weak Monster Name");
	}

	public WeakMonster(String name) {
		super(name);
	}

	public WeakMonster(String name, String noise) {
		super(name);
		this.noise = noise;

	}

	@Override
	public void makeNoise() {
		super.makeNoise();
		System.out.println("I am the weak monster");
		System.out.println(noise);

	}

}