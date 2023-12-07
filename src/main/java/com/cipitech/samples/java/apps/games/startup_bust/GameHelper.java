package com.cipitech.samples.java.apps.games.startup_bust;

import java.util.Scanner;

/**
 * Book: Head First Java
 * Chapter: 05
 */
public class GameHelper
{
	public static int getUserInput(String prompt)
	{
		System.out.print(prompt + ": ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
}