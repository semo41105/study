package com.test01;

public class Variable01 {

	//타입 변수명 = 값;

	public static void main(String[] args) {
		
		Variable01 test = new Variable01(); 
		//메서드를 실행할 준비
		//클래스명 변수명 = new 클래스명();

		//test.declareVariable();
		//변수명.메소드명();
		
		test.initVariable();
		
		System.out.println("main END");				
	}

	public void declareVariable() {

		//숫자
		//정수형
		byte bnum;
		short snum;
		int inum;
		long lnum;
		//실수형
		float fnum;
		double dnum;
		
		//논리
		boolean isTrue;
		
		//문자
		//문자
		char ch;		
		//문자열(참조형)
		String str;
		
		//--------------------
		//한줄 주석
		/*
		 * 여러주석
		 */
		
		//대입
		bnum = 1;
		snum = 2;
		inum = 4;
		lnum = 8L; //타입 명시 가능함. 안 해도 잘 돌아감.
		
		fnum = 4.0f; //더블타입(이클립스가 볼 때)일 때 타입 명시 해 줘야 함. 자동으로 안 바뀌기 때문.
		dnum = 8.0;
		
		isTrue = false; //true or false 값만 저장
		
		ch = 'A';
		str = "A";
		
		//출력
		System.out.println("bnum: " + bnum);
		System.out.println("snum: " + snum);
		System.out.println("inum: " + inum);
		System.out.println("lnum: " + lnum);
		
		System.out.println("fnum: " + fnum);
		System.out.println("dnum: " + dnum);
		
		System.out.println("inTrue: " + isTrue);
		
		System.out.println("ch: " + ch);
		System.out.println("str: " + str);						
	}
		
	public void initVariable() {

		//선언과 동시에 초기화
		byte bnum = 1;
		short snum = 2;
		int inum = 4;
		long lnum = 8;
		
		float fnum = 4.0f;
		double dnum = 8.0;
		boolean isTrue = true;
		
		char ch = 'A';
		String str = "안녕하세요";
		
		System.out.println("bnum: " + bnum);
		System.out.println("snum: " + snum);
		System.out.println("inum: " + inum);
		System.out.println("lnum: " + lnum);
		
		System.out.println("fnum: " + fnum);
		System.out.println("dnum: " + dnum);
		
		System.out.println("isTrue: " + isTrue);
		
		System.out.println("ch: " + ch);
		System.out.println("str: " + str);				
	}
}

