package com.cipitech.samples.java.apps.jukebox;// JukeboxV3 - mock i/o and "played least"

import java.util.ArrayList;
import java.util.Collections;

/**
 * Book: Head First Java
 * Chapter: 12
 */
public class JukeboxLogging
{
	public static void main(String[] args)
	{
		// list songs in least played order

		// songs in the jukebox
		ArrayList<SongV3> songList = new ArrayList<>();
		songList.add(new SongV3(1, "Cassidy", "Grateful Dead", "Rock", 1972));
		songList.add(new SongV3(2, "Crazy Diamond", "Pink Floyd", "Rock", 1975));
		songList.add(new SongV3(3, "Rosen Im Asphalt", "Schnauss", "Electronic", 2017));
		songList.add(new SongV3(4, "Havana", "Cabillo", "R&B", 2017));
		songList.add(new SongV3(5, "Take Five", "Brubeck", "Jazz", 1959));
		songList.add(new SongV3(6, "Jumpin' Jack Flash", "Stones", "rock", 1964));
		songList.add(new SongV3(7, "Silence", "Delerium", "Trance", 1999));
		songList.add(new SongV3(8, "Lochs of Dread", "Strength in Numbers", "Newgrass", 1989));
		songList.add(new SongV3(9, "No Woman No Cry", "Marley", "Reggae", 1974));
		songList.add(new SongV3(10, "If I Ain't Got You", "Keys", "R&B", 2003));
		songList.add(new SongV3(11, "Don't Know Why", "Jones", "Jazz", 2002));
		songList.add(new SongV3(12, "Smooth", "Santana", "Rock", 1999));
		songList.add(new SongV3(13, "Come Together", "Beatles", "Rock", 1969));
		songList.add(new SongV3(14, "Love on a Real Train", "Tangerine Dream", "Electronic", 1984));
		songList.add(new SongV3(15, "Smoothie Song, Live", "Nickel Creek", "Newgrass", 2021));
		songList.add(new SongV3(16, "Switch Up", "Protoje", "Reggae", 2020));
		songList.add(new SongV3(17, "Stomp and Buck Dance", "Crusaders", "Jazz", 1974));
		songList.add(new SongV3(18, "Nature's Kingdom", "Delerium", "Trance", 2000));
		songList.add(new SongV3(19, "Eyes of the World", "Grateful Dead", "Rock", 1973));
		songList.add(new SongV3(20, "Midnight Train to Georgia", "Knight", "R&B", 1976));
		songList.add(new SongV3(21, "Black Clouds", "String Cheese", "Newgrass", 1997));
		songList.add(new SongV3(22, "What's Going On", "Gaye", "R&B", 1971));

		// log of songs played
		ArrayList<Log> logList = new ArrayList<>();
		logList.add(new Log(1, "2021-06-01"));
		logList.add(new Log(8, "2021-06-01"));
		logList.add(new Log(9, "2021-06-01"));
		logList.add(new Log(18, "2021-06-01"));
		logList.add(new Log(15, "2021-06-01"));
		logList.add(new Log(13, "2021-06-01"));
		logList.add(new Log(2, "2021-06-01"));
		logList.add(new Log(5, "2021-06-01"));
		logList.add(new Log(11, "2021-06-01"));
		logList.add(new Log(4, "2021-06-01"));
		logList.add(new Log(2, "2021-06-01"));
		logList.add(new Log(8, "2021-06-01"));
		logList.add(new Log(15, "2021-06-01"));
		logList.add(new Log(6, "2021-06-01"));
		logList.add(new Log(7, "2021-06-01"));
		logList.add(new Log(1, "2021-06-01"));
		logList.add(new Log(11, "2021-06-01"));
		logList.add(new Log(4, "2021-06-01"));
		logList.add(new Log(12, "2021-06-01"));
		logList.add(new Log(21, "2021-06-01"));
		logList.add(new Log(20, "2021-06-01"));
		logList.add(new Log(14, "2021-06-01"));
		logList.add(new Log(6, "2021-06-01"));
		logList.add(new Log(4, "2021-06-01"));
		logList.add(new Log(17, "2021-06-01"));
		logList.add(new Log(18, "2021-06-01"));
		logList.add(new Log(19, "2021-06-01"));
		logList.add(new Log(21, "2021-06-01"));
		logList.add(new Log(5, "2021-06-01"));
		logList.add(new Log(9, "2021-06-01"));
		logList.add(new Log(12, "2021-06-01"));
		logList.add(new Log(10, "2021-06-01"));

		ArrayList<Result> tempList = new ArrayList<>();

		songList.forEach(s ->
		{
			tempList.add(new Result(s.id, 0));    // temporary list of songs with count = 0
		});

		// traverse log to get counts
		for (Log l : logList)
		{
			for (Result r : tempList)
			{
				if (l.id == r.id)
				{
					++r.count;
				}
			}
		}

		Collections.sort(tempList, (s1, s2) -> s1.getCount().compareTo(s2.getCount()));  // sort by count, ascending
		System.out.println("\n\n" + tempList);
	}
}

// resulting collection
class Result
{
	int     id;
	Integer count;         // ugly, so we can sort on it

	Result(int i, int c)
	{
		id = i;
		count = c;
	}

	Integer getCount()
	{
		return count;
	}

	public String toString()
	{
		return (id + " " + count);
	}
}


// SongV3 class
class SongV3
{
	int    id;
	String title;
	String band;
	String genre;
	int    year;

	SongV3(int id, String title, String band, String genre, int year)
	{
		this.id = id;
		this.title = title;
		this.band = band;
		this.genre = genre;
		this.year = year;
	}

	public int getId()
	{
		return id;
	}

	public String getTitle()
	{
		return title;
	}

	public String getBand()
	{
		return band;
	}

	public String getGenre()
	{
		return genre;
	}

	public int getYear()
	{
		return year;
	}

	public String toString()
	{
		return (id + ": " + title + ", " + band + ", " + genre + ", " + year + "\n");
	}
}

// Log (songs played) class
class Log
{
	int    id;
	String date;

	Log(int id, String date)
	{
		this.id = id;
		this.date = date;
	}

	public int getId()
	{
		return id;
	}

	public String toString()
	{
		return ("" + id);
	}
}
