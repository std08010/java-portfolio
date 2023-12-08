package com.cipitech.samples.java.apps.games.startup_bust.simple;

import java.util.ArrayList;

/**
 * Book: Head First Java
 * Chapter: 06
 */
public class Startup
{
	private ArrayList<String> locationCells;

	public static void main(String[] args)
	{
		Startup dot = new Startup();

		ArrayList<String> locations = new ArrayList<>();
		locations.add("2");
		locations.add("3");
		locations.add("4");
		dot.setLocationCells(locations);

		String result = dot.checkYourself("2");

		String testResult = "failed";
		if (result.equals("hit"))
		{
			testResult = "passed";
		}
		System.out.println(testResult);
	}

	public String checkYourself(String userInput)
	{
		// Make a variable to hold the result we’ll return. Put “miss” in as the default.
		String result = "miss";

		// Find out if the user guess is in the ArrayList, by asking for its index.
		// If it’s not in the list, then indexOf() returns a -1.
		int index = locationCells.indexOf(userInput);

		// If index is greater than or equal to zero, the user guess is definitely in the list, so remove it.
		if (index >= 0)
		{
			locationCells.remove(index);

			// If the list is empty, this was the killing blow!
			if (locationCells.isEmpty())
			{
				result = "kill";
			}
			else
			{
				result = "hit";
			}
		}

		System.out.println(result); // Display the result for the user

		return result; // Return the result back to the calling method
	}

	public void setLocationCells(ArrayList<String> locationCells)
	{
		this.locationCells = locationCells;
	}
}
