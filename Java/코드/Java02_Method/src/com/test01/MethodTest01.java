package com.test01;

public class MethodTest01 {
	public static void main(String[] args) {	
		//nonstatic method
		//1.준비
		MethodTest01 mt01 = new MethodTest01();
		//2.실행
		mt01.NonStaticMethod();
		
		//static method
		//클래스명.메소드명();
		mt01.publicMethod();
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		defaultMethod();
		MethodTest01.privateMethod();
	}
	
	//퍼블릭-접근제한자
	//어디서나 접근, 참조가능 ( + )
	public static void publicMethod() {
		System.out.println("public method");
	}
	
	//상속일 경우 상속된 곳에서 접근 가능 (#)
	//상속이 아닌 경우 같은 패키지 내에서만 접근 가능
	protected static void protectedMethod() {
		System.out.println("protected method");
	}
	
	//같은 패키지 내에서 접근 가능(default)
	static void defaultMethod() {
		System.out.println("default method");
	}
	
	//현재 클래스 내에서만 접근 가능(-)
	private static void privateMethod() {
		System.out.println("private method");
	}
	
	//static 메소드는 오직 스태틱메서드만 접근 가능
	public void NonStaticMethod() {
		System.out.println("non static method");
	}
}
