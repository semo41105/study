package com.chap02.throwsPrac;

import java.io.IOException;

public class Run {

	public static void main(String[] args) {
		try {
			methodA();
			}catch(IOException e) {
			System.out.println("main()���� ���� ó��!");
			}	
//		methodA(); //throws�� ���� ó��. main���� throws�ϰԵǸ� jvm�� ó��
		System.out.println("���α׷� ����");
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
