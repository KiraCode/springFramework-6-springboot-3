package com.springGame.project.game;

public class GameRunner {

	private GameConsole game;
	
	public GameRunner(GameConsole game) {
		this.game = game;
	}
	
	public void run() {
		System.out.println("Game is running: "+game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
