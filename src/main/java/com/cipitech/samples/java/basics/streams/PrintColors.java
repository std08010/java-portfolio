package com.cipitech.samples.java.basics.streams;

import java.util.List;

/**
 * Book: Head First Java
 * Chapter: 12
 */
public class PrintColors
{
	public static void main(String[] args)
	{
		List<String> allColors = List.of("Red", "Blue", "Yellow");

		for (String color : allColors)
		{
			System.out.println(color);
		}

//		allColors.forEach(color -> System.out.println(color));
		allColors.forEach(System.out::println);
	}
}
