package com.cipitech.samples.java.basics.objects;

/**
 * A class is the blueprint of an object.
 * Objects (aka instances) can have a type of Class
 */
public class Dog
{
	// Instance Variables / State / Data / What the object knows
	int    size;
	String breed;
	String name;

	// Methods / Behavior / What the object does
	void bark()
	{
		System.out.println("Ruff! Ruff!");
	}
}
