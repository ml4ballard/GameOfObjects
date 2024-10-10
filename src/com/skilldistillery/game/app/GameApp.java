package com.skilldistillery.game.app;

import com.skilldistillery.game.entities.Maze;

public class GameApp{
	public static void main(String[] args){
		GameApp game = new GameApp();
		game.run();
	}

	public void run() {
		Maze maze = new Maze();
		maze.initializeMaze();
	
	}
}