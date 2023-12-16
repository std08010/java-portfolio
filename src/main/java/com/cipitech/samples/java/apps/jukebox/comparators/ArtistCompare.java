package com.cipitech.samples.java.apps.jukebox.comparators;

import com.cipitech.samples.java.apps.jukebox.Song;

import java.util.Comparator;

/**
 * Book: Head First Java
 * Chapter: 11
 */
public class ArtistCompare implements Comparator<Song>
{
	@Override
	public int compare(Song o1, Song o2)
	{
		if(o1.getArtist() == null || o2.getArtist() == null)
		{
			return 0;
		}

		return o1.getArtist().compareTo(o2.getArtist());
	}
}
