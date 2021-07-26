package com.poly.test04;

public class Eagle extends Animal implements Bird{

	@Override
	public void fly() {
		System.out.println("ÆÄ´ÚÆÄ´Ú");
	}

	@Override
	public void bark() {
		System.out.println("»ä»ä »à");
	}
}
