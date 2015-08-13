package Homeworks.Lesson10.Task4;

public class Book {
	private String title;
	private String author;
	private String publisher;
	private int year;
	private String isbn;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void print() {
		System.out.println("title " + title +", author "+ author +", publisher " + publisher + ", year " +year + ", ISBN " +isbn);
	}

}
