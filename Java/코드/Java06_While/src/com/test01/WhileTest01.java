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
			System.out.println(no+" ��° �ݺ��� ����..");
			no++;
		}
		System.out.println("while ���� �� no ��: " + no);
	}
	
	public static void testWhile2() {
		//���ڿ��� �Է¹޾� �ε������� ���ڸ� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է�: ");
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
		//1���� �Է¹��� ������ �������� ��
		int sum = 0;
		
		System.out.println("���� �ϳ� �Է�: ");
		int num = new Scanner(System.in).nextInt();
		
		//�ݺ��� (While)
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
		//Ű����� 4�� �Է� ���� ������ �ݺ�, 4�� �Է� ������ ����
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("�����Է�[1~10]: ");
			int i=sc.nextInt();
			
			if(i==4) {
				System.out.println("4�Է�!!����!!!");
				break;
			}
		}
	}
}
