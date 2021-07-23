package com.test.chap05.method.test02;

public class StaticMethod {

	public static void staticMethod1() {
		int num1 = 1;
		int num2 = 10;
		
		System.out.println("1과 10의 합은 "+(num1+num2)+" 입니다.");
	}

	public static int staticMethod2() {
		int num1=10;
		int num2=2;
		return num1+num2;
	}
	
	public static void staticMethod3(String name) {
		System.out.println(name+"님의 방문을 환영합니다.");
	}
	
	public static String staticMethod4(String name) {
		return name+"님의 방문을 환영합니다.";
	}
}
