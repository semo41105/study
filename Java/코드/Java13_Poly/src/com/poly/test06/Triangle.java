package com.poly.test06;

import java.util.Scanner;

public class Triangle extends AreaImpl			{

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.print("πÿ∫Ø: ");
		int x = sc.nextInt();
		System.out.print("≥Ù¿Ã: ");
		int h = sc.nextInt();
		
		double res = (double)x*h/2;
		
		setResult(String.format("ªÔ∞¢«¸¿« %.2f" , res));
	}
}
