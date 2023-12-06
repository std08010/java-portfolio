package com.cipitech.samples.java.basics.methods;

/**
 * Book: Head First Java
 * Chapter: 04
 */
public class Dog
{
	int    size;
	String name;

	public static void main(String[] args)
	{
		Dog one = new Dog();
		one.size = 70;

		Dog two = new Dog();
		two.size = 8;

		Dog three = new Dog();
		three.size = 35;

		one.bark(2);
		two.bark(3);
		three.bark(2);
	}

	void bark(int numOfBarks)
	{
		while (numOfBarks > 0)
		{
			if (size > 60)
			{
				System.out.println("Woof!");
			}
			else if (size > 14)
			{
				System.out.println("Ruff!");
			}
			else
			{
				System.out.println("Yip!");
			}

			numOfBarks = numOfBarks - 1;
		}
	}
}
