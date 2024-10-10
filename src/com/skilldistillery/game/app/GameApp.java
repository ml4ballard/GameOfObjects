package com.skilldistillery.game.app;

import com.skilldistillery.game.entities.Maze;

import java.util.Scanner;

public class GameApp {
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
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the Halloween Maze!\n" 
		+ "Would you like to play and move through the maze? Yes or No?\n");
		keyboard.nextLine();
		System.out.println("Please pick your Hero");
		
		System.out.println("---MENU-------");
		System.out.println("1) King       ");
		System.out.println("2) Queen      ");
		System.out.println("3) Clown      ");
		System.out.println("--------------");
		
		int selection = 0;
		if (keyboard.hasNextInt()) {
			selection = keyboard.nextInt();
			keyboard.nextLine();
		} else {
			System.out.println("Invalid input. Please enter a number between 1 and 3.");
			keyboard.nextLine();
		}
	}
}