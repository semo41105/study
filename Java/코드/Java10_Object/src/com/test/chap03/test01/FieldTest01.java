package com.test.chap03.test01;


//변수 선언 위치에 따른 구분
public class FieldTest01 { //클래스 영역의 시작
	//클래스 영역에 작성하는 변스 => 필드
	//필드==멤버변수==전역변수
	
	private int globalNum;
	private static int staticNum;
	
	//초기화 블럭
	{ globalNum=10; }
	static { staticNum=20; }
	
	public void test(int num) { //메소드 영역의 시작
		//메소드 영역에서 작성하는 변수 => 지역변수
		//메소드 괄호 안에 선언하는 변수=> 매개변수
		int localNum;
		
		System.out.println(num); // 매개변수는 호출 시 값이 넘어와서 변경되기 때문에 초기화X
		
		//지역변수는 사용하기 위해서 초기화 필요
//		System.out.println(localNum);

		System.out.println(globalNum);//전역변수라서 사용가능
		
	}//메소드 영역의 끝
	
	public void test2() {
//		System.out.println(localNum); //지역변수는 해당 지역(블럭)에서만 사용 가능
		System.out.println(globalNum);
		
	}
} //클래스 영역의 끝
