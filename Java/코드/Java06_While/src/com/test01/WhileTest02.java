package com.test01;

import java.util.Scanner;

public class WhileTest02 {
	public static void main(String[] args) {
		WhileTest02.test();
	}
	
	public static void test() {
		int i=100;
		do {
			System.out.println("i: "+i);
			i++;			
		}while(i<10);
		//i == 10 -> ���ǽ��� false -> do while ����
		
		System.out.println("do while ���� �� i��: " + i);
		
		System.out.println();
		//Ű����� ���� ���ڿ� ���� �Է¹޾� ��� �ݺ� ����(�� "exit"��� ���ڿ��� �Է��ϸ� ����)
		Scanner sc = new Scanner(System.in);
		String str;
		
		do {
			System.out.println("���ڿ� �Է�: ");
			str = sc.next();
			System.out.println("str: " + str);
			
			if( str.equals("exit") ) {
			System.out.println("exit �Է�!! ����!!");
			break;}
			//���ڿ��� equals ����ؾ���. ==�� �񱳰� �Ұ���.
			
		}while(true);
		//while(!str.equals("exit"));
		//�޼ҵ� �ȿ� �Ű����� ����� ��������
		//Ŭ���� �� �����ʵ�->����, �޼ҵ�->��� ����� ��������	
	}
}
