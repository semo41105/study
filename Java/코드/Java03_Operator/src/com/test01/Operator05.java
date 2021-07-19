package com.test01;

public class Operator05 {
	//산술 대입연산자 : +=, -=, *=, /=, %=
	public static void main(String[] args) {
		new Operator05().opTest();
	}
	
	public void opTest() {
		int result;
		int num = 12;
		
		System.out.println("num: " + num);
		
		num = num + 3;
		System.out.println("num: " + num);
		
		num += 3;
		System.out.println("num: " + num);
		
		num -= 5; // num = num - 5;
		System.out.println("num: " + num);
		
		num *= 2; // num 2배 증가
		System.out.println("num: " + num);
		
		num /= 2;
		System.out.println("num: " + num);	
	}	
}
