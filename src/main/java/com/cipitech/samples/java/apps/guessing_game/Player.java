package com.cipitech.samples.java.apps.guessing_game;

import java.util.Random;

/**
 * Book: Head First Java
 * Chapter: 02
 */
public class Player
{
	int number; // the number the player guessed (between 0 and 9)

	/**
	 * method for making a guess
	 */
	void guess()
	{
//		number = (int) (Math.random() * 10);
		Random randomGenerator = new Random();
		number = randomGenerator.nextInt(10);
		System.out.println("I’m guessing " + number);
	}
}
