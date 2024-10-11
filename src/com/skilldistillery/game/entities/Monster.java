
package com.skilldistillery.game.entities;

public abstract class Monster {
   private String noise;
   
	public Monster(String noise) {
	}

	public void makeNoise() {
		
	}

	public String getNoise() {
		return noise;
	}

	public void setNoise(String noise) {
		this.noise = noise;
	}
	
}