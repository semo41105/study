
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
	
	//������
	//getter&setter
	//1.toString()
	@Override
	public String toString() {
		return title+", "+author+", "+price;
	}
	//2.equals()
	@Override
	public boolean equals(Object obj) {
		//��ü�� �ּҰ� ������ ���� ��ü�̴�.
		if(this == obj) {
		return true;
	}
		//���޹��� ��ü�� null�� ��� ������ �ٸ� ��ü
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
			//�� ��ü�� title�� �ٸ� ��쿡�� false�� ����
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
		//��� ������ ����ϸ� �� ��ü�� ���� ��ü
		return true;

	}
	//3.hashcode
	@Override
	public int hashCode() {
		return (author+price+title).hashCode();
	}
	
	/*
	 * �������̽��� ���� ��ü�� ���� ������ �����ϱ� ���� ����. ���߻�� ����.
	 * �߻�޼��常 ���� �� �ִ�.
	 * �����ڿ� �Ϲݺ��� ���� �� ����.
	 * �޼��� ���� ����
	 * 
	 * �߻� Ŭ������ ��ӹ޾Ƽ� ����� Ȯ���Ű�� ���� ������ �ִ�.
	 * �Ϲݸ޼���+�߻�޼��� ����
	 * �޼��尡 �̿ϼ� ���·� �����Ǿ����� �� �ִ�.
	 * 
	 * 
	 * �� �� ��ü�� ������ �� ����.
	 * 
	 */
}
