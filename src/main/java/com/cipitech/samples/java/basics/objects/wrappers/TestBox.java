package com.cipitech.samples.java.basics.objects.wrappers;

/**
 * Book: Head First Java
 * Chapter: 10
 */
public class TestBox
{
	private Integer i;
	private int     j;

	public static void main(String[] args)
	{
		TestBox t = new TestBox();
		t.go();
	}

	public void go()
	{
		j = i; //this will produce NullPointerException because the compiler will replace it with: j = i.intValue();
		System.out.println(j);
		System.out.println(i);
	}
}