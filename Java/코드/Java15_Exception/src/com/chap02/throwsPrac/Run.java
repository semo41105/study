package com.chap02.throwsPrac;

import java.io.IOException;

public class Run {

	public static void main(String[] args) {
		try {
			methodA();
			}catch(IOException e) {
			System.out.println("main()에서 예외 처리!");
			}	
//		methodA(); //throws로 예외 처리. main에서 throws하게되면 jvm이 처리
		System.out.println("프로그램 종료");
	}

	public static void methodA() throws IOException{
		methodB();
	}
	public static void methodB() throws IOException{
		methodC();
	}
	public static void methodC() throws IOException{
	/*
		try {
		throw new IOException();
		}catch(IOException e) {
			e.printStackTrace();
		}
		*/
		throw new IOException();
	}
}
