package com.test02;

public class MyCalMain {
	public static void main(String[] args) {
		//Class.method();
		MyCal.sum(10, 3); //10�� i��, 3�� j��.. �Ű������� ���缭 ��.
		
		int sub = MyCal.sub(10, 3);
		System.out.println("sub: " + sub);
		
		double mul = MyCal.mul(10, 3);
		System.out.println("mul: " + mul);
		
		MyCal.div(10,3);
	}
}
