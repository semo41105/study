package com.test01;

import java.util.Scanner;

public class IfTest03 {
	// if ~ else if
	public void test() {
		int i=10;
		int j=20;
		
		if(i>j) {
			System.out.println("i가 j보다 큽니다.");
		}else if(i == j) {
			System.out.println("i와 j가 같습니다.");
		}else {
			System.out.println("i가 j보다 작습니다.");	
		}
	}

	public void test2() {
		//정수 하나를 입력받아 등급을 나누어 점수와 등급을 출력
		//90점 이상은 A
		//90점 미만 80점 이상은 B
		//80점 미만 70점 이상은 C
		//70점 미만 60점 이상은 D
		//60점 미만은 F
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int point = sc.nextInt();
//		char grade;
		String grade;
		
		if(point >= 90) {
			grade = "A";
			if(point>=95) {
				grade += "+";
				}
		}
		else if(point < 90 && point >= 80) {
			grade = "B";
		}else if(point < 80 && point >= 70) {
			grade = "C";
		}else if(point < 70 && point >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		System.out.printf("당신의 점수는 %d 이고, 등급은 %s 입니다.", point, grade);
	}

	public void test3() {
		boolean bool = true;
		
		if(bool) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}
