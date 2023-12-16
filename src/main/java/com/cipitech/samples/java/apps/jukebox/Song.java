package com.cipitech.samples.java.apps.jukebox;

import java.util.Objects;

/**
 * Book: Head First Java
 * Chapter: 11
 */
public class Song implements Comparable<Song>
{
	private String title;
	private String artist;
	private int    bpm;

	public Song(String title, String artist, int bpm)
	{
		this.title = title;
		this.artist = artist;
		this.bpm = bpm;
	}

	public String getTitle()
	{
		return title;
	}

	public String getArtist()
	{
		return artist;
	}

	public int getBpm()
	{
		return bpm;
	}

	@Override
	public String toString()
	{
		return title;
	}

	@Override
	public int compareTo(Song otherSong)
	{
		return title.compareTo(otherSong.getTitle());
	}

	@Override
	public boolean equals(Object o)
	{
		if (o == null || getClass() != o.getClass())
		{
			return false;
		}

		if (this == o)
		{
			return true;
		}

		Song song = (Song) o;
		return Objects.equals(title, song.title);
	}

	@Override
	public int hashCode()
	{
		return title != null ? title.hashCode() : 0;
	}
}
