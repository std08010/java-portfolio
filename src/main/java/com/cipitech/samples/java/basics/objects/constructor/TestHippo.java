package com.cipitech.samples.java.basics.objects.constructor;

/**
 * Book: Head First Java
 * Chapter: 09
 */
public class TestHippo
{
	public static void main(String[] args)
	{
		System.out.println("Starting...");
		Hippo h = new Hippo("Buffy");
		System.out.println(h.getName());
	}
}

class Animal
{
	private String name;

	public Animal(String theName)
	{
		name = theName;

		System.out.println("Making an Animal");
	}

	public String getName()
	{
		return name;
	}
}

class Hippo extends Animal
{
	public Hippo(String name)
	{
		super(name);

		System.out.println("Making a Hippo");
	}
}
