package com.test01;

import java.util.Scanner;

public class IfTest01 {
	public void testIf() {
		//�ܵ� if
		//���ǽ��� ����� true�� {}���� �ڵ� ����
		//���ǽ��� ����� false�� {}���� �ڵ� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� �� �Է�: ");
		int num = sc.nextInt();
		
		//¦������ Ȯ��
		if(num % 2 == 0) {
			//���ǽ���  true�� �� ����
			System.out.println("�Է��Ͻ� ���ڴ� ¦���Դϴ�.");
		}
		
		//¦���� �ƴ��� Ȯ��(��, Ȧ������)
		if(num%2 !=0) {
			//���ǽ��� true�� �� ����
			System.out.println("�Է��Ͻ� ���ڴ� Ȧ���Դϴ�.");
		}
		System.out.println("����!");
	}
}
