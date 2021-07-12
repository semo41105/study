package com.test01;

public class Variable05 {

	//(바꿀 자료형)값 또는 (바꿀 자료형)변수
	//형변환 : 강제 형변환(명시적 형변환), 자동 형변환

	public static void main(String args[]) {
		
		Variable05 test = new Variable05();
		//test.rule1();
		//test.rule2();
		test.rule3();
	}

	//1. 같은 자료형끼리만 대입 가능하기 때문에, 다른 자료형의 값을 대입할 때는 형변환 필요
	//2. 같은 자료형끼리만 연산 가능하고, 계산의 결과도 같은 자료형이어야 한다.
	//3. 정수 --> 실수 : 자동 형변환
	//   실수 --> 정수 : 강제 형변환

	public void rule1() {

		boolean flag = true;
		//flag = 1.2;
		
		//자동 형변환, upcasting, 묵시적 형변환
		//강제 형변환, downcasting, 명시적 형변환
		
		int num = 'A';
		System.out.println("num: " + num);
		
		char ch = 97;
		System.out.println("ch: " + ch);
		
		//ch = -97; 음수값은 저장할 수 없음.
		
		//int 자료형 변수의 값은 강제 형변환해야 한다.
		char ch2 = (char)num;
		System.out.println("ch2: " + ch2);
		
		int num2 = -97;
		char ch3 = (char)num2;
		System.out.println("ch3: " + ch3);
		//자바에는 음수로 나타낼 기호(부호비트)가 없다.
	}
	
	public void rule2() {

		//다른 자료형끼리의 연산은 큰 자료형으로 자동 형변환 후 처리
		int inum = 10;
		long lnum = 100;
		
		//int isum = inum + lnum;
		
		//1. 수행 결과를 int로 강제 형변환
		int isum = (int)(inum+lnum);
		
		System.out.println("isum: " + isum);
		
		//2. long형 값을 int로 강제 형변환
		int isum2 = inum + (int)lnum;
		System.out.println("isum2: " + isum2);
		
		//3. long형 타입의 변수로 받는다.
		long lsum = inum + lnum;
		System.out.println("lsum: " + lsum);		
	}
	
	public void rule3() {

		//정수 -> 실수 자동으로 형변환이 된다.
		long lnum = 100;
		float fnum = lnum;
		
		System.out.println("fnum: " + fnum);
		
		//실수 -> 정수 강제 형변환을 해줘야 한다.
		double dnum = 10.5;
		int inum = (int)dnum;
		
		System.out.println("inum: " + inum);
		System.out.println("double: " + (double)inum);	
	}
}

