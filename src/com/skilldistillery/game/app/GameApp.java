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


		String[][] themaze = new String[8][4];
		themaze [1][1] = "keep walking";
		themaze [2][1] = "keep walking";
		themaze [3][1] = "keep walking";
		themaze [3][2] = "weapon";
		themaze [4][2] = "keep walking";
		themaze [4][3] = "weakMonster 20 point";		
		themaze [5][2] = "wall";
		themaze [5][3] = "keep walking";
		themaze [6][3] = "strongMonter 80 points";
		themaze [7][3] = "Exit and live";

//		Maze maze = new Maze();
//		maze.initializeMaze();
//		String[][] themaze = maze.getThemaze();

		
		while (!notFree) {

			System.out.print("Enter your move:  (L) Left (F) Forward, (Q) to quit): ");
			command = keyboard.nextLine();

			if (command.toUpperCase().equals("Q")) {
				System.out.println("You are quitting? You will die when the dragon gets you!");
				notFree = true;
				break; // Exit the loop or method
			} else 
			{ //start of else
				switch (command.toUpperCase()) {
				case "L": // Move Left
				{ // need for the whole case statement
//					System.out.println("start of moving left row col" + playerRow + " " + playerCol);
                        if (playerCol + 1 < themaze.length) {
 //                   	System.out.println("first left row col" + playerRow + " " + playerCol);
                            if (themaze[playerRow][playerCol+1] != null && !themaze[playerRow][playerCol+1].equals("wall")) {                       	
                            playerCol++;
 //                           System.out.println("second left row col" + playerRow + " " + playerCol);
                            if (themaze[playerRow][playerCol].contains("weapon")) {
                            	System.out.println("You moved left to: " + themaze[playerRow][playerCol]);
                                int points = 100; 
                                weaponPoints += points;
                                System.out.println("You collected a weapon! Total points: " + weaponPoints);
                            }                          
                            else if (themaze[playerRow][playerCol].contains("weakMonster 20 point")) {
                            	System.out.println("You moved left to: " + themaze[playerRow][playerCol]);
                                int points = 100; 
                                weaponPoints += points;
                                System.out.println("You battled a weak monster! Total points: -20 ");
                            }
                        } else {
                            System.out.println("The cell to the left is blocked, try forward.");
                        }
                    } else {
                    	System.out.println("moving left row col" + playerRow + " " + playerCol);
                        System.out.println("You can't move left, you're at the edge of the maze!");
                    }
				} // end of need for the whole case statement
                    break;

                case "F": // Move Forward
                    if (playerRow + 1 < themaze.length) {
                        if (themaze[playerRow + 1][playerCol] != null && !themaze[playerRow + 1][playerCol].equals("wall")) {
                            playerRow++;
 //                           System.out.println("row col" + playerRow + " " + playerCol);
                            if ((playerRow) == 7 && (playerCol) == 3) {
                            	System.out.println("You EXITED and LIVED!");
                            	notFree = true;
                            	break;                 
                            }
                            System.out.println("You moved forward " + themaze[playerRow][playerCol]);
                         
                            if (themaze[playerRow][playerCol].contains("weapon")) {
                                int points = 100;
                                weaponPoints += points;
                                System.out.println("You collected a weapon! Total points: " + weaponPoints);
                            }
                        } else {
                            System.out.println("The cell forward is blocked, pick another direction.");
                        }
                    } else {
                        System.out.println("You can't move forward, you're at the edge of the maze!");
                    }
                    break;                  
				default:
					System.out.println("Invalid move. Use (L) Left, (F) Forward to move.");
					break;
				} // switch

			} // else
		} // while

	}
}
