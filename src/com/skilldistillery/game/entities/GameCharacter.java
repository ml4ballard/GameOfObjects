package com.skilldistillery.game.entities;

public abstract class GameCharacter {
	private String name;
	private String noise;
	private int points;
	private String walk;

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

	private void walkCharacter() {
		String walk = "I'm taking one step";
		
		
		Boolean notFree = false;
		String command = "";
		while (!notFree) {

			System.out.print("Enter your move (L)eft (F)orward, (Q) to quit): ");
//          
//            command = scanner.nextLine();

			if (command.toUpperCase().equals("Q")) {
				System.out.println("You are quitting? You will die when the dragon gets you!");
				notFree = false;
				break; // Exit the loop or method
			} else {

				int playerRow = 1; // start row position
				int playerCol = 1; // start column position

				String[][] themaze = new String[0][0];

				switch (command.toUpperCase()) {
				case "L": // Move Left
					if (playerRow == 1 && (playerCol + 1) == 1) {
						System.out.println("The cell to the left contains a weapon for you! Grab it");
						playerCol = playerCol + 1;
					} else if (playerRow == 2 && (playerCol + 1) == 2) {
						System.out.println("The cell to the left contains a weak monster, get ready to fight");
						playerCol = playerCol + 1;
					} else if (themaze[playerRow][playerCol + 1] == " ") {
						System.out.println("The cell to the left is open");
						playerCol = playerCol + 1;
					} else
						System.out.println("The cell to the left is blocked, try forward");
					break;
				case "F": // Move forward
					if ((playerRow + 1) == 4 && (playerCol) == 2) {
						System.out
								.println("The cell forward contains a strong monster, get ready to fight to continue.");
						playerCol = playerCol + 1;
					} else if ((playerRow + 1) == 5 && (playerCol) == 2) {
						System.out.println("You are free!");
						notFree = true;
						playerCol = playerCol + 1;
					} else if (themaze[playerRow + 1][playerCol] == " ") {
						System.out.println("The cell to forward is open");
						playerRow = playerRow + 1;
					} else
						System.out.println("The cell forward is blocked, pick another direction");
					break;

				case "Q": // Player has quit
					System.out.println("You are quitting? You will die when the dragon gets you!");
					notFree = true;
					break;
				default:
					System.out.println("Invalid move. Use (L)eft (F)orward to move.");
				} // switch

			} // else
		} // while

	} // static void
//	}
	
	public String getWalk() {
		return walk;
	}

	public void setWalk(String walk) {
		this.walk = walk;
	}

	@Override
	public String toString() {
		return "GameCharacter [name=" + name + ", noise=" + noise + ", points=" + points + "]";
	}
	

}