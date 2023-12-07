package com.cipitech.samples.java.basics.methods;

/**
 * Book: Head First Java
 * Chapter: 04
 */
class Clock
{
	private String time;

	public static void main(String[] args)
	{
		Clock c = new Clock();
		c.setTime("1245");
		String tod = c.getTime();
		System.out.println("time: " + tod);
	}

	String getTime()
	{
		return time;
	}

	void setTime(String time)
	{
		this.time = time;
	}
}