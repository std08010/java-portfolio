package com.cipitech.samples.java.basics.objects.wrappers;

/**
 * Book: Head First Java
 * Chapter: 10
 */
public class TestFormats
{
	public static void main(String[] args)
	{
		long myBillion = 1_000_000_000;
		String s = String.format("%,d", myBillion);
		System.out.println(s);
	}
}