package com.test01;

import java.util.Scanner;

public class Operator04 {
		//�׸��� 3��: (���ǽ�) ? ���� �� ����� ��1: ������ �� ����� ��2;
	
	public static void main(String[] args) {
		new Operator04().opTest();
	}
	
	public void opTest() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է�: ");
		int num = scan.nextInt();
		
		//String res = (num>0)? "�����":"����� �ƴϴ�" ;
		String res = (num>0)? "�����": (num==0)? "0�̴�":"������" ;
		
		System.out.println(res);
	}
}
