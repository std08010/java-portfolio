/*******************************************************************************
 * Copyright (c) 2019 Cipitech, S.A. or its affiliates. All rights reserved.
 *
 * Contributors:
 *     Altin Cipi (haris.tsipis@gmail.com)
 *******************************************************************************/
package objects;

public class MovieTestDrive {

    public static void main(String[] args) {
	Movie one = new Movie();
	one.title = "Gone with the Stock";
	one.genre = "Tragic";
	one.rating = -2;
	
	Movie two = new Movie();
	two.title = "Lost in Cubicle Space";
	two.genre = "Comedy";
	two.rating = 5;
	two.playIt();
	
	Movie three = new Movie();
	three.title = "Byte Club";
	three.genre = "Tragic but ultimately uplifting";
	three.rating = 127;
    }
}
