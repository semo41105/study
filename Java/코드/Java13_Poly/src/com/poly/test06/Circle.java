package com.poly.test06;

import java.util.Scanner;

public class Circle extends AreaImpl{

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������: ");
		int r = sc.nextInt();
		
		double res = r*r*3.14;
		super.setResult(String.format("%.2f", res));
		//%f�� �Ǽ�. %2f�� �Ҽ��� 2��° �ڸ������� ǥ���ϰڴٴ� ��.
		//%c�� ����. %s�� ���ڿ� %d�� ����..
	}
	
	@Override
	public void print() {
		System.out.println("���� ");
		super.print();
	}
}
