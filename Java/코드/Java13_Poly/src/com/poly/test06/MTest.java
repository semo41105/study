package com.poly.test06;

import java.util.Scanner;

public class MTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �������ּ���[1:�� 2:�ﰢ�� 3:�簢��]");
		int select = sc.nextInt();
		
		Area ar = null;
		switch(select){
		case 1:
			ar = new Circle();
			break;
		case 2:
			ar = new Triangle();
			break;
		case 3:
			ar = new Square();
			break;
		}
		ar.make();
		ar.print();
	}
}
