package Homeworks.Lesson10.Task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {
	private String name;
	private List<Book> books = new ArrayList();

	public static String getAddress() {
		return "vratsa";

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public void add(Book book) {
		books.add(book);

	}

	public Book find(String author) {
		for (Book book : books) {
			if (book.getAuthor().equals(author)) {
				return book;

			}
		}
		return null;

	}
	
	public void printAll() {
		for (int i = 0; i < books.size(); i++) {
			print(i);
		}
	}

	public void print(int i) {
		books.get(i).print();

	}

	public void remove(Book book) {
		books.remove(book);

	}
}
