package com.ladder;

public class SnakeBite {
	public static void main(String[] args) {
		final int start = 0;
		System.out.println("Single Player Start possition 0");
		System.out.println("Welcome to the Snake Ladder game");
		//to get random value
		int dieValue = (int) ((Math.random() * 100) % 6) + 1;
		System.out.println(dieValue);
	}
}