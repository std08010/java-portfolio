/*******************************************************************************
 * Copyright (c) 2019 Cipitech, S.A. or its affiliates. All rights reserved.
 *
 * Contributors:
 *     Altin Cipi (haris.tsipis@gmail.com)
 *******************************************************************************/

public class Loops {

    public static void main(String[] args) {
	whileLoop();
    }

    private static void whileLoop() {
	int x = 1; // declare variable x and assign value 1 to it
	System.out.println("Before the Loop");
	while (x < 4) { // conditional test must be boolean (not integer that is 1 or 0)
	    // loop code will run because
	    // x is smaller than 4
	    System.out.println("In the loop");
	    System.out.println("Value of x is " + x);
	    x = x + 1; // remember to modify the value of x so that at some point the conditional text
		       // will fail otherwise we'd loop forever
	}
	System.out.println("This is after the loop");
    }
}
