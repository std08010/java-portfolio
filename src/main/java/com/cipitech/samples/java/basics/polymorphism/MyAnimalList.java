package com.cipitech.samples.java.basics.polymorphism;

/**
 * Book: Head First Java
 * Chapter: 08
 */
public class MyAnimalList
{
	private Animal[] animals   = new Animal[5];
	private int      nextIndex = 0;

	public void add(Animal a)
	{
		if (nextIndex < animals.length)
		{
			animals[nextIndex] = a;
			System.out.println("Animal added at " + nextIndex);
			nextIndex++; //increment, to give us the next index to use
		}
	}
}
