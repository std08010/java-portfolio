package com.cipitech.samples.java.basics.java_api;

import java.util.ArrayList;

/**
 * Book: Head First Java
 * Chapter: 06
 */
public class Egg
{
	public static void main(String[] args)
	{
		ArrayList<Egg> myList = new ArrayList<>();

		Egg egg1 = new Egg();
		myList.add(egg1);

		Egg egg2 = new Egg();
		myList.add(egg2);

		System.out.println("ArrayList size: " + myList.size());
		System.out.println("ArrayList contains egg1: " + myList.contains(egg1));
		System.out.println("Index of egg2: " + myList.indexOf(egg2));

		myList.remove(egg1);

		System.out.println("ArrayList is empty: " + myList.isEmpty());
	}
}
