package com.cipitech.samples.java.basics.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Book: Head First Java
 * Chapter: 11
 */
public class TestGenerics
{
	public static void main(String[] args)
	{
		List<Animal> animals = List.of(new Dog(), new Cat(), new Dog());
		takeAnimals(animals);

		List<Dog> dogs = List.of(new Dog(), new Dog());
		takeAnimalsWildcard(dogs);
		takeAnimalsGeneric(dogs);

		List<Dog> vaccinatedDogs = getVaccinatedAnimals(dogs);
		System.out.println(vaccinatedDogs);

		List<Animal> vaccinatedAnimals = getVaccinatedAnimals(animals);
		System.out.println(vaccinatedAnimals);

		List<? extends Animal> vaccinatedSomethings = getVaccinatedAnimalsWildcard(dogs);
		System.out.println(vaccinatedSomethings);
	}

	public static void takeAnimals(List<Animal> animals)
	{
		for (Animal a : animals)
		{
			a.eat();
		}
	}

	public static void takeAnimalsWildcard(List<? extends Animal> animals)
	{
		for (Animal a : animals)
		{
			a.eat();
		}
	}

	public static <T extends Animal> void takeAnimalsGeneric(List<T> animals)
	{
		for (T a : animals)
		{
			a.eat();
		}
	}

	public static <T extends Animal> List<T> getVaccinatedAnimals(List<T> animals)
	{
		return new ArrayList<>(animals);
	}

	public static List<? extends Animal> getVaccinatedAnimalsWildcard(List<? extends Animal> animals)
	{
		return List.of(new Cat());
	}
}

abstract class Animal
{
	void eat()
	{
		System.out.println("animal eating");
	}
}

class Dog extends Animal
{
	void bark()
	{
	}
}

class Cat extends Animal
{
	void meow()
	{
	}
}
	
	