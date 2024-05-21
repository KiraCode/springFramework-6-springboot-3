package com.springGame.project.game;

import org.springframework.stereotype.Component;

@Component
//@Qualifier("superContra")
public class SuperContra implements GameConsole{

	public void up() {
		System.out.println("Jump");
	}

	public void down() {
		System.out.println("Sit Down");
	}

	public void left() {
		System.out.println("Go back");
	}

	public void right() {
		System.out.println("Shoot");
	}
}
