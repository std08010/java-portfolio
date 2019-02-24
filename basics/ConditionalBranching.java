/*******************************************************************************
 * Copyright (c) 2019 Cipitech, S.A. or its affiliates. All rights reserved.
 *
 * Contributors:
 *     Altin Cipi (haris.tsipis@gmail.com)
 *******************************************************************************/

public class ConditionalBranching {

    public static void main(String[] args) {
	ifCondition();
	ifElseCondition();
    }

    private static void ifCondition() {
	int x = 3;
	if (x == 3) {
	    System.out.println("x must be 3");
	}
	System.out.println("This runs no matter what");
    }
    
    private static void ifElseCondition() {
	int x = 2;
	if (x == 3) {
	    System.out.println("x must be 3");
	} else {
	    System.out.println("x is NOT 3");
	}
	System.out.println("This runs no matter what");
    }
}
