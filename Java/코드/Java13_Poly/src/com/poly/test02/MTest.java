package com.poly.test02;

import java.util.Scanner;

public class MTest {

	public static void main(String[] args) {
		System.out.println("����[1:����� 2:�۾��� 3:�۸���]");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		
		Base base = null;
		
		switch(select) {
		case 1:
			base = new Cat();
			break;
		case 2:
			base = new Cow();
			break;
		case 3:
			base = new Dog();
			break;
		}
		
		base.start();
		base.stop();
	}
}
