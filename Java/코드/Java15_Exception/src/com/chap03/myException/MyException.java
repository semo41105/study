package com.chap03.myException;

public class MyException extends Exception{
	public MyException() {
		System.out.println("내가 만든 예외 클래스!");
	}
	public MyException(String msg) {
		super(msg);
	}
/*	
*사용자 정의 예외
*
*Exception 클래스를 상속받아 예외 클래스를 작성하는 것으로
Exception 발생하는 곳에서 throw new 예외클래스명()으로 발생
*
*/
}
