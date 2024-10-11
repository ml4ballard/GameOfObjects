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
		String response = " ";
		int selection=0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to the Halloween Maze!\n" 
		+ "Would you like to play and move through the maze? Yes or No?\n");
		
		response = keyboard.nextLine();
		
		if (response == "Yes") {
		System.out.println("Please pick your Hero");
		System.out.println("---MENU-------");
		System.out.println("1) King       ");
		System.out.println("2) Queen      ");
		System.out.println("3) Clown      ");
		System.out.println("--------------");
        selection = keyboard.nextInt();
        
        King king = new King("I'm the King");
        Queen queen = new Queen("I'm the Queen");
        Clown clown = new Clown("I'm the clown");
        	
        }
		switch (selection) {
		case 1: player = new King(selection);
				break;
		case 2: player = new Queen(selection);
				break;
		case 3: player = new Clown(selection);
				break;
		default:
			System.out.println("Invalid input. You are too stoopid to play");
			break;
		} // switch
	
} //response = yes
		
} //welcomemenu
