package com.cipitech.samples.java.basics.polymorphism;

/**
 * Book: Head First Java
 * Chapter: 08
 */
public class AnimalApp
{
	public static void main(String[] args)
	{
		MyAnimalList list = new MyAnimalList();
		Dog dog = new Dog();
		Cat cat = new Cat();
		list.add(dog);
		list.add(cat);
	}
}
