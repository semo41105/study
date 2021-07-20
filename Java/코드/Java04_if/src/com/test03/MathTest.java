package com.test03;

import java.util.Random;

public class MathTest {
	//Math Class
	//java.lang ��Ű��
	public static void main(String[] args) {
//		new MathTest().testMath();
		new MathTest().testMath2();	
	}
	
	public void testMath() {
		System.out.println("��� E: " + Math.E);
		System.out.println("��� PI: "+ Math.PI);
		
		System.out.println("-7�� ���밪: " + Math.abs(-7));
		System.out.println("-123.4�� ���밪: " + Math.abs(-123.4));
		
		//����: ������ ��, �������� ��������� ��
		System.out.println("������ ����: " + Math.random());
	}
	
	public void testMath2() {
		//Math.random() ==> 0.0~~1.0(0.0�̻�, 1.0�̸�)
		//1~100������ ���� ���ϱ�.
		System.out.println((int)(Math.random()*100)+1);
		
		//(int)(Math.random() * �ִ밪 ) + 1
		
		// 0~9������ ���� ��		
		//int random = (int)(Math.random()*10);
		int random = new Random().nextInt(10); // 0~9				
		System.out.println("0~9������ ���� ��: " + random);
		
		// 1~10������ ���� ��		
		int A = (int)(Math.random()*10+1);
		System.out.println("1~10������ ���� ��: " + A);
		
		// 20~35������ ���� ��	
		int B = (int)((Math.random()*16)+20);
		System.out.println("20~35������ ���� ��: " + B);
		//�������� �����ָ� �ȴ�(20~35�� 16���̹Ƿ� 16�� ���ص� ��)
		
		// 0 �Ǵ� 1
		int C = (int)(Math.random()*2);
		System.out.println("0 �Ǵ� 1: " + C);
		
//		System.out.println((int)Math.random()*10 ); 
	}
}
