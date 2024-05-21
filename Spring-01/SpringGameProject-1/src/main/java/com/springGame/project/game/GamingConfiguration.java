package com.springGame.project.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

	@Bean
	public GameConsole game() {
		var game = new PacMan();
		return game;
	}
	
	@Bean
	public GameRunner runner(GameConsole game) {
		return new GameRunner(game);
	}
}
