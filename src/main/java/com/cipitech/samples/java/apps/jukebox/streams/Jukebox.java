package com.cipitech.samples.java.apps.jukebox.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Book: Head First Java
 * Chapter: 12
 */
public class Jukebox
{
	public static void main(String[] args)
	{
		List<Song> songList = MockSongs.getSongs();

		filterRockSongs(songList);
		filterAllRockSongs(songList);
		filterBeatles(songList);
		filterTitleStartsWithH(songList);
		filterAfter1995(songList);

		getAllDistinctGenres(songList);
		getSpecificSinger(songList);

		getOrderedPerYear(songList);
	}

	static void filterRockSongs(List<Song> songList)
	{
		System.out.println("filterRockSongs");
		List<Song> rockSongs = songList.stream()
				.filter(song -> "rock".equalsIgnoreCase(song.getGenre()))
				.toList();

		rockSongs.forEach(System.out::println);
	}

	static void filterAllRockSongs(List<Song> songList)
	{
		System.out.println("filterAllRockSongs");
		List<Song> rockSongs = songList.stream()
				.filter(song -> song.getGenre().contains("Rock"))
				.toList();

		rockSongs.forEach(System.out::println);
	}

	static void filterBeatles(List<Song> songList)
	{
		System.out.println("filterBeatles");
		List<Song> songs = songList.stream()
				.filter(song -> "The Beatles".equalsIgnoreCase(song.getArtist()))
				.toList();

		songs.forEach(System.out::println);
	}

	static void filterTitleStartsWithH(List<Song> songList)
	{
		System.out.println("filterTitleStartsWithH");
		List<Song> songs = songList.stream()
				.filter(song -> song.getTitle().startsWith("H"))
				.toList();

		songs.forEach(System.out::println);
	}

	static void filterAfter1995(List<Song> songList)
	{
		System.out.println("filterAfter1995");
		List<Song> songs = songList.stream()
				.filter(song -> song.getYear() > 1995)
				.toList();

		songs.forEach(System.out::println);
	}

	static void getAllDistinctGenres(List<Song> songList)
	{
		System.out.println("getAllDistinctGenres");

		List<String> genres = songList.stream()
				.map(song -> song.getGenre())
				.distinct()
				.toList();

		System.out.println(genres);

		System.out.println(songList.stream()
				.map(Song::getGenre)
				.distinct()
				.count());

		Map<String, Long> genreCount = songList.stream()
				.map(Song::getGenre)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("genreCount = " + genreCount);
	}

	static void getSpecificSinger(List<Song> songList)
	{
		System.out.println("getSpecificSinger");

		String songTitle = "With a Little Help from My Friends";
		List<String> result = songList.stream()
				.filter(song -> song.getTitle().equals(songTitle))
				.map(Song::getArtist)
				.filter(artist -> !artist.equals("The Beatles"))
				.collect(Collectors.toList());

		System.out.println(result);
	}

	static void getOrderedPerYear(List<Song> songList)
	{
		System.out.println("getOrderedPerYear");
		List<Song> songs = songList.stream()
				.sorted(Comparator.comparingInt(Song::getYear))
				.toList();

		songs.forEach(System.out::println);
	}
}
