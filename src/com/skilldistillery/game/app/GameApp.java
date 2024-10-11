package com.skilldistillery.game.app;

import com.skilldistillery.game.entities.Clown;
import com.skilldistillery.game.entities.GameCharacter;
import com.skilldistillery.game.entities.King;
import com.skilldistillery.game.entities.Maze;
import com.skilldistillery.game.entities.Queen;

import java.util.Scanner;

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
		int selection = 0;

		System.out.println("Welcome to the Halloween Maze!\n"
		+ "Would you like to play and move through the maze? Yes or No?");

		response = keyboard.nextLine();
		
			System.out.println("Please pick your Hero");
			System.out.println("---MENU-------");
			System.out.println("1) King       ");
			System.out.println("2) Queen      ");
			System.out.println("3) Clown      ");
			System.out.println("--------------");
			selection = keyboard.nextInt();
			if (response.equals("Yes")){
				keyboard.nextLine();
				
//			 fix when printing out no
			King king = new King();
			Queen queen = new Queen();
			Clown clown = new Clown();

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
		if (player != null) {
			king.getName();
			System.out.println("You entered: " + player);
			keyboard.nextLine();
		} else {
			System.out.println("Invalid input. Try again");
		}
		
		
		} // response = yes 

		

	}
}// welcomemenu
