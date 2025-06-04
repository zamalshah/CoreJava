package com.java42.treeSet;

import java.util.TreeSet;

record Book(String bookName, String authorName) implements Comparable<Book> {

	@Override
	public String toString() {
		return "" + bookName + " : " + authorName;
	}

	@Override
	public int compareTo(Book book) {

		return this.bookName.compareTo(book.bookName);
	}

}

public class BookSorted {
	public static void main(String[] args) {
		TreeSet<Book> book = new TreeSet<Book>();
		book.add(new Book("HTML", "Mr. Adnan"));
		book.add(new Book("Css", "Mr. Balram"));
		book.add(new Book("JavaScript", "Mr. Hilal"));
		book.add(new Book("Java", "Mr. Zamal"));
		book.add(new Book("Oracle", "Mr. Scott"));
		book.add(new Book("Spring", "Mr. Alen"));

//        for(Book b: book) {
//        	System.out.println(b);
//        }
//        
		book.forEach(System.out::println);

	}
}
