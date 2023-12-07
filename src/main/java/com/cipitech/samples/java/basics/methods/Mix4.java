package com.cipitech.samples.java.basics.methods;

/**
 * Book: Head First Java
 * Chapter: 04
 */
public class Mix4
{
	public static final int candidateNo = 4;
	int counter = 0;

	public static void main(String[] args)
	{
		int count = 0;
		Mix4[] mixes = new Mix4[20];
		int i = 0;
		while (getI(i, candidateNo))
		{
			mixes[i] = new Mix4();
			mixes[i].counter = mixes[i].counter + 1;
			count = count + 1;
			count = count + mixes[i].maybeNew(i);
			i = i + 1;
		}
		System.out.println(count + " " + mixes[1].counter);
	}

	public static boolean getI(int i, int candidateNo)
	{
		return switch (candidateNo)
		{
			case 1 -> i < 9;
			case 2 -> i < 20;
			case 3 -> i < 7;
			case 4 -> i < 19;
			default -> false;
		};
	}

	public static boolean getIndex(int index, int candidateNo)
	{
		return switch (candidateNo)
		{
			case 1, 2 -> index < 5;
			case 3 -> index < 7;
			case 4 -> index < 1;
			default -> false;
		};
	}

	public int maybeNew(int index)
	{
		if (getIndex(index, candidateNo))
		{
			Mix4 mix = new Mix4();
			mix.counter = mix.counter + 1;
			return 1;
		}
		return 0;
	}
}