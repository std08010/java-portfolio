package com.cipitech.samples.java.basics.methods;

/**
 * Book: Head First Java
 * Chapter: 04
 */
public class ElectricGuitar
{
	// You don’t have to initialize instance variables, because they always have a default value.
	// Number primitives (including char) get 0, booleans get false, and object reference variables get null.
	private String  brand;
	private int     numOfPickups;
	private boolean rockStarUsesIt;

	public static void main(String[] args)
	{
		ElectricGuitar guitar = new ElectricGuitar();
		System.out.println("ElectricGuitar brand is " + guitar.getBrand());
		System.out.println("ElectricGuitar numOfPickups is " + guitar.getNumOfPickups());
		System.out.println("ElectricGuitar rockStarUsesIt is " + guitar.getRockStarUsesIt());
	}

	public String getBrand()
	{
		return brand;
	}

	public void setBrand(String brand)
	{
		this.brand = brand;
	}

	public int getNumOfPickups()
	{
		return numOfPickups;
	}

	public void setNumOfPickups(int numOfPickups)
	{
		this.numOfPickups = numOfPickups;
	}

	public boolean getRockStarUsesIt()
	{
		return rockStarUsesIt;
	}

	public void setRockStarUsesIt(boolean rockStarUsesIt)
	{
		this.rockStarUsesIt = rockStarUsesIt;
	}
}
