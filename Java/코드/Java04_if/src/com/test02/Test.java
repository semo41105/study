package com.test02;

public class Test {
	
	public void test01(int i) {
		//i�� 5�� ������� Ȯ��("5�� ����Դϴ�"��� ���)
		if (i % 5 == 0) {
			System.out.println("5�� ����Դϴ�");
		}else {
			System.out.println("5�� ����� �ƴմϴ�");
		}
	}
	
	public void test02(int i) {
		//2�� 3�� ��������� Ȯ��("2�� 3�� ����Դϴ�" or "2�� 3�� ����� �ƴմϴ�"��� ���)
		if (i % 2 == 0) {
			if(i % 3 == 0) {
				System.out.println("2�� 3�� ����Դϴ�");
			}else {
				System.out.println("2�� 3�� ����� �ƴմϴ�");
			}
		}	
		/* if( (i%2==0) && (i%3==0) ){
		 * System.out.println("2�� 3�� ����Դϴ�.");
		 * }else {
		 * System.out.println("2�� 3�� ����� �ƴմϴ�.");
		 */
	}
	
	public void test02(char c) {
		//�빮������ �ҹ������� Ȯ��("�빮���Դϴ�" or "�ҹ����Դϴ�")
		/*
		 * if(c >='A' && c <= 'Z') {
		 *		System.out.println("�빮���Դϴ�");
		 *	}else if(c >= 'a' && c <= 'z'){
		 *		System.out.println("�ҹ����Դϴ�");
		  }
		 */
		if( Character.isUpperCase(c) ) {
			System.out.println("�빮���Դϴ�.");
		}else{
			System.out.println("�ҹ����Դϴ�.");
		}
		//���� ����� �ϴ°�.
	}
}
