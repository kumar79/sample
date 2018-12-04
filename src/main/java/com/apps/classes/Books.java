package com.apps.classes;

public class Books {

	String author;
	String bookName;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		return (author+"  "+bookName);
	}
	public int  privatization() {
		//System.out.println("This cannot be called outside of class as it is declared private");
		return 65;
	}
}
