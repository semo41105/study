package com.test01;

import java.util.Scanner;

public class ForTest02 {		
	public static void main(String[] args) {
//		testFor1();
//		testFor2();
//		testFor3();
		testFor4();
	}
	
	public static void testFor1() {
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				System.out.println("i="+i+", j= "+j);
			}
			System.out.println();			
		}
	}
	
	public static void testFor2() {
		//구구단
		//구구단 2단부터 9단까지 출력
		
		//전체 반복하는 for
		for(int dan = 2; dan<=9; dan++) {
			//한 단을 출력하는 for
			for(int su = 1; su<10; su++)
				System.out.println(dan+"*"+su+"="+(dan*su));
		}
		System.out.println();
	}
	
	public static void testFor3() {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("출력할 줄 수: ");
		int row = sc.nextInt();
			
		for(int r=1; r<=row; r++) {
			//한 줄에 '+'문자 5번 출력, for를 이용하여 작성

			for(int k=0; k<=4; k++) {
				System.out.print("+");
			}
			System.out.println();			
		}		
	}
	
	public static void testFor4() {
		//한 줄에 별표문자를 입력된 줄 수와 칸 수만큼 출력
		//단, 줄 수와 칸 수가 일치하는 위치에는 줄 번호에 대한 정수가 출력
		/*
		 * 1*****
		 * *2****
		 * **3***
		 * ***4**
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("줄 수를 입력하세요: ");
		int row = sc.nextInt();
		System.out.print("칸 수를 입력하세요: ");
		int spa = sc.nextInt();
		for(int a=1; a<=row ; a++) {
			for(int b=1; b<=6 ; b++) {
				if(a!=b) {
					System.out.print("*");
				}else {
					System.out.print(b);
				}
			}
			System.out.println();
		}
		System.out.println();
		}
	/* Scanner sc = new Scanner(System.in);
	 * 
	 * System.out.print("줄 수: ");
	 * int row = sc.nextInt();
	 * System.out.print("칸 수: ");
	 * int col = sc.nextInt();
	 * 
	 * for(int r=1; r<=rowl r++){
	 * for(int c=1;c<=col; c++){
	 * if(r == c){
	 * System.out.print(r);
	 * }else{
	 * System.out.print("*");
	 * }
	 * }
	 */
}
