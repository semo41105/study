
package com.test.part02_override.book.model;

public class Book {
	
	private String title;
	private String author;
	private int price;
	public Book() {
		super();
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	//생성자
	//getter&setter
	//1.toString()
	@Override
	public String toString() {
		return title+", "+author+", "+price;
	}
	//2.equals()
	@Override
	public boolean equals(Object obj) {
		//객체의 주소가 같으면 같은 객체이다.
		if(this == obj) {
		return true;
	}
		//전달받은 객체가 null인 경우 무조건 다른 객체
		if(obj==null) {
			return false;
		}
		//////////////////////////
		Book other = (Book)obj;
		
		//title
		if(title == null) {
			if(other.title != null) {
				return false;
			}
			//두 객체의 title이 다른 경우에도 false를 리턴
		}else if(!title.equals(other.title)) {
			return false;
		}
		//author
		if (author == null) {
			if(other.author !=null) {
				return false;
			}
		}else if (!author.contentEquals(other.author)) {
			return false;
		}
		
		//price
		if(price != other.price) {
			return false;
		}
		//모든 조건을 통과하면 두 객체는 같은 객체
		return true;

	}
	//3.hashcode
	@Override
	public int hashCode() {
		return (author+price+title).hashCode();
	}
	
	/*
	 * 인터페이스는 구현 객체의 같은 동작을 보장하기 위한 목적. 다중상속 가능.
	 * 추상메서드만 가질 수 있다.
	 * 생성자와 일반변수 가질 수 없다.
	 * 메서드 선언만 가능
	 * 
	 * 추상 클래스는 상속받아서 기능을 확장시키는 데에 목적이 있다.
	 * 일반메서드+추상메서드 가능
	 * 메서드가 미완성 형태로 구현되어있을 수 있다.
	 * 
	 * 
	 * 둘 다 객체는 생성할 수 없다.
	 * 
	 */
}
