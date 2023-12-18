package com.cipitech.samples.java.basics.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples
{
	public static void main(String[] args)
	{
		List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");

		limitWithCountTerminal(strings);
		limitWithCollect(strings);
		limitAsStream(strings);
		chainedOperations(strings);
		sortingCaseInsensitive(strings);
	}

	static void limitWithCountTerminal(List<String> strings)
	{
		Stream<String> stream = strings.stream();
		Stream<String> limit = stream.limit(4);
		long result = limit.count();
		System.out.println("result = " + result);
	}

	static void limitWithCollect(List<String> strings)
	{
		Stream<String> stream = strings.stream();
		Stream<String> limit = stream.limit(4);
//		List<String> result = limit.collect(Collectors.toList());
		List<String> result = limit.toList();
		System.out.println("result = " + result);
	}

	static void limitAsStream(List<String> strings)
	{
		List<String> result = strings.stream()
				.limit(4)
				.toList();
		System.out.println("result = " + result);
	}

	static void chainedOperations(List<String> strings)
	{
		List<String> result = strings.stream()
				.sorted()
				.limit(4)
				.toList();
		System.out.println("result = " + result);

		List<String> result2 = strings.stream()
				.sorted()
				.skip(3)
				.limit(4)
				.toList();
		System.out.println("result = " + result2);
	}

	static void sortingCaseInsensitive(List<String> strings)
	{
		List<String> result = strings.stream()
				.sorted((s1, s2) -> s1.compareToIgnoreCase(s2))
				.limit(4)
				.collect(Collectors.toList());
		System.out.println("result = " + result);

		List<String> result2 = strings.stream()
				.sorted(String::compareToIgnoreCase)
				.skip(2)
				.limit(4)
				.toList();
		System.out.println("result = " + result2);
	}
}
