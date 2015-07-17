package com.example.domain;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Book {
	@Id
	private int id;
	
	private String title;
	private String author;
	
	private long price;
	
	public Book(){}
	
	public Book(Integer id) {this.id = id;}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

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

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
	
}
