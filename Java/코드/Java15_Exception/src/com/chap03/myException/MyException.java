package com.chap03.myException;

public class MyException extends Exception{
	public MyException() {
		System.out.println("���� ���� ���� Ŭ����!");
	}
	public MyException(String msg) {
		super(msg);
	}
/*	
*����� ���� ����
*
*Exception Ŭ������ ��ӹ޾� ���� Ŭ������ �ۼ��ϴ� ������
Exception �߻��ϴ� ������ throw new ����Ŭ������()���� �߻�
*
*/
}
