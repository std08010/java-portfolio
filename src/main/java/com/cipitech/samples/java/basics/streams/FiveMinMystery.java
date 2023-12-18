package com.cipitech.samples.java.basics.streams;

import java.util.List;
import java.util.Optional;

/**
 * Book: Head First Java
 * Chapter: 12
 */
public class FiveMinMystery
{
	public static void main(String[] args)
	{
		List<Coffee> coffees = List.of(new Coffee("Cappuccino", 3),
				new Coffee("Americano", 2), new Coffee("Espresso", 5),
				new Coffee("Cortado", 4), new Coffee("Mocha", 3),
				new Coffee("Flat White", 4), new Coffee("Latte", 3),
				new Coffee("Decaf", 1));

		Optional<String> afternoonCoffee = coffees.stream()
				.map(Coffee::name)
				.sorted()
				.findFirst();
		System.out.println(afternoonCoffee);

		Optional<String> weakCoffee = coffees.stream()
				.sorted()
				.map(coffee -> coffee.name)
				.findFirst();
		System.out.println(weakCoffee);
	}

//	private static class Coffee implements Comparable<Coffee>
//	{
//		private final String name;
//		private final int    strength;
//
//		public Coffee(String name, int strength)
//		{
//			this.name = name;
//			this.strength = strength;
//		}
//
//		public String getName()
//		{
//			return name;
//		}
//
//		public int getStrength()
//		{
//			return strength;
//		}
//
//		@Override
//		public int compareTo(Coffee other)
//		{
//			return this.strength - other.strength;
//		}
//	}

	private record Coffee(String name, int strength) implements Comparable<Coffee>
		{
			@Override
			public int compareTo(Coffee other)
			{
				return this.strength - other.strength;
			}
		}
}
