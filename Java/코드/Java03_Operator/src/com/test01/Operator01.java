package com.test01;

import java.util.Scanner;

public class Operator01 {
	public static void main(String[] args) {
		//Operator01.testMethod();
		
		Operator01 test = new Operator01();
		//test.test1();
		test.test2();
	}
	
	public static void testMethod() {
		// !논리값 : 논리값을 반대로 바꾸는 연산자
		System.out.println("true의 부정: " + !true);
		System.out.println("false의 부정: " + !false);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력: " );
		int num = sc.nextInt();
		
		System.out.println("입력한 정수가 짝수인가? " + (num%2==0));
		System.out.println("입력한 정수가 짝수인가? " + !(num%2!=0));
		
		System.out.println("입력한 정수가 양수인가? " + (num > 0));				
	}
	
	public void test1() {
		//증감연산자
		//++ : 1증가, data++, ++data
		//-- : 1감소, data--, --data
		int age = 20;
		System.out.println("현재 나이는? " + age);
		
		++age;
		System.out.println("++age: " + age);
		
		age++;
		System.out.println("age++: " + age);
	
		--age;
		System.out.println("--age: " + age);		
		
		age--;
		System.out.println("age--: " + age);		
	}
	
	public void test2() {
		
		int num1 = 20;
		
		//후위연산자
		//다른 연산처리 후 증감
		int result = num1++ * 3;
		System.out.println("result: " + result);
		System.out.println("num1: " + num1);
		
		int num2 = 20;
		
		//전위연산자
		//증감 후 다른 연산처리
		int result2 = ++num2 * 3;
		System.out.println("result2: " + result2);
		System.out.println("num2: " + num2);
	}
}
