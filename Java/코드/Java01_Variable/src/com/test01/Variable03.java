package com.test01;

public class Variable03 {

	public static void main (String[] args) {

		//클래스명 변수명 = new 클래스명();
		Variable03 test = new Variable03();
		
		//변수명.메소드명();
		//test.changeValue();
		
		test.finalTest();		
	}
	
	public void changeValue() {

		//변수 선언
		String name;
		char gender;
		int age;
		double height;
		
		//변수 초기화
		name = "홍길동";
		gender = 'M';
		age = 20;
		height = 181.1;
		
		System.out.println(name + "님의 개인정보");
		System.out.println("gender: "+gender);
		System.out.println("age: " + age);
		System.out.println("height: " + height);
		
		//키보드로 입력받아 변수에 저장된 값 변경
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("name: ");
		name = sc.nextLine();
		System.out.print("gender: ");
		gender = sc.next().charAt(0);
		System.out.print("age: ");
		age = sc.nextInt();
		System.out.print("height: ");
		height = sc.nextDouble();
		
		System.out.println(name + "님의 개인정보");
		System.out.println("gender: "+gender);
		System.out.println("age: " + age);
		System.out.println("height: " + height);		
	}
	
	public void finalTest() {

		//상수
		int age;
		final int AGE;
		//상수 선언은 보통 대문자로 함.
		
		age = 20;
		AGE = 20;
		
		System.out.println("age: " + age);
		System.out.println("AGE: " + AGE);
		
		age = 30;
		//AGE = 30;
		//상수값은 재할당 불가능	
	}
}
