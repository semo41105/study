package com.test.chap05.method.test02;

public class NonStaticMethod {
	
	//1. 매개변수 없고 반환값 없는 메소드
	public void method1() {
		//아무 값도 반환하지 않고 메소드 내용만 수행!! 후 호출한 메소드로 돌아간다.
		System.out.println("매개변수와 반환값이 둘 다 없는 메소드입니다.");
		
	//	return;
		//엄밀히는 리턴이 생략되어 있던 것이다..
	}
	
	//2. 매개변수 없고 반환값 있는 메소드
	public String method2() {
		return "매개변수가 없지만 반환값이 있는 메소드입니다.";
	}

	//3. 매개변수가 있고 반환값이 없는 메소드
	public void method3(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("sum: "+sum);
		
	}
	//4. 매개변수가 있고 반환값이 있는 메소드
	public int method4(int num1, int num2) {
		int sum = num1+num2;
		return sum;
	}
}
