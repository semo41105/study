package com.poly.test06;

import java.util.Scanner;

public class Square extends AreaImpl{

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		int x = sc.nextInt();
		System.out.print("����: ");
		int y = sc.nextInt();
		
		int res = x*y;
		setResult(String.valueOf(res));
	}
	
	@Override
	public void print() {
		System.out.println("�簢����");
		super.print();
	}
}
