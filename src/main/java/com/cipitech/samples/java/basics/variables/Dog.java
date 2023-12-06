package com.cipitech.samples.java.basics.variables;

/**
 * Book: Head First Java
 * Chapter: 03
 */
public class Dog
{
	String name;

	public static void main(String[] args)
	{
		// make a Dog object and access it
		Dog dog1 = new Dog();
		dog1.bark();

		// Strings are a special type of object.
		// You can create and assign them as if they were primitives (even though they're references).
		dog1.name = "Bart";

		// now make a Dog array
		Dog[] myDogs = new Dog[3];

		// and put some dogs in it
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;

		// now access the Dogs using the array references
		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";

		// Hmmmm... what is myDogs[2] name?
		System.out.print("last dog’s name is ");
		System.out.println(myDogs[2].name);

		// now loop through the array and tell all dogs to bark
		int x = 0;
		// arrays have a variable ‘length’ that gives you the number of elements in the array
		while (x < myDogs.length)
		{
			myDogs[x].bark();
			x = x + 1;
		}
	}

	public void bark()
	{
		System.out.println(name + " says Ruff!");
	}

	public void eat()
	{
	}

	public void chaseCat()
	{
	}
}
