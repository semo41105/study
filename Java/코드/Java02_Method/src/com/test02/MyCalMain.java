package com.test02;

public class MyCalMain {
	public static void main(String[] args) {
		//Class.method();
		MyCal.sum(10, 3); //10은 i로, 3은 j로.. 매개변수에 맞춰서 들어감.
		
		int sub = MyCal.sub(10, 3);
		System.out.println("sub: " + sub);
		
		double mul = MyCal.mul(10, 3);
		System.out.println("mul: " + mul);
		
		MyCal.div(10,3);
	}
}
