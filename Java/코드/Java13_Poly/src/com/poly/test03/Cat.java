package com.poly.test03;

public class Cat implements Animal{

	@Override
	public void bark() {
		System.out.println("�߿�");
	}

	@Override
	public void eat(String feed) {
		System.out.println(feed+"�Դ´�!");
	}
}
