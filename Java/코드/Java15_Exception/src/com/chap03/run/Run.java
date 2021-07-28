package com.chap03.run;

import java.util.Scanner;

import com.chap03.myException.MyException;


public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ϳ� �Է�");
		
		try {
		checkNum(sc.nextInt());
		}catch (MyException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public static void checkNum(int num) throws MyException {
		if(num>=10) {
			System.out.println(num+"�� 10���� ũ�ų� ����~");
		}else {
//			throw new MyException();
			throw new MyException(num+"�� 10���� ���� ���ݾ�!!!");
		}
	}
}
