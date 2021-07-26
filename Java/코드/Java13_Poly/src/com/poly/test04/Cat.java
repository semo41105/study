package com.poly.test04;

public class Cat extends Animal{
	
	@Override
	public void bark() {
		System.out.println("¾ß¿Ë");
	}
	
	@Override
	public void eat(String feed) {
		System.out.println("^"+feed+"^ ¸Ô´Â´Ù.");
	}
}
