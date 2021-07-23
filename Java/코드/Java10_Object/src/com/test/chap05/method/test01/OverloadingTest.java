package com.test.chap05.method.test01;

public class OverloadingTest {
	public int test() {
		return 0;
	}
	
	public int test(int a) {
		return 0;
	}
	
	public int test(int a, int b) {
		return 0;
	}
	public int test(int a, String s) {
		return 0;
	}
	//매개변수명은 상관없다. 자료형의 갯수, 순서가 다르게 작성되어야 한다.
	//public int test(int b, int a) {
	//	return 0;
	//}
	
	public int test(String s, int a) {
		return 0;
	}
	
	public String test(int a, int b, String s) {
		return null;
	}
	
	// 리턴타입이 다르다고 오버로딩이 적용되지 않는다.
//	public int test(int a, int b, String s) {
	//	return 0;
//	}
	
	//접근제한자가 다르다고 오버로딩이 적용되지 않는다.
//	private String test(int a, int b, String s) {
	//	return null;
//	}
}
