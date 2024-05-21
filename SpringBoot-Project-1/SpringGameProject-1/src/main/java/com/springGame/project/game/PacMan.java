package com.springGame.project.game;

public class PacMan implements GameConsole{

	@Override
	public void up() {
		System.out.println("Go up");
	}

	@Override
	public void down() {
		System.out.println("Go down");
	}

	@Override
	public void left() {
		System.out.println("Go left");
	}

	@Override
	public void right() {
		System.out.println("Go right");
	}

}
