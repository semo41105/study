package com.poly.test03;

public class Dog implements Animal {
	
	@Override
	public void bark() {
		System.out.println("�۸�");
	}
	
	@Override
	public void eat(String feed) {
		System.out.println(feed+"�Դ´�?");
	}
}
