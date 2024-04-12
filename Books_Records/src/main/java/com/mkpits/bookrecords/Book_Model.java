package com.mkpits.bookrecords;

public class Book_Model {

	private int id;
	private String title;
	private String author;
	
	// create constructor
	public Book_Model() {
		super();
	}

	// create constructor with fields
	public Book_Model(int id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}

	// create getter setter
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book_Model [id=" + id + ", title=" + title + ", author=" + author + "]";
	}
}
