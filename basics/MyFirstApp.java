/*******************************************************************************
 * Copyright (c) 2019 Cipitech, S.A. or its affiliates. All rights reserved.
 *
 * Contributors:
 *     Altin Cipi (haris.tsipis@gmail.com)
 *******************************************************************************/

public class MyFirstApp {

    public static void main(String[] args) {
	System.out.println("I Rule!");
	System.out.println("The World");

	statements();
	loops();
	conditionalBranching();
	dooBee();
    }

    private static void statements() {
	int x = 3; // declaration
	x = x * 17; // assignment
	System.out.println("x is " + x);
	double d = Math.random(); // method call
	System.out.println("d is " + d);
	// this is a comment
    }

    private static void loops() {

	// while loop
	int y = 20;
	while (y > 12) {
	    y = y - 1;
	    System.out.println("y is now " + y);
	}

	// for loop
	for (int x = 0; x < 10; x = x + 1) {
	    System.out.println("x is now " + x);
	}
    }

    private static void conditionalBranching() {
	int x = 3;
	String name = "Dirk";

	// if-then-else condition
	if (x == 10) {
	    System.out.println("x must be 10");
	} else {
	    System.out.println("x isn't 10");
	}

	// if condition
	if ((x <= 3) & (name.equals("Dirk"))) {
	    System.out.println("Gently");
	}

	System.out.println("this line runs no matter what");
    }

    private static void dooBee() {
	int x = 1;
	while (x < 3) {
	    System.out.print("Doo");
	    System.out.print("Bee");
	    x = x + 1;
	}
	if (x == 3) {
	    System.out.print("Do");
	}
    }
}
