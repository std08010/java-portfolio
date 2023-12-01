package com.cipitech.samples.java.apps.guessing_game;

public class Player
{
	int number; // the number the player guessed (between 0 and 9)

	void guess()
	{
		number = (int) (Math.random() * 10);
		System.out.println("I’m guessing " + number);
	}
}
