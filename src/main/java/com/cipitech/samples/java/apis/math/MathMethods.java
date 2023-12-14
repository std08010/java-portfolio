package com.cipitech.samples.java.apis.math;

/**
 * Book: Head First Java
 * Chapter: 10
 */
public class MathMethods
{
	static void abs()
	{
		int x = Math.abs(-240);       // returns 240
		double d = Math.abs(240.45);  // returns 240.45
	}

	static void random()
	{
		double r1 = Math.random();
		System.out.println("r1 = " + r1);
		int r2 = (int) (Math.random() * 5);
		System.out.println("r2 = " + r2);
	}

	static void round()
	{
		int x = Math.round(-24.8f);  // returns -25
		System.out.println("x = " + x);
		int y = Math.round(24.45f);  // returns 24
		System.out.println("y = " + y);

		long z = Math.round(24.45);  // returns 24L
		System.out.println("z = " + z);
	}

	static void min()
	{
		int x = Math.min(24, 240);  // returns 24
		System.out.println("x = " + x);

		double y = Math.min(90876.5, 90876.49);  // returns 90876.49
		System.out.println("y = " + y);
	}

	static void max()
	{
		int x = Math.max(24, 240);  // returns 240
		System.out.println("x = " + x);
		double y = Math.max(90876.5, 90876.49);  // returns 90876.5
		System.out.println("y = " + y);
	}

	static void sqRt()
	{
		double x = Math.sqrt(9);    //return 3
		System.out.println("x = " + x);
		double y = Math.sqrt(42.0); // returns 6.48074069840786
		System.out.println("y = " + y);
	}

	public static void main(String[] args)
	{
		abs();
		random();
		round();
		min();
		max();
		sqRt();
	}
}
