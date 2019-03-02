/*******************************************************************************
 * Copyright (c) 2019 Cipitech, S.A. or its affiliates. All rights reserved.
 *
 * Contributors:
 *     Altin Cipi (haris.tsipis@gmail.com)
 *******************************************************************************/
package code_magnet;

/**
 * page 77/722
 */
class DrumKitTestDrive {

    public static void main(String[] args) {
	DrumKit d = new DrumKit();

	d.playSnare();

	d.snare = false;

	if (d.snare == true) {
	    d.playSnare();
	}

	d.playTopHat();
    }

}

class DrumKit {
    boolean topHat = true;
    boolean snare = true;

    void playSnare() {
	System.out.println("bang bang ba-bang");
    }

    void playTopHat() {
	System.out.println("ding ding da-ding");
    }
}
