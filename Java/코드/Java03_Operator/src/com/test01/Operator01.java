package com.test01;

import java.util.Scanner;

public class Operator01 {
	public static void main(String[] args) {
		//Operator01.testMethod();
		
		Operator01 test = new Operator01();
		//test.test1();
		test.test2();
	}
	
	public static void testMethod() {
		// !���� : ������ �ݴ�� �ٲٴ� ������
		System.out.println("true�� ����: " + !true);
		System.out.println("false�� ����: " + !false);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է�: " );
		int num = sc.nextInt();
		
		System.out.println("�Է��� ������ ¦���ΰ�? " + (num%2==0));
		System.out.println("�Է��� ������ ¦���ΰ�? " + !(num%2!=0));
		
		System.out.println("�Է��� ������ ����ΰ�? " + (num > 0));				
	}
	
	public void test1() {
		//����������
		//++ : 1����, data++, ++data
		//-- : 1����, data--, --data
		int age = 20;
		System.out.println("���� ���̴�? " + age);
		
		++age;
		System.out.println("++age: " + age);
		
		age++;
		System.out.println("age++: " + age);
	
		--age;
		System.out.println("--age: " + age);		
		
		age--;
		System.out.println("age--: " + age);		
	}
	
	public void test2() {
		
		int num1 = 20;
		
		//����������
		//�ٸ� ����ó�� �� ����
		int result = num1++ * 3;
		System.out.println("result: " + result);
		System.out.println("num1: " + num1);
		
		int num2 = 20;
		
		//����������
		//���� �� �ٸ� ����ó��
		int result2 = ++num2 * 3;
		System.out.println("result2: " + result2);
		System.out.println("num2: " + num2);
	}
}
