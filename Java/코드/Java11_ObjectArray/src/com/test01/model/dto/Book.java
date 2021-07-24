package com.test01.model.dto;

public class Book {
	
	private String title;
	private String author;
	private String publisher;
	private int price;
	
	//������
	//�⺻������
	public Book() {}
	//�Ű�����������
	public Book(String title, String author, String publisher, int price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	//getter&setter
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public String information() {
		return "title="+title+", author="+author+", publisher="+publisher+", price="+price;
	}
}
