package com.cipitech.samples.java.apps.jukebox.streams;

/**
 * Book: Head First Java
 * Chapter: 12
 */
public class Song
{
	private final String title;
	private final String artist;
	private final String genre;
	private final int    year;
	private final int    timesPlayed;

	public Song(String title, String artist, String genre, int year, int timesPlayed)
	{
		this.title = title;
		this.artist = artist;
		this.genre = genre;
		this.year = year;
		this.timesPlayed = timesPlayed;
	}

	public String getTitle()
	{
		return title;
	}

	public String getArtist()
	{
		return artist;
	}

	public String getGenre()
	{
		return genre;
	}

	public int getYear()
	{
		return year;
	}

	public int getTimesPlayed()
	{
		return timesPlayed;
	}

	@Override
	public String toString()
	{
		return title + ",\t"
			   + artist + ",\t"
			   + genre + ",\t"
			   + year + ",\t"
			   + timesPlayed;
	}
}
