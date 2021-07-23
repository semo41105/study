package com.test.chap03.test01;

public class FieldTest02 {
	public static int staticNum;
	
	public static final int STATIC_NUM=1;
	//상수필드 => 반드시 선언과 동시에 초기화
	public final static int STATIC_NUM2=2;//이렇게 순서가 바뀌어도 괜찮음.
	
	public void test() {
		//지역변수에서는 static 키워드를 통한 변수 선언X
//		static int localStaticNum;
	}
}
