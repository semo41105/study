package com.test02;

public class TestMain {
	public static void main(String[] args) {
		//1. �Ѱܹ��� ���� 5�� ����̸� "5�� ����Դϴ�"�� ���
		new Test().test01(10);
		//2. ������ 2�� ����̸鼭 3�� ����̸� "2�� 3�� ����Դϴ�" ���,
		//	 �ƴ϶��, "2�� 3�� ����� �ƴմϴ�" ���
		new Test().test02(6);
		//3. ���ڰ� �ҹ��ڶ�� "�ҹ����Դϴ�", �빮�ڶ�� "�빮���Դϴ�" ���
		new Test().test02('A');
	}
}
