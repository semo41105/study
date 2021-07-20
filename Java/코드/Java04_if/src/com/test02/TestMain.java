package com.test02;

public class TestMain {
	public static void main(String[] args) {
		//1. 넘겨받은 수가 5의 배수이면 "5의 배수입니다"를 출력
		new Test().test01(10);
		//2. 정수가 2의 배수이면서 3의 배수이면 "2와 3의 배수입니다" 출력,
		//	 아니라면, "2와 3의 배수가 아닙니다" 출력
		new Test().test02(6);
		//3. 문자가 소문자라면 "소문자입니다", 대문자라면 "대문자입니다" 출력
		new Test().test02('A');
	}
}
