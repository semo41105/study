package com.poly.test06;

import java.util.Scanner;

public class Triangle extends AreaImpl			{

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�غ�: ");
		int x = sc.nextInt();
		System.out.print("����: ");
		int h = sc.nextInt();
		
		double res = (double)x*h/2;
		
		setResult(String.format("�ﰢ���� %.2f" , res));
	}
}
