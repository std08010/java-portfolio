package com.cipitech.samples.java.examples;

/**
 * Book: Head First Java
 * Chapter: 02
 */
class DrumKitApp
{
	public static void main(String[] args)
	{
		DrumKit d = new DrumKit();

		d.playSnare();

		d.snare = false;

		if (d.snare)
		{
			d.playSnare();
		}

		d.playTopHat();
	}
}

class DrumKit
{
	boolean topHat = true;
	boolean snare  = true;

	void playSnare()
	{
		System.out.println("bang bang ba-bang");
	}

	void playTopHat()
	{
		System.out.println("ding ding da-ding");
	}
}
