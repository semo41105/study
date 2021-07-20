package com.test02;

public class Test {
	
	public void test01(int i) {
		//i가 5의 배수인지 확인("5의 배수입니다"라고 출력)
		if (i % 5 == 0) {
			System.out.println("5의 배수입니다");
		}else {
			System.out.println("5의 배수가 아닙니다");
		}
	}
	
	public void test02(int i) {
		//2와 3의 공배수인지 확인("2와 3의 배수입니다" or "2와 3의 배수가 아닙니다"라고 출력)
		if (i % 2 == 0) {
			if(i % 3 == 0) {
				System.out.println("2와 3의 배수입니다");
			}else {
				System.out.println("2와 3의 배수가 아닙니다");
			}
		}	
		/* if( (i%2==0) && (i%3==0) ){
		 * System.out.println("2와 3의 배수입니다.");
		 * }else {
		 * System.out.println("2와 3의 배수가 아닙니다.");
		 */
	}
	
	public void test02(char c) {
		//대문자인지 소문자인지 확인("대문자입니다" or "소문자입니다")
		/*
		 * if(c >='A' && c <= 'Z') {
		 *		System.out.println("대문자입니다");
		 *	}else if(c >= 'a' && c <= 'z'){
		 *		System.out.println("소문자입니다");
		  }
		 */
		if( Character.isUpperCase(c) ) {
			System.out.println("대문자입니다.");
		}else{
			System.out.println("소문자입니다.");
		}
		//같은 기능을 하는것.
	}
}
