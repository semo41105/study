package com.chap01.runtime.controller;

import java.util.Scanner;
//Exception과 Error클래스 모든 Object클래스의 자손이며 모든 예외의 최고 조상은 Exception클래스.
//Checked Exception: 반드시 예외 처리해야 함.
//Unchecked Exception: 반드시 예외처리해주지 않아도 됨.
public class RuntimeException {
	//소스 수정으로 해결 가능한 에러를 예외라고 함. 예외처리를 통해 해결.
	//시스템 에러: 컴퓨터 오작동으로 인한 에러, 소스 구문으로 해결 불가
	//컴파일 에러: 프로그램의 실행을 막는 소스 상의 문법 에러, 소스 구문을 수정하여 해결
	//런타임 에러: 입력 값이 틀렸거나, 배열의 인덱스 범위를 벗어났거나, 계산식의 오류 등 주로 if문 사용으로 에러 처리
	//소스 코드 수정으로 해결 가능, 치명적인 예외상황의 표현에 사용되지 않는다.
	//ArrayIndexOutofBoundsException: 배열의 접근이 잘못된 인덱스 값을 사용하는 경우
	//ClassCastException: 허용할 수 없는 형변환 연산을 진행하는 경우
	//NullPointerException: 참조변수가 null로 초기화된 상황에서 메소드를 호출하는 경우
	
	Scanner sc = new Scanner(System.in);
	
	public void ArithEx() {
		int ran = 0;
		double res = 0.0;
		
		while(true) {
			System.out.print("정수 하나 입력: ");
			int no = sc.nextInt();
			
			if(no!=0) {
			
			ran = (int)((Math.random()*10)+1);
			res = ran/(double)no;
			
			System.out.printf("%d / %d = %.2f\n", ran, no, res);
			}else {
				System.out.println("0이 아닌 값을 입력하세요.");
			}
		}
	}
	
	public void classNArrayEx() {
		//ClassCastException
		
		try {
			//트라이는 코드를 작성하는 부분
/*		Character ch = 'a';	
		Object obj = ch;
		System.out.println(obj);
		
		String str = (String)obj; //ClassCastException
		System.out.println(str); //실행X
	*/	
	/*		
		//ArrayIndexOutOfBoundsException
		int[] arr = new int[2];
		arr[0] = 1;
		arr[1] = 2;
		
		arr[2] = 3; //ArrayIndexOutOfBoundsException 발생!
		System.out.println("여기도 실행될까?"); //실행 안 됨.
			
	*/		
		//NullPointerException
			String str = null;
//			int length = str.length();
			
		}catch(ClassCastException e) {
			System.out.println("ClassCastException 발생!!!! 내가 잡았다~~~");
			e.printStackTrace();
			//트라이에서 오류 발생시 받아서 처리해주는 부분
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("에러인덱스익셉션");
			e.printStackTrace();
		}catch(NullPointerException e) {
			System.out.println("null인디..");
			
		}finally {
			//예외가 발생하든 말든 무조건 실행됨
			System.out.println("이건 무조건 실행!!");
		}
	}
/*	RuntimeException 후손 클래스
	ArithmeticException: 0으로 나누는 경우 발생. if문으로 나누는 수가 0인지 검사
	NullPointerException: Null인 참조 변수로 객체 멤버 참조 시도 시 발생. 객체 사용 전에 참조 변수가 null인지 확인
	NegativeArraySizeException: 배열 크기를 음수로 지정한 경우 발생.배열 크기를 0보다 크게 지정해야 함
	ArrayIndexOutOfBoundsException: 배열의 index범위를 넘어서 참조하는 경우. 배열명.lengt를 사용하여 배열의 범위 확인
	ClassCastException: Cast연산자 사용 시 타입 오류. instanceof연산자로 객체타입 확인 후 cast연산
	
*/
}
