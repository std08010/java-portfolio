package com.cipitech.samples.java.examples;

/**
 * Book: Head First Java
 * Chapter: 02
 */
public class StreamingSongApp
{
	public static void main(String[] args)
	{
		StreamingSong song = new StreamingSong();
		song.artist = "The Beatles";
		song.title = "Come Together";
		song.play();
		song.printDetails();
	}
}

class StreamingSong
{
	String title;
	String artist;
	int    duration;

	void play()
	{
		System.out.println("Playing song");
	}

	void printDetails()
	{
		System.out.println("This is " + title + " by " + artist);
	}
}
