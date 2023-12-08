package com.cipitech.samples.java.apps.games.startup_bust;

import java.util.ArrayList;

/**
 * Book: Head First Java
 * Chapter: 06
 */
public class StartupBustGame
{
	// Declare and initialize the variables we’ll need
	private GameHelper         gameHelper   = new GameHelper();
	private ArrayList<Startup> startups     = new ArrayList<>();
	private int                numOfGuesses = 0;

	public static void main(String[] args)
	{
		StartupBustGame startupBustGame = new StartupBustGame(); // Create the game object
		startupBustGame.setupGame(); //Tell the game object to set up the game

		//Tell the game object to start the main game play loop (keeps asking for user input and checking the guess)
		startupBustGame.startPlaying();
	}

	public void createStartup(String name)
	{
		Startup startup = new Startup();
		startup.setName(name);
		startups.add(startup);
	}

	// first make some Startups and give them locations
	public void setupGame()
	{
		// Make three Startup objects, give ’em names, and stick ‘em in the ArrayList
		createStartup("cabista");
		createStartup("poniez");
		createStartup("hacqi");

		//Print brief instructions for user
		System.out.println("Your goal is to sink three Startups.");
		System.out.println("poniez, hacqi, cabista");
		System.out.println("Try to sink them all in the fewest number of guesses");

		//Repeat with each Startup in the list
		for (Startup startup : startups)
		{
			// Ask the helper for a Startup location
			ArrayList<String> newLocation = gameHelper.placeStartup(3);
			//Call the setter method on this Startup to give it the location you just got from the helper
			startup.setLocationCells(newLocation);
		}
	}

	public void startPlaying()
	{
		//As long as the Startup list is NOT empty
		while (!startups.isEmpty())
		{
			// Get user input
			String userGuess = GameHelper.getUserInputString("Enter a guess");
			// Call our own checkUserGuess method
			checkUserGuess(userGuess);
		}

		// Call our own finishGame method
		finishGame();
	}

	public void checkUserGuess(String userGuess)
	{
		// Increment the number of guesses the user has made by one.
		numOfGuesses++;

		String result = "miss"; // Assume it’s a ‘miss,’ unless told otherwise

		// Repeat with all Startups in the list
		for (Startup startup : startups)
		{
			// Ask the Startup to check the user guess, looking for a hit (or kill)
			result = startup.checkYourself(userGuess);

			if (result.equals("hit"))
			{
				//Get out of the loop early, no point in testing the others
				break;
			}
			else if (result.equals("kill"))
			{
				//This one’s dead, so take it out of the Startups list then get out of the loop
				startups.remove(startup);
				break;
			}
		}

		//Print the result for the user
		System.out.println(result);
	}

	//Print a message telling the user how they did in the game
	public void finishGame()
	{
		System.out.println("GAME OVER");
		System.out.println("All Startups are dead! Your stock is now worthless");
		System.out.println("You took " + numOfGuesses + " guesses");

		if (numOfGuesses < 10)
		{
			System.out.println("PERFECT SCORE");
		}
		else if (numOfGuesses < 20)
		{
			System.out.println("VERY GOOD");
			System.out.println("You got out before your options sank.");
		}
		else
		{
			System.out.println("VERY BAD");
			System.out.println("Fish are dancing with your options");
		}
	}
}
