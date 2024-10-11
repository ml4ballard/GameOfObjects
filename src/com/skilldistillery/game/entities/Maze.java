package com.skilldistillery.game.entities;

public class Maze {
	private String[][] themaze = new String[6][4]; //6 is floor row, 4 is left or right column
	
	public void initializeMaze() {

		// Fill the array with values to symbolize the Maze

		themaze[0] = new String[] { " ", "w", "w", "w" };
		themaze[1] = new String[] { " ", "weapon", "w", "w" };
		themaze[2] = new String[] { "w", " ", "weakMonster", "w" };
		themaze[3] = new String[] { "w", "w", " ", "w" };
		themaze[4] = new String[] { "w", "w", "strongMonster", "w" };
		themaze[5] = new String[] { "w", "w", "exitAndLive", "w" };

/*		// Print the array for fun
		for (int i = 0; i < themaze.length; i++) {
			for (int j = 0; j < themaze[i].length; j++) {
				System.out.print(themaze[i][j] + " ");
			}
			System.out.println();
		} */
	}
}