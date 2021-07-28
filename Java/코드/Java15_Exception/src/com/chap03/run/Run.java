package com.chap03.run;

import java.util.Scanner;

import com.chap03.myException.MyException;


public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나 입력");
		
		try {
		checkNum(sc.nextInt());
		}catch (MyException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public static void checkNum(int num) throws MyException {
		if(num>=10) {
			System.out.println(num+"은 10보다 크거나 같네~");
		}else {
//			throw new MyException();
			throw new MyException(num+"은 10보다 작은 수잖아!!!");
		}
	}
}
