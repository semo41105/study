package com.test01;

public class MethodTest02 {
	//���� ��Ű�� �ȿ� �ٸ� Ŭ����
	public static void main(String[] args) {
		//static method ȣ�� : class.method();
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		//MethodTest01.privateMethod();
		
		//non static method ȣ�� : class ������ = new class();
		//	      				 ������.method();	
		MethodTest01 mt01 = new MethodTest01();
		mt01.NonStaticMethod();
		//�̷��� �پ��ϰ� �����ϴ� ������ ���� ����
	}
}
