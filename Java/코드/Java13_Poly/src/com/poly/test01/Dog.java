package com.poly.test01;

public class Dog extends Animal{
	@Override
	public void bark() {
		System.out.println("�۸�");
	}
	
	@Override
	public void eat(String animal) {
		super.eat("@"+animal+"@");
	}
}
