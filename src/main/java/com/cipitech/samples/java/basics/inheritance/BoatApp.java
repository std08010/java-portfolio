package com.cipitech.samples.java.basics.inheritance;

/**
 * Book: Head First Java
 * Chapter: 07
 */
public class BoatApp
{
	public static void main(String[] args)
	{
		Boat b1 = new Boat();
		Sailboat b2 = new Sailboat();
		Rowboat b3 = new Rowboat();

		b2.setLength(32);

		b1.move();
		b3.move();
		b2.move();
	}
}

class Boat
{
	private int length;

	public int getLength()
	{
		return length;
	}

	public void setLength(int len)
	{
		length = len;
	}

	public void move()
	{
		System.out.print("drift ");
	}
}

class Rowboat extends Boat
{
	public void rowTheBoat()
	{
		System.out.print("stroke natasha");
	}
}

class Sailboat extends Boat
{
	public void move()
	{
		System.out.print("hoist sail ");
	}
}
