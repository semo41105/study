package com.test01;

public class MethodTest01 {
	public static void main(String[] args) {	
		//nonstatic method
		//1.�غ�
		MethodTest01 mt01 = new MethodTest01();
		//2.����
		mt01.NonStaticMethod();
		
		//static method
		//Ŭ������.�޼ҵ��();
		mt01.publicMethod();
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		defaultMethod();
		MethodTest01.privateMethod();
	}
	
	//�ۺ�-����������
	//��𼭳� ����, �������� ( + )
	public static void publicMethod() {
		System.out.println("public method");
	}
	
	//����� ��� ��ӵ� ������ ���� ���� (#)
	//����� �ƴ� ��� ���� ��Ű�� �������� ���� ����
	protected static void protectedMethod() {
		System.out.println("protected method");
	}
	
	//���� ��Ű�� ������ ���� ����(default)
	static void defaultMethod() {
		System.out.println("default method");
	}
	
	//���� Ŭ���� �������� ���� ����(-)
	private static void privateMethod() {
		System.out.println("private method");
	}
	
	//static �޼ҵ�� ���� ����ƽ�޼��常 ���� ����
	public void NonStaticMethod() {
		System.out.println("non static method");
	}
}
