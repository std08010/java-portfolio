package com.cipitech.samples.java.basics.objects.constructor;

/**
 * Book: Head First Java
 * Chapter: 09
 */
public class Duck
{
	int size;

	public Duck()
	{
		this(27);
	}

	public Duck(int duckSize)
	{
		System.out.println("Quack");

		// use duckSize parameter
		size = duckSize;

		System.out.println("size is " + size);
	}
}

