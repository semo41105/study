package com.test01;

import java.util.Scanner;

public class Operator03 {
		// &&(�׸���)
		// ||(�Ǵ�)
		// ����  && ����, ���� || ���� 
	
	public static void main(String[] args) {
		Operator03 test = new Operator03();
		test.opTest1();
	}

	public void opTest1() {	
		// 1<=���� <= 100 X(�ȵ�) --> ����>=1 && ����<=100
		Scanner sc = new Scanner(System.in);
			
		System.out.print("���� �ϳ� �Է�: ");
		int num = sc.nextInt();
			
		System.out.println("1���� 100�������� Ȯ��: " + (num>=1 && num<=100) );
			
		//���� �빮�ڳ�?
		System.out.print("���� �� �� �Է�: ");
		char ch = sc.next().charAt(0);
			
		System.out.println( "���� �빮������ Ȯ��: " + (ch>='A' && ch<='Z') );
			
		// ||
		// �Է��� ���ڰ� ��ҹ��� ������� 'y' 'Y'���� ��� ��
		System.out.print("�����Ͻ÷��� y Ȥ�� Y�� �Է��ϼ���: ");
		char ch2 = sc.next().charAt(0);
			
		System.out.println("������ y���� Ȯ��: " + (ch2 == 'y' || ch2 == 'Y'));	
		}
}
