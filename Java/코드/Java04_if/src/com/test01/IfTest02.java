package com.test01;

import java.util.Scanner;

public class IfTest02 {
	// if~ else : 둘 중 한 개를 선택하는 조건문(둘 중에 하나는 무조건 선택)
	public void test() {
		int i = 20;
		if(i<10) {
			System.out.println("10보다 작습니다.");
		}else {
			System.out.println("10보다 크거나 같습니다.");
		}
	}
	
	public void testIfElse() {
		//숫자를 하나 입력받아 홀/짝인지 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력: ");
		int num = sc.nextInt();

		//if~else를 통해 num의 값이 짝수인지 홀수인지 출력
		if(num % 2 == 0) {
			System.out.println("입력하신 정수는 짝수입니다.");
		} else {
			System.out.println("입력하신 정수는 홀수입니다.");
		}
	}
	
	public void testIfElse2() {
		//50보다 큰 수라면 짝수인지, 홀수인지 출력
		//50보다 작은 수라면 작다라고 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("0보다 큰 정수 입력: ");
		int no = sc.nextInt();
		
		if(no>=50) {
			if(no % 2 == 0) {
				System.out.print("50보다 큰 짝수.");
				}
			else {				
				System.out.print("50보다 큰 홀수.");
			}
		}else {
			System.out.print("50보다 작은 수.");
		}
	}
}
