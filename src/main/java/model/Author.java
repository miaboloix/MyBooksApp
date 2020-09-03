package model;

public class Author {
	private String name;
	private int numberOfBooks;
	private String nationality;

	public Author(String name, int numberOfBooks, String nationality) {
		this.name = name;
		this.numberOfBooks = numberOfBooks;
		this.nationality = nationality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfBooks() {
		return numberOfBooks;
	}

	public void setNumberOfBooks(int numberOfBooks) {
		this.numberOfBooks = numberOfBooks;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
}
