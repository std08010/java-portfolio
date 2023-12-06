package com.cipitech.samples.java.basics.variables;

/**
 * Book: Head First Java
 * Chapter: 03
 */
public class PrimitiveVariables
{
	public static void main(String[] args)
	{
		int x;
		x = 234;
		byte bb = 89;
		boolean isFun = true;
		double d = 3456.98;
		char c = 'f';
		int z = x;
		boolean isPunkRock;
		isPunkRock = false;
		boolean powerOn;
		powerOn = isFun;
		long big = 3456789;

		// Note the ‘f’. You've to have that with a float,
		// because Java thinks anything with a floating point is a double, unless you use ‘f’.
		float myFloat = 32.5f;

        // int x = 34.5; //cannot convert from double to int
		// boolean boo = x; //cannot convert from int to boolean
		int g = 17;
		int y = g;
		y = y + 10;
		short s;
		// s = y; //cannot convert from int to short
		byte b = 3;
		byte v = b;
		short n = 12;
		// v = n; //cannot convert from short to byte
		// byte k = 128; //cannot convert from int to byte (byte max value is 127)
	}
}
