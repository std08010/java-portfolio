package com.cipitech.samples.java.basics.collections;

import java.util.Set;
import java.util.TreeSet;

/**
 * Book: Head First Java
 * Chapter: 11
 */
public class TestTree
{
	public static void main(String[] args)
	{
		new TestTree().go();
	}

	public void go()
	{
		Book b1 = new Book("How Cats Work");
		Book b2 = new Book("Remix your Body");
		Book b3 = new Book("Finding Emo");

		Set<Book> tree = new TreeSet<>();
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		System.out.println(tree);

		Set<Book> treeReverse = new TreeSet<>((o1, o2) -> o2.title.compareTo(o1.title));
		treeReverse.add(b1);
		treeReverse.add(b2);
		treeReverse.add(b3);
		System.out.println(treeReverse);
	}
}

class Book implements Comparable<Book>
{
	String title;

	public Book(String t)
	{
		title = t;
	}

	public int compareTo(Book other)
	{
		return title.compareTo(other.title);
	}

	public String toString()
	{
		return "Book{" +
			   "title='" + title + '\'' +
			   '}';
	}
}