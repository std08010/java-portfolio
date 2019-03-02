package code_magnet;
/*******************************************************************************
 * Copyright (c) 2019 Cipitech, S.A. or its affiliates. All rights reserved.
 *
 * Contributors:
 *     Altin Cipi (haris.tsipis@gmail.com)
 *******************************************************************************/

/**
 * page 54/722
 */
public class CodeMagnetOne {

    public static void main(String[] args) {
	int x = 3;

	while (x > 0) {
	    if (x > 2) {
		System.out.print("a");
	    }

	    if (x == 2) {
		System.out.print("b c");
	    }

	    x = x - 1;

	    System.out.print("-");

	    if (x == 1) {
		System.out.print("d");
		x = x - 1;
	    }
	}
    }

}
