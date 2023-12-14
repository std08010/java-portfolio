package com.cipitech.samples.java.basics.static_final;

/**
 * Book: Head First Java
 * Chapter: 10
 */
public class Duck
{
	// The static duckCount variable is initialized ONLY when the class is first loaded, NOT each time a new instance is made.
	// Because duckCount is static, Duck objects all share a single copy of it.
	// You can think of a static variable as a variable that lives in a CLASS instead of in an object.
	private static int duckCount = 0;

	private int size;

	public Duck()
	{
		// Now it will keep incrementing each time the Duck constructor runs, because duckCount is static and won’t be reset to 0.
		duckCount++;
	}

	public int getSize()
	{
		return size;
	}

	public void setSize(int s)
	{
		size = s;
	}
}