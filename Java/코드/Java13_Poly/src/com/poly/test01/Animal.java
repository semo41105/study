package com.poly.test01;

public abstract class Animal {
	//추상메소드 => 상속시 상속받는 class가 반드시 구현해야 함.
	public abstract void bark();
	
	public void eat(String animal) {
		System.out.println(animal+"먹는다.");
	}
}
