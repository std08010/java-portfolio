package com.cipitech.samples.java.apps.games.startup_bust.simple;

import com.cipitech.samples.java.apps.games.startup_bust.GameHelper;

import java.util.ArrayList;

/**
 * Book: Head First Java
 * Chapter: 06
 */
public class StartupBustGame
{
	public static void main(String[] args)
	{
		// Make a variable to track how many guesses the user makes.
		int numOfGuesses = 0;

		// Make the Startup object.
		Startup theStartup = new Startup();

		// Make a random number for the first cell, and use it to make the cell locations.
		int randomNum = (int) (Math.random() * 5);
		ArrayList<String> locations = new ArrayList<>();
		locations.add(String.valueOf(randomNum));
		locations.add(String.valueOf(randomNum + 1));
		locations.add(String.valueOf(randomNum + 2));

		// Give the Startup its locations.
		theStartup.setLocationCells(locations);

		// Make a boolean variable to track whether the game is still alive, to use in the while loop test.
		boolean isAlive = true;

		// Repeat while game is still alive.
		while (isAlive)
		{
			// Get user guess.
			String userGuess = GameHelper.getUserInputString("enter a square");

			// Ask the startup to check the guess. save the returned result.
			String result = theStartup.checkYourself(userGuess);

			// Increment guess count by one.
			numOfGuesses++;

			// Was it a “kill”? if so, set isAlive to false (so we won’t re-enter the loop) and print user guess count.
			if (result.equals("kill"))
			{
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}
	}
}
