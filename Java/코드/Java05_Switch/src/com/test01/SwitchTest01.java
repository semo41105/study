package com.test01;

public class SwitchTest01 {
	public void test() {
		int i=2;
		
		switch(i) {
		case 1:
			System.out.println("1�Դϴ�.");
			break;
		case 2:
			System.out.println("2�Դϴ�.");
			break;
		case 3:
			System.out.println("3�Դϴ�.");
			break;
		default:
			System.out.println("�ٸ� �����Դϴ�.");
		}
	}

	public void test2() {
		char ch = 'b';
		
		switch(ch) {
		case 'a':
			System.out.println("a�Դϴ�.");
			break;
		case 'b':
			System.out.println("b�Դϴ�.");
			break;
		case 'c':
			System.out.println("c�Դϴ�.");
			break;
		default:
			System.out.println("�ٸ� �����Դϴ�.");
		}
	}
	
	public void test3() {
		int i=3;
		
		switch(i) {
		case 1:
		case 3:
			System.out.println("Ȧ���Դϴ�.");
			break;
		case 2:
		case 4:
			System.out.println("¦���Դϴ�.");
			break;
			//1,3 �� �� Ȧ��, 2,4 �� �� ¦��. �ߺ��� �̿��� ���� ���� ����ϰ� �� �� ����.
		default:
			System.out.println("�ٸ� �����Դϴ�.");		
		}	
	}
}
