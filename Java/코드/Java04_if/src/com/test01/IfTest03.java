package com.test01;

import java.util.Scanner;

public class IfTest03 {
	// if ~ else if
	public void test() {
		int i=10;
		int j=20;
		
		if(i>j) {
			System.out.println("i�� j���� Ů�ϴ�.");
		}else if(i == j) {
			System.out.println("i�� j�� �����ϴ�.");
		}else {
			System.out.println("i�� j���� �۽��ϴ�.");	
		}
	}

	public void test2() {
		//���� �ϳ��� �Է¹޾� ����� ������ ������ ����� ���
		//90�� �̻��� A
		//90�� �̸� 80�� �̻��� B
		//80�� �̸� 70�� �̻��� C
		//70�� �̸� 60�� �̻��� D
		//60�� �̸��� F
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
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
		System.out.printf("����� ������ %d �̰�, ����� %s �Դϴ�.", point, grade);
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
