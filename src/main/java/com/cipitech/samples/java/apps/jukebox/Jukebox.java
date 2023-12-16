package com.cipitech.samples.java.apps.jukebox;

import com.cipitech.samples.java.apps.jukebox.comparators.ArtistCompare;
import com.cipitech.samples.java.apps.jukebox.comparators.TitleCompare;

import java.util.*;

/**
 * Book: Head First Java
 * Chapter: 11
 */
public class Jukebox
{
	public static void main(String[] args)
	{
		Jukebox jukebox = new Jukebox();
		jukebox.unsortedSongStrings();
		jukebox.sortedSongStrings();

		jukebox.sortedSongs();
		jukebox.sortedSongsComparator();
		jukebox.sortedSongsLambda();

		jukebox.sortedSongsHashSet();
	}

	public void unsortedSongStrings()
	{
		System.out.println("unsortedSongStrings");
		List<String> songList = MockSongs.getSongStrings();
		System.out.println(songList);
	}

	public void sortedSongStrings()
	{
		System.out.println("sortedSongStrings");
		List<String> songList = MockSongs.getSongStrings();
		Collections.sort(songList);
		System.out.println(songList);
	}

	public void sortedSongs()
	{
		System.out.println("sortedSongs");

		List<Song> songList = MockSongs.getSongs();
		songList.forEach(mySong -> System.out.println(mySong));
		System.out.println(songList);

		// In order for sort() to compile the Song class must implement Comparable interface
		Collections.sort(songList);
		System.out.println(songList);
	}

	public void sortedSongsComparator()
	{
		System.out.println("sortedSongsComparator");

		List<Song> songList = MockSongs.getSongs();
		songList.sort(new TitleCompare());
		System.out.println(songList);
		songList.sort(new ArtistCompare());
		System.out.println(songList);
	}

	public void sortedSongsLambda()
	{
		System.out.println("sortedSongsLambda");

		List<Song> songList = MockSongs.getSongs();

//		songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
		songList.sort(Song::compareTo);
		System.out.println(songList);
		//reverse order
		songList.sort((one, two) -> two.getTitle().compareTo(one.getTitle()));
		System.out.println(songList);
		songList.sort((one, two) -> -one.getTitle().compareTo(two.getTitle()));
		System.out.println(songList);

//		songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
		songList.sort(Comparator.comparing(Song::getArtist));
		System.out.println(songList);

//		songList.sort((o1, o2) -> {return o1.getBpm() - o2.getBpm();});
		songList.sort((o1, o2) -> o1.getBpm() - o2.getBpm());
//		songList.sort((o1, o2) -> Integer.compare(o1.getBpm(), o2.getBpm()));
//		songList.sort(Comparator.comparingInt(Song::getBpm));
		System.out.println(songList);
	}

	public void sortedSongsHashSet()
	{
		System.out.println("sortedSongsHashSet");

		List<Song> songList = MockSongs.getSongsWithDuplicates();
		System.out.println(songList);

		// You must override hashCode() and equals() to find the duplicates.
		Set<Song> songSet = new HashSet<>(songList);
		System.out.println(songSet);

		// TreeSet will find duplicates even if you don't override hashCode() and equals()
		// because it will use compareTo() method to find the duplicates where the compareTo returns 0.
		SortedSet<Song> songSortedSet = new TreeSet<>(songList);
		System.out.println(songSortedSet);

		Set<Song> songSortedSetWithComparator = new TreeSet<>((o1, o2) -> o1.getBpm() - o2.getBpm());
		songSortedSetWithComparator.addAll(songList);
		System.out.println(songSortedSetWithComparator);
	}
}
