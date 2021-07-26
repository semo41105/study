package com.poly.test01;

public class Dog extends Animal{
	@Override
	public void bark() {
		System.out.println("¸Û¸Û");
	}
	
	@Override
	public void eat(String animal) {
		super.eat("@"+animal+"@");
	}
}
