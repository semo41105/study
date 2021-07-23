package com.test.chap05.method.test02;

public class Main {

	public static void main(String[] args) {
		//준비
		NonStaticMethod test = new NonStaticMethod();
		
		//매개변수와 반환값이 없는 메소드 호출
		test.method1();
		
		//매개변수 없고 반환값이 있는 메소드 호출
		//String res = test.method2();
		//리턴타입과 일치하는 변수
		//System.out.println(res);
		
		System.out.println(test.method2());
		
		//매개변수가 있고 반환값이 없는 메소드 호출
		test.method3(10 , 20);
		
		//매개변수가 있고 반환값이 있는 메소드 호풀
		//int res = test.method4(10,20);
		//System.out.println("res: "+res);
		System.out.println("res: "+test.method4(10, 20));
		
		
		StaticMethod.staticMethod1();
		System.out.println("10과 2의 합은 " + StaticMethod.staticMethod2()+"입니다.");
		StaticMethod.staticMethod3("홍길동");
		System.out.println(StaticMethod.staticMethod4("이순신"));
	}
}
