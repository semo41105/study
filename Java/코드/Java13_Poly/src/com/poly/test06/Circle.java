package com.poly.test06;

import java.util.Scanner;

public class Circle extends AreaImpl{

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름: ");
		int r = sc.nextInt();
		
		double res = r*r*3.14;
		super.setResult(String.format("%.2f", res));
		//%f는 실수. %2f는 소숫점 2번째 자리까지만 표기하겠다는 뜻.
		//%c는 문자. %s는 문자열 %d는 정수..
	}
	
	@Override
	public void print() {
		System.out.println("원의 ");
		super.print();
	}
}
