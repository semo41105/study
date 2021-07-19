package com.test01;

public class Operator02 {
	public static void main(String[] args) {
		new Operator02().opTest();
		new Operator02().opTest2();
	}
	
	public void opTest() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
	}
	
	public void opTest2() {
		//비교연산자(>,<,==,!=, <=, >=)
		int a=10, b=20;
		
		System.out.println( (a == b) );
		System.out.println( (a <= b) );
		System.out.println( (a > b) );
	}
}
