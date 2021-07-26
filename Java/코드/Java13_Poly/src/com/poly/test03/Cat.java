package com.poly.test03;

public class Cat implements Animal{

	@Override
	public void bark() {
		System.out.println("¾ß¿Ë");
	}

	@Override
	public void eat(String feed) {
		System.out.println(feed+"¸Ô´Â´Ù!");
	}
}
