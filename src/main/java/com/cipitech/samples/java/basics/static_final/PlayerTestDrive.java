package com.cipitech.samples.java.basics.static_final;

/**
 * Book: Head First Java
 * Chapter: 10
 */
class Player
{
	static  int    playerCount = 0;

	private String name;

	public Player(String n)
	{
		name = n;
		playerCount++;
	}
}

public class PlayerTestDrive
{
	public static void main(String[] args)
	{
		System.out.println(Player.playerCount);
		Player one = new Player("Tiger Woods");
		System.out.println(Player.playerCount);
	}
}