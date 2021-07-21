package com.test01;

import java.util.Scanner;

public class WhileTest02 {
	public static void main(String[] args) {
		WhileTest02.test();
	}
	
	public static void test() {
		int i=100;
		do {
			System.out.println("i: "+i);
			i++;			
		}while(i<10);
		//i == 10 -> 조건식이 false -> do while 종료
		
		System.out.println("do while 종료 후 i값: " + i);
		
		System.out.println();
		//키보드로 영어 문자열 값을 입력받아 출력 반복 실행(단 "exit"라는 문자열을 입력하면 종료)
		Scanner sc = new Scanner(System.in);
		String str;
		
		do {
			System.out.println("문자열 입력: ");
			str = sc.next();
			System.out.println("str: " + str);
			
			if( str.equals("exit") ) {
			System.out.println("exit 입력!! 종료!!");
			break;}
			//문자열은 equals 사용해야함. ==로 비교가 불가능.
			
		}while(true);
		//while(!str.equals("exit"));
		//메소드 안에 매개변수 등등은 지역변수
		//클래스 안 변수필드->저장, 메소드->기능 등등은 전역변수	
	}
}
