package com.springGame.project.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Game {
	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
		
		context.getBean(GameConsole.class).up();
		
		context.getBean(GameRunner.class).run();

//		var game = new Mario();
//		var game = new SuperContra();
//		var game = new PacMan();
//		var gameRunner = new GameRunner(game);
//		gameRunner.run();
	
	}

}
