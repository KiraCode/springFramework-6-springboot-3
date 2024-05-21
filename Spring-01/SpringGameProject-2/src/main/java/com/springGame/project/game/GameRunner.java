package com.springGame.project.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

	private GameConsole game;
	
	public GameRunner(@Qualifier("pacman") GameConsole game) {
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
