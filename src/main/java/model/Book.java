package model;

public class Book {
	private String title;
	private String isbn;
	private String publisher;
	private int year;
	private String author;

	public Book(String title, String isbn, String publisher, int year, String author) {
		this.title = title;
		this.isbn = isbn;
		this.publisher = publisher;
		this.year = year;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getYear() {
		return year;
	}

	public String getAuthor() {
		return author;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
