package com.skilldistillery.game.app;

import java.util.Scanner;

import com.skilldistillery.game.entities.Clown;
import com.skilldistillery.game.entities.GameCharacter;
import com.skilldistillery.game.entities.King;
import com.skilldistillery.game.entities.Maze;
import com.skilldistillery.game.entities.Queen;

public class GameApp {
	private GameCharacter player;
	private Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		GameApp game = new GameApp();
		game.run();
	}

	public void run() {
		Maze maze = new Maze();
		maze.initializeMaze();
		GameApp welcome = new GameApp();
		welcome.welcomeMenu();

	}

	public void welcomeMenu() {

		String response = " ";
		int selection;
		King king = new King();
		Queen queen = new Queen();
		Clown clown = new Clown();

		System.out.println(
				"Welcome to the Halloween Maze!\n" + "Would you like to play and move through the maze? Yes or No?");
		response = keyboard.nextLine();
		boolean running = true;

		while (running) {
			if (response.equals("yes")) {
				System.out.println("Please pick your Hero");
				System.out.println("---MENU-------");
				System.out.println("1) King       ");
				System.out.println("2) Queen      ");
				System.out.println("3) Clown      ");
				System.out.println("--------------");
				selection = keyboard.nextInt();
				keyboard.nextLine();

				switch (selection) {
				case 1:
					this.player = new King();
					break;
				case 2:
					player = new Queen();
					break;
				case 3:
					player = new Clown();
					break;
				default:
					System.out.println("Invalid input. You are too stoopid to play");
					break;
				// switch
				}

				running = false;

				if (player != null) {
					System.out.println(
							"Hello " + player.getName() + " and you have " + player.getPoints() + " health points. ");
					walkCharacter();

				} else {
					System.out.println("Invalid input. Try again");
					response = keyboard.nextLine();
					keyboard.nextLine();
					// response = yes
				}
			} else {
				System.out.println("Goodbye!");
				break;
			}

		}
	}// welcomemenu

	public void walkCharacter() {

		boolean notFree = false;
		String command;
		int playerRow = 1; // start row position
		int playerCol = 1; // start column position
		int weaponPoints = 0; 

		Maze maze = new Maze();
		maze.initializeMaze();
		String[][] themaze = maze.getThemaze();
		
		while (!notFree) {

			System.out.print("Enter your move:  (L) Left (F) Forward, (Q) to quit): ");
			command = keyboard.nextLine();

			if (command.toUpperCase().equals("Q")) {
				System.out.println("You are quitting? You will die when the dragon gets you!");
				notFree = true;
				break; // Exit the loop or method
				
			} else {
				switch (command.toUpperCase()) {
//				
//				case "F": // Move Forward
//                    if (playerRow + 1 < themaze.length) {
//                        if (themaze[playerRow + 1][playerCol] != null && !themaze[playerRow + 1][playerCol].equals("wall")) {
//                        	System.out.println("You moved forward " + themaze[playerRow + 1][playerCol]);
//                            playerRow++;
//                        } else {
//                            System.out.println("The cell forward is blocked, pick another direction.");
//                        }
//                    } else {
//                        System.out.println("You can't move forward, you're at the edge of the maze!");
//                    }
//                    break;
//                    
//				case "L": // Move Left
//                    if (playerCol > 0) {
//                        if (themaze[playerRow][playerCol - 1] != null && !themaze[playerRow][playerCol - 1].equals("wall")) {
//                        	System.out.println("You moved left to: " + themaze[playerRow][playerCol - 1]);
//                        	playerCol--;
//                            
//                            if (themaze[playerRow][playerCol] != null && themaze[playerRow][playerCol].contains("weapon")) {
//                                int points = 100; 
//                                weaponPoints += points;
//                                System.out.println("You collected a weapon! Total points: " + weaponPoints);
//                                themaze[playerRow][playerCol] = " "; // it removes the weapon from the maze
//                            }
//                            System.out.println("Cell Content: " + themaze[playerRow][playerCol]);
//                        } else {
//                            System.out.println("The cell to the left is blocked, try forward.");
//                        }
//                    } else {
//                        System.out.println("You can't move left, you're at the edge of the maze!");
//                        
//                    }
//                    break;
                    

                

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
					if (playerRow + 1 < themaze.length) {
                      if (themaze[playerRow + 1][playerCol] != null && !themaze[playerRow + 1][playerCol].equals(" ")) {
                      	System.out.println("You moved forward " + themaze[playerRow + 1][playerCol]);
                          playerRow++;
					} else if ((playerRow + 1) == 4 && (playerCol) == 2) {
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
					}

				case "Q": // Player has quit
					System.out.println("You are quitting? You will die when the dragon gets you!");
					notFree = true;
					break;
				default:
					System.out.println("Invalid move. Use (L) Left, (F) Forward to move.");
					break;
				} // switch

			} // else
		} // while

	}
}
