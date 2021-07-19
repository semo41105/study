package com.test01;

import java.util.Scanner;

public class Operator04 {
		//항목이 3개: (조건식) ? 참일 때 사용할 값1: 거짓일 때 사용할 값2;
	
	public static void main(String[] args) {
		new Operator04().opTest();
	}
	
	public void opTest() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 하나 입력: ");
		int num = scan.nextInt();
		
		//String res = (num>0)? "양수다":"양수가 아니다" ;
		String res = (num>0)? "양수다": (num==0)? "0이다":"음수다" ;
		
		System.out.println(res);
	}
}
