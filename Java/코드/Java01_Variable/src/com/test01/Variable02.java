package com.test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
//import는 패키지와 클래스 사이에 쓰는 것이 정해져 있음.

public class Variable02 {
	
	public static void main(String[] args) {

		// 클래스명 변수명 = new 클래스명();
		Variable02 test = new Variable02();
		
		//변수명.메소드명();
		//test.inputTest1();
		test.inputTest2();
	}

	//java.io 패키지에서 제공되는 클래스들을 이용한 키보드 입력테스트
	public void inputTest1() {

		//현재 위치한 패키지와 다른 패키지에 속한 클래스를 사용할 때 import
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		//클래스명 변수명 = new 클래스명();
		
		//println과 print의 차이는 줄바꿈.
		System.out.print("정수 값 한개를 입력: ");		
				
		try {
			String value = br.readLine();
			//문자열 형태의 숫자를 숫자 데이터로 변환 : parsing
			int num = Integer.parseInt(value);			
			
			System.out.println("value: " + (num*2) );		
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}				
	}
	
	public void inputTest2() {

		//java.util 패키지 Scanner 클래스
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.nextLine();//입력한 한 줄에 대한 정보를 읽어 온다.

		System.out.print("나이: ");
		int age = sc.nextInt();//정수에 대한 값을 읽어 온다.

		System.out.print("키: ");
		double height = sc.nextDouble();
		
		System.out.println(name + "님은 " + age + "세 이며, 키는 " + height + "cm 입니다.");		
	}	
}
