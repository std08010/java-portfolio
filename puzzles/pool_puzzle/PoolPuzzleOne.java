package pool_puzzle;
/*******************************************************************************
 * Copyright (c) 2019 Cipitech, S.A. or its affiliates. All rights reserved.
 *
 * Contributors:
 *     Altin Cipi (haris.tsipis@gmail.com)
 *******************************************************************************/

/**
 * page 58/722
 */
public class PoolPuzzleOne {

    public static void main(String[] args) {
	int x = 0;

	while (x < 4) {
	    System.out.print("a");
	    if (x < 1) {
		System.out.print(" ");
	    }
	    System.out.print("n");

	    if (x > 1) {
		System.out.print(" oyster");
		x = x + 2;
	    }

	    if (x == 1) {
		System.out.print("noys");
	    }

	    if (x < 1) {
		System.out.print("oise");
	    }

	    System.out.println("");

	    x = x + 1;
	}
    }

}
