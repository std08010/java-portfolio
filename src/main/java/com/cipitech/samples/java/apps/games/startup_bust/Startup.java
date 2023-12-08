package com.cipitech.samples.java.apps.games.startup_bust;

import java.util.ArrayList;

/**
 * Book: Head First Java
 * Chapter: 06
 */
public class Startup
{
	private String            name;
	private ArrayList<String> locationCells;

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
			// Using ArrayList’s remove() method to delete an entry.
			locationCells.remove(index);

			// If the list is empty, this was the killing blow!
			if (locationCells.isEmpty())
			{
				result = "kill";
				// Tell the user when a Startup has been sunk.
				System.out.println("Ouch! You sunk " + name + " :( ");
			}
			else
			{
				result = "hit";
			}
		}

		return result; // Return the result back to the calling method
	}

	// A setter method that updates the Startup’s location.
	// (Random location provided by the GameHelper placeStartup() method.)
	public void setLocationCells(ArrayList<String> locationCells)
	{
		this.locationCells = locationCells;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
