package com.test01;

import java.util.Scanner;

public class IfTest02 {
	// if~ else : �� �� �� ���� �����ϴ� ���ǹ�(�� �߿� �ϳ��� ������ ����)
	public void test() {
		int i = 20;
		if(i<10) {
			System.out.println("10���� �۽��ϴ�.");
		}else {
			System.out.println("10���� ũ�ų� �����ϴ�.");
		}
	}
	
	public void testIfElse() {
		//���ڸ� �ϳ� �Է¹޾� Ȧ/¦���� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է�: ");
		int num = sc.nextInt();

		//if~else�� ���� num�� ���� ¦������ Ȧ������ ���
		if(num % 2 == 0) {
			System.out.println("�Է��Ͻ� ������ ¦���Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� ������ Ȧ���Դϴ�.");
		}
	}
	
	public void testIfElse2() {
		//50���� ū ����� ¦������, Ȧ������ ���
		//50���� ���� ����� �۴ٶ�� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("0���� ū ���� �Է�: ");
		int no = sc.nextInt();
		
		if(no>=50) {
			if(no % 2 == 0) {
				System.out.print("50���� ū ¦��.");
				}
			else {				
				System.out.print("50���� ū Ȧ��.");
			}
		}else {
			System.out.print("50���� ���� ��.");
		}
	}
}
