package com.test01;

import java.util.Scanner;

public class IfTest01 {
	public void testIf() {
		//단독 if
		//조건식의 결과가 true면 {}안의 코드 실행
		//조건식의 결과가 false면 {}안의 코드 무시
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 한 개 입력: ");
		int num = sc.nextInt();
		
		//짝수인지 확인
		if(num % 2 == 0) {
			//조건식이  true일 때 실행
			System.out.println("입력하신 숫자는 짝수입니다.");
		}
		
		//짝수가 아닌지 확인(즉, 홀수인지)
		if(num%2 !=0) {
			//조건식이 true일 때 실행
			System.out.println("입력하신 숫자는 홀수입니다.");
		}
		System.out.println("종료!");
	}
}
