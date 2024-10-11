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
		boolean running =true;
		while (running) {
			if (response.equals("yes")) {
				System.out.println("Please pick your Hero");
				System.out.println("---MENU-------");
				System.out.println("1) King       ");
				System.out.println("2) Queen      ");
				System.out.println("3) Clown      ");
				System.out.println("--------------");
				selection = keyboard.nextInt();


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
					System.out.println("Hello " + player.getName());
					
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
	}
}// welcomemenu
