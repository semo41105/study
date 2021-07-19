package com.test01;

import java.util.Scanner;

public class Operator03 {
		// &&(그리고)
		// ||(또는)
		// 논리값  && 논리값, 논리값 || 논리값 
	
	public static void main(String[] args) {
		Operator03 test = new Operator03();
		test.opTest1();
	}

	public void opTest1() {	
		// 1<=숫자 <= 100 X(안됨) --> 숫자>=1 && 숫자<=100
		Scanner sc = new Scanner(System.in);
			
		System.out.print("정수 하나 입력: ");
		int num = sc.nextInt();
			
		System.out.println("1부터 100사이인지 확인: " + (num>=1 && num<=100) );
			
		//영어 대문자냐?
		System.out.print("문자 한 개 입력: ");
		char ch = sc.next().charAt(0);
			
		System.out.println( "영어 대문자인지 확인: " + (ch>='A' && ch<='Z') );
			
		// ||
		// 입력한 문자가 대소문자 상관없이 'y' 'Y'인지 물어볼 때
		System.out.print("종료하시려면 y 혹은 Y를 입력하세요: ");
		char ch2 = sc.next().charAt(0);
			
		System.out.println("영문자 y인지 확인: " + (ch2 == 'y' || ch2 == 'Y'));	
		}
}
