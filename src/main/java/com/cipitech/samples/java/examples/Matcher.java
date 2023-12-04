package com.cipitech.samples.java.examples;

/**
 * Book: Head First Java
 * Chapter: 01
 */
public class Matcher
{
	static int x = 0;
	static int y = 0;

	public static void main(String[] args)
	{
		while (x < 5)
		{
			match5();

			System.out.print(x + "" + y + " ");
			x = x + 1;
		}
	}

	private static void match1()
	{
		y = x - y;
	}

	private static void match2()
	{
		y = y + x;
	}

	private static void match3()
	{
		y = y + 2;
		if (y > 4)
		{
			y = y - 1;
		}
	}

	private static void match4()
	{
		x = x + 1;
		y = y + x;
	}

	private static void match5()
	{
		if (y < 5)
		{
			x = x + 1;
			if (y < 3)
			{
				x = x - 1;
			}
		}
		y = y + 2;
	}
}
