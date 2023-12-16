package com.cipitech.samples.java.apps.jukebox;

import java.util.ArrayList;
import java.util.List;

/**
 * Book: Head First Java
 * Chapter: 11
 */
class MockSongs
{
	public static List<String> getSongStrings()
	{
		List<String> songs = new ArrayList<>();
		songs.add("somersault");
		songs.add("cassidy");
		songs.add("$10");
		songs.add("havana");
		songs.add("Cassidy");
		songs.add("50 Ways");
		return songs;
	}

	public static List<Song> getSongs()
	{
		List<Song> songs = new ArrayList<>();

		songs.add(new Song("somersault", "zero 7", 147));
		songs.add(new Song("cassidy", "grateful dead", 158));
		songs.add(new Song("$10", "hitchhiker", 140));
		songs.add(new Song("havana", "cabello", 105));
		songs.add(new Song("Cassidy", "grateful dead", 158));
		songs.add(new Song("50 ways", "simon", 102));

		return songs;
	}

	public static List<Song> getSongsWithDuplicates()
	{
		List<Song> songs = new ArrayList<>();

		songs.add(new Song("somersault", "zero 7", 147));
		songs.add(new Song("cassidy", "grateful dead", 158));
		songs.add(new Song("$10", "hitchhiker", 140));
		songs.add(new Song("havana", "cabello", 105));
		songs.add(new Song("$10", "hitchhiker", 140));
		songs.add(new Song("cassidy", "grateful dead", 158));
		songs.add(new Song("50 ways", "simon", 102));

		return songs;
	}
}
