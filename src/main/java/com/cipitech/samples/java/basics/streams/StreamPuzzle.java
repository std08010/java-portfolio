package com.cipitech.samples.java.basics.streams;

import com.cipitech.samples.java.apps.jukebox.streams.MockSongs;
import com.cipitech.samples.java.apps.jukebox.streams.Song;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Book: Head First Java
 * Chapter: 12
 */
public class StreamPuzzle
{
	public static void main(String[] args)
	{
		SongSearch songSearch = new SongSearch();
		songSearch.printTopFiveSongs();
		songSearch.search("The Beatles");
		songSearch.search("The Beach Boys");
	}
}

class SongSearch
{
	private final List<Song> songs = MockSongs.getSongs();

	void printTopFiveSongs()
	{
		List<String> topFive = songs.stream()
				.sorted(Comparator.comparingInt(Song::getTimesPlayed))
				.limit(5)
				.map(song -> song.getTitle())
				.collect(Collectors.toList());
		System.out.println(topFive);
	}

	void search(String artist)
	{
		Optional<Song> result = songs.stream()
				.filter(song -> song.getArtist().equals(artist))
				.findFirst();

		if (result.isPresent())
		{
			System.out.println(result.get().getTitle());
		}
		else
		{
			System.out.println("No songs found by: " + artist);
		}
	}
}
