package com.cipitech.samples.java.basics.java_api;

import java.util.ArrayList;

/**
 * Book: Head First Java
 * Chapter: 06
 */
public class SharpenYourPencil
{
	void arrayListCode()
	{
		ArrayList<String> myList = new ArrayList<>();

		String a = "whoohoo";
		myList.add(a);

		String b = "Frog";
		myList.add(b);

		int theSize = myList.size();

		String str = myList.get(1);

		myList.remove(1);

		boolean isIn = myList.contains(b);
	}

	void arrayCode()
	{
		String[] myList = new String[2];

		String a = "whoohoo";
		myList[0] = a;

		String b = "Frog";
		myList[1] = b;

		int theSize = myList.length;

		String str = myList[1];

		myList[1] = null;

		boolean isIn = false;
		for (String item : myList)
		{
			if (b.equals(item))
			{
				isIn = true;
				break;
			}
		}
	}
}
