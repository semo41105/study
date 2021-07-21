package com.test01;

public class SwitchTest01 {
	public void test() {
		int i=2;
		
		switch(i) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		default:
			System.out.println("다른 숫자입니다.");
		}
	}

	public void test2() {
		char ch = 'b';
		
		switch(ch) {
		case 'a':
			System.out.println("a입니다.");
			break;
		case 'b':
			System.out.println("b입니다.");
			break;
		case 'c':
			System.out.println("c입니다.");
			break;
		default:
			System.out.println("다른 영어입니다.");
		}
	}
	
	public void test3() {
		int i=3;
		
		switch(i) {
		case 1:
		case 3:
			System.out.println("홀수입니다.");
			break;
		case 2:
		case 4:
			System.out.println("짝수입니다.");
			break;
			//1,3 둘 다 홀수, 2,4 둘 다 짝수. 중복을 이용해 같은 값을 출력하게 할 수 있음.
		default:
			System.out.println("다른 숫자입니다.");		
		}	
	}
}
