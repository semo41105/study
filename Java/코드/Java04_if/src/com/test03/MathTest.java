package com.test03;

import java.util.Random;

public class MathTest {
	//Math Class
	//java.lang 패키지
	public static void main(String[] args) {
//		new MathTest().testMath();
		new MathTest().testMath2();	
	}
	
	public void testMath() {
		System.out.println("상수 E: " + Math.E);
		System.out.println("상수 PI: "+ Math.PI);
		
		System.out.println("-7의 절대값: " + Math.abs(-7));
		System.out.println("-123.4의 절대값: " + Math.abs(-123.4));
		
		//난수: 임의의 값, 무작위로 만들어지는 값
		System.out.println("임의의 난수: " + Math.random());
	}
	
	public void testMath2() {
		//Math.random() ==> 0.0~~1.0(0.0이상, 1.0미만)
		//1~100까지의 난수 구하기.
		System.out.println((int)(Math.random()*100)+1);
		
		//(int)(Math.random() * 최대값 ) + 1
		
		// 0~9까지의 랜덤 수		
		//int random = (int)(Math.random()*10);
		int random = new Random().nextInt(10); // 0~9				
		System.out.println("0~9까지의 랜덤 수: " + random);
		
		// 1~10까지의 랜덤 수		
		int A = (int)(Math.random()*10+1);
		System.out.println("1~10까지의 랜덤 수: " + A);
		
		// 20~35까지의 랜덤 수	
		int B = (int)((Math.random()*16)+20);
		System.out.println("20~35까지의 랜덤 수: " + B);
		//범위까지 곱해주면 된다(20~35는 16개이므로 16을 곱해도 됨)
		
		// 0 또는 1
		int C = (int)(Math.random()*2);
		System.out.println("0 또는 1: " + C);
		
//		System.out.println((int)Math.random()*10 ); 
	}
}
