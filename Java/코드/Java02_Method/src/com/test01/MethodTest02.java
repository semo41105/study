package com.test01;

public class MethodTest02 {
	//같은 패키지 안에 다른 클래스
	public static void main(String[] args) {
		//static method 호출 : class.method();
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		//MethodTest01.privateMethod();
		
		//non static method 호출 : class 변수명 = new class();
		//	      				 변수명.method();	
		MethodTest01 mt01 = new MethodTest01();
		mt01.NonStaticMethod();
		//이렇게 다양하게 관리하는 이유는 보안 때문
	}
}
