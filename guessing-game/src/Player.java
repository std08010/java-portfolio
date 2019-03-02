/*******************************************************************************
 * Copyright (c) 2019 Cipitech, S.A. or its affiliates. All rights reserved.
 *
 * Contributors:
 *     Altin Cipi (haris.tsipis@gmail.com)
 *******************************************************************************/

public class Player {
    int number; // the number the player guessed (between 0 and 9)

    void guess() {
	number = (int) (Math.random() * 10);
	System.out.println("I’m guessing " + number);
    }
}
