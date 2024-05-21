package com.springGame.project.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mario implements GameConsole{

	public void up() {
		System.out.println("Jump");
	}

	public void down() {
		System.out.println("Go into the hole");
	}

	public void left() {
		System.out.println("Go Back");
	}

	public void right() {
		System.out.println("Accelerate");
	}
}
