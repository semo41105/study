package com.test01;

import java.util.Scanner;

public class WhileTest01 {

	public static void main(String[] args) {
//		WhileTest01.testWhile();
//		WhileTest01.testWhile2();		
//		WhileTest01.testWhile3();	
		WhileTest01.testWhile4();
	}

	public static void testWhile() {
		int no = 1;
		
		while(no<10) {
			System.out.println(no+" 번째 반복문 수행..");
			no++;
		}
		System.out.println("while 종료 후 no 값: " + no);
	}
	
	public static void testWhile2() {
		//문자열을 입력받아 인덱스별로 문자를 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력: ");
		String str = sc.next();
		
		int index = 1;
		while(index <= str.length()) {
			index--;
			char ch = str.charAt(index);
			System.out.println(index + " : " + ch);
			index+=2;
		}
		/*
		 * int index = 1;
		while(index <= str.length()+1) {
			char ch = str.charAt(index-1);
			System.out.println(index + " : " + ch);
			index++2;
		 */
	}
	
	public static void testWhile3() {
		//1부터 입력받은 수까지 정수들의 합
		int sum = 0;
		
		System.out.println("정수 하나 입력: ");
		int num = new Scanner(System.in).nextInt();
		
		//반복문 (While)
		int i = 1;
		while(i <= num) {
			sum +=i;
			i++;			
		}
		
		for(int j=0; j<=num; j++) {
			sum += j;
		}
		System.out.println("sum: " + sum);
	}
		
	public static void testWhile4() {
		//키보드로 4를 입력 받을 때까지 반복, 4를 입력 받으면 종료
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자입력[1~10]: ");
			int i=sc.nextInt();
			
			if(i==4) {
				System.out.println("4입력!!종료!!!");
				break;
			}
		}
	}
}
