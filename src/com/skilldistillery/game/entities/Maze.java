package com.skilldistillery.game.entities;

public class Maze {
	private String[][] themaze = new String[6][4]; //6 is floor , 4 is left or right
	public void initializeMaze() {

		// Fill the array with values to symbolize the Maze

		themaze[0] = new String[] { "enter", "wall", "wall", "wall" };
		themaze[1] = new String[] { "walk", "getWeapon", "wall", "wall" };
		themaze[2] = new String[] { "wall", "walk", "weakMonster", "wall" };
		themaze[3] = new String[] { "wall", "wall", "walk", "wall" };
		themaze[4] = new String[] { "wall", "wall", "strongMonster", "wall" };
		themaze[5] = new String[] { "wall", "wall", "exitAndLive", "wall" };

		// Print the array for fun
		for (int i = 0; i < themaze.length; i++) {
			for (int j = 0; j < themaze[i].length; j++) {
				System.out.print(themaze[i][j] + " ");
			}
			System.out.println();
		}
	}
}