package com.cipitech.samples.java.basics.collections;

import java.util.*;

/**
 * Book: Head First Java
 * Chapter: 11
 */
public class CollectionsFactoryMethods
{
	public static void main(String[] args)
	{
		createAListOldSchool();
		createAList();
		createASet();
		createAMap();
		createAMapOfSameTypes();
		createAMapOfEntries();
	}

	public static List<String> createAListOldSchool()
	{
		List<String> songs = new ArrayList<>();
		songs.add("somersault");
		songs.add("cassidy");
		songs.add("$10");
		return Collections.unmodifiableList(songs);
	}

	public static void createAList()
	{
		List<String> strings = List.of("somersault", "cassidy", "$10");
	}

	public static void createASet()
	{
		Set<String> books = Set.of("How Cats Work", "Remix your Body", "Finding Emo");
	}

	public static void createAMap()
	{
		Map<String, Integer> scores = Map.of(
				"Kathy", 42,
				"Bert", 343,
				"Skyler", 420);
	}

	public static void createAMapOfSameTypes()
	{
		Map<String, String> favouriteStores = Map.of(
				"Riley", "Supersports",
				"Brooklyn", "Camera World",
				"Jay", "Homecase");
	}

	public static void createAMapOfEntries()
	{
		Map<String, String> favouriteStores = Map.ofEntries(
				Map.entry("Riley", "Supersports"),
				Map.entry("Brooklyn", "Camera World"),
				Map.entry("Jay", "Homecase"));
	}
}
