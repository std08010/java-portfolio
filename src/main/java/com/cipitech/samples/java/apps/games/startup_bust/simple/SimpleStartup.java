package com.cipitech.samples.java.apps.games.startup_bust.simple;

/**
 * Book: Head First Java
 * Chapter: 05
 */
public class SimpleStartup
{
	private int[] locationCells;
	private int   numOfHits;

	public static void main(String[] args)
	{
		SimpleStartup dot = new SimpleStartup();

//		int[] locations = {2, 3, 4};
		dot.setLocationCells(new int[]{2, 3, 4});

//		int userGuess = 2;
		String result = dot.checkYourself(2);

		String testResult = "failed";
		if (result.equals("hit"))
		{
			testResult = "passed";
		}
		System.out.println(testResult);
	}

	public String checkYourself(int guess)
	{
		//Make a variable to hold the result we’ll return. Put “miss” in as the default.
		String result = "miss";

		//Repeat with each cell in the locationCells array
		for (int cell : locationCells)
		{
			// Compare the user guess to this element (cell) in the array
			if (guess == cell)
			{
				result = "hit"; // We got a hit!
				numOfHits++;
				break; // Get out of the loop, no need to test the other cells
			}
		}

		//We’re out of the loop, but let’s see if we’re now ‘dead’ (hit 3 times) and change the result String to “Kill”
		if (numOfHits == locationCells.length)
		{
			result = "kill";
		}

		System.out.println(result); // Display the result for the user

		return result; // Return the result back to the calling method
	}

	public void setLocationCells(int[] locationCells)
	{
		this.locationCells = locationCells;
	}
}
