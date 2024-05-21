package com.springGame.project.game;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springGame.project.game")
public class Game {
	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(Game.class)) {
			context.getBean(GameConsole.class).up();
			
			context.getBean(GameRunner.class).run();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		var game = new Mario();
//		var game = new SuperContra();
//		var game = new PacMan();
//		var gameRunner = new GameRunner(game);
//		gameRunner.run();
	
	}

}
