package com.cipitech.samples.java.basics;

/**
 * Book: Head First Java
 * Chapter: 01
 */
public class ConditionalBranching
{
	public static void main(String[] args)
	{
		ifCondition();
		ifElseCondition();
	}

	private static void ifCondition()
	{
		int x = 3;

		if (x == 3)
		{
			System.out.println("x must be 3");
		}

		System.out.println("This runs no matter what");
	}

	private static void ifElseCondition()
	{
		int x = 2;

		if (x == 3)
		{
			System.out.println("x must be 3");
		}
		else
		{
			System.out.println("x is NOT 3");
		}

		System.out.println("This runs no matter what");
	}
}
