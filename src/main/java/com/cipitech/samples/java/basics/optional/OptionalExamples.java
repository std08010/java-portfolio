package com.cipitech.samples.java.basics.optional;

import java.util.Optional;

/**
 * Book: Head First Java
 * Chapter: 12
 */
public class OptionalExamples
{
	public static void main(String[] args)
	{
		Optional<IceCream> optional = getIceCream("Strawberry");

		if (optional.isPresent())
		{
			IceCream ice = optional.get();
			ice.eat();
		}
		else
		{
			System.out.println("No ice cream for you!");
		}
	}

	private static Optional<IceCream> getIceCream(String flavour)
	{
//		return Optional.ofNullable(null);
		return Optional.empty();
	}

	private static class IceCream
	{
		void eat()
		{
		}
	}
}
