package com.cipitech.samples.java.examples;

import java.util.Random;

/**
 * Phrase-O-Matic
 * Make a random sentence
 */
public class PhraseOMatic
{
	// make three sets of words to choose from.
	private static String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "frontend", "web-based", "pervasive", "smart", "sixsigma", "critical-path", "dynamic", "agnostic", "opinionated", "voice activated", "haptically driven", "extensible", "reactive", "agent based", "functional", "AI enabled", "strongly typed"};

	private static String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated", "loosely coupled", "six sigma", "asynchronous", "event driven", "pub-sub", "IoT", "cloud native", "service oriented", "containerized", "serverless", "microservices", "distributed ledger"};

	private static String[] wordListThree = {"process", "tippingpoint", "solution", "architecture", "core competency", "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission", "framework", "library", "DSL", "REST API", "repository", "pipeline", "service mesh", "architecture", "perspective", "design", "orientation"};

	public static void main(String[] args)
	{
		// find out how many words are in each list
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;

		// generate three random numbers
//		int rand1 = (int) (Math.random() * oneLength);
//		int rand2 = (int) (Math.random() * twoLength);
//		int rand3 = (int) (Math.random() * threeLength);

		Random randomGenerator = new Random();
		int rand1 = randomGenerator.nextInt(oneLength);
		int rand2 = randomGenerator.nextInt(twoLength);
		int rand3 = randomGenerator.nextInt(threeLength);

		// now build a phrase
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

		// print out the phrase
		System.out.println("What we need is a " + phrase);
	}
}
