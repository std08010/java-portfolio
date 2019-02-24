/*******************************************************************************
 * Copyright (c) 2019 Cipitech, S.A. or its affiliates. All rights reserved.
 *
 * Contributors:
 *     Altin Cipi (haris.tsipis@gmail.com)
 *******************************************************************************/

/**
 * Phrase-O-Matic
 * 
 * Make a random sentence
 */
public class PhraseOMatic {

    // make three sets of words to choose from.
    private static String[] wordListOne = { "24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "frontend",
	    "web-based", "pervasive", "smart", "sixsigma", "critical-path", "dynamic" };

    private static String[] wordListTwo = { "empowered", "sticky", "value-added", "oriented", "centric", "distributed",
	    "clustered", "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned",
	    "targeted", "shared", "cooperative", "accelerated" };

    private static String[] wordListThree = { "process", "tippingpoint", "solution", "architecture", "core competency",
	    "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission" };

    public static void main(String[] args) {
	// find out how many words are in each list
	int oneLength = wordListOne.length;
	int twoLength = wordListTwo.length;
	int threeLength = wordListThree.length;

	// generate three random numbers
	int rand1 = (int) (Math.random() * oneLength);
	int rand2 = (int) (Math.random() * twoLength);
	int rand3 = (int) (Math.random() * threeLength);

	// now build a phrase
	String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

	// print out the phrase
	System.out.println("What we need is a " + phrase);
    }

	
}
