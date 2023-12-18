package com.cipitech.samples.java.basics.streams;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Book: Head First Java
 * Chapter: 12
 */
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
		sortingBySize(strings);
		sortingNaturalOrder(strings);
		filtering(strings);
		printCollectionAfterChanges(strings);

		noArgs();
		mandatoryTypes();
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
//				.sorted(
//						(String s1, String s2) -> {
//							return s1.compareToIgnoreCase(s2);
//						})
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

	static void sortingBySize(List<String> strings)
	{
		Stream<String> sorted = strings.stream().sorted(
				(str1, str2) ->
				{
					int l1 = str1.length();
					int l2 = str2.length();
					return l2 - l1;
				});

		List<String> result = sorted.toList();
		System.out.println("result = " + result);
	}

	static void sortingNaturalOrder(List<String> strings)
	{
		List<String> result = strings.stream()
				.sorted(Comparator.naturalOrder())
				.toList();
		System.out.println("result = " + result);
	}

	static void filtering(List<String> strings)
	{
		List<String> result = strings.stream()
				.filter(s -> s.length() < 4)
				.collect(Collectors.toList());

		System.out.println("result = " + result);
	}

	static void printCollectionAfterChanges(List<String> strings)
	{
		List<String> result = strings.stream()
				.limit(4)
				.collect(Collectors.toList());

		System.out.println("strings = " + strings);
		System.out.println("result = " + result);
	}

	static void noArgs()
	{
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(() -> System.out.println("Hello!"));
	}

	static void mandatoryTypes()
	{
		// if you remove String from the param here, the compiler doesn't know which method you want
		overloadedMethod((String str) -> System.out.println(str));
	}

	private static void overloadedMethod(Consumer<String> consumer)
	{
		consumer.accept("Something");
	}

	private static void overloadedMethod(Function<Integer, Integer> function)
	{
		function.apply(1);
	}
}
