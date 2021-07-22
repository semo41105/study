package com.test01;

import java.util.Scanner;

public class ForTest01 {
	public static void main(String[] args) {
//		ForTest01.testFor();		
//		testFor2();
//		testFor3();
//		testFor4();
		testFor5();
	}
	
	public static void testFor() {
		//0~10 출력
		int no = 0;
		while(no<=10){
			System.out.println(no);
			no++;
		}
		
		//For
		for(int i=0; i<=10; i++) {
			System.out.println("i: " + i);
		}	
	}
	
	public static void testFor2() {
		//0~10 역순
		for(int i=10; i>=0; i--) {
			System.out.println("i = " + i);
		}
	}
	
	public static void testFor3() {
		//증감식은 반드시 1씩 증감할 필요 없음
		for(int i=1; i<10; i+=2) {
			System.out.println(i+" 번째 출력");
			}
		System.out.println();
		//초기식과 증감식은 1개 이상 기입 가능
		for(int i=0, j=10; i<10 && j>0; i++,j--){
			System.out.println("i: " + i+", j: " + j);
		}
		System.out.println();
		for(char ch='a';ch<='z' ;ch++ ) {
			System.out.println(ch);
		}	
	}
	
	public static void testFor4() {
		//1부터 100사이의 임의의 난수를 구한 다음,
		//1~난수까지의 합을 구하여 출력.
		int j = 0;
		int i;
		int k = 1;
		for(i=((int)(Math.random()*100)+1) ; i>0&&i<=100 ;i-- ) {
			j +=i; 
		}
		System.out.println(j);
	}
	/*
	 * int random = (int)(Math.random()*100)+1;
	 * int sum=0;
	 * for(int i=0; i<=random; i++){
	 * sum += i;
	 * }
	 * System.out.println("1부터"+ random + "까지의 정수 합: "+sum);
	 * 
	 */

	public static void testFor5() {
		//정수 두 개를 키보드로 입력 후,
		//작은 수~ 큰 수까지의 합
		Scanner sc = new Scanner(System.in);
		int sum = 0;	

		System.out.println("첫 번째 입력: ");
		int i = sc.nextInt();
			
		System.out.println("두 번째 입력: ");
		int j = sc.nextInt();
		int a = i;
		int b = j;
		
		if(i<=j) {
			for(i=a, j=b; i<=j; i++) {
				sum += i;
			}
			System.out.println(sum);
		}
		if(j<i) {
			for(i=a, j=b; j<=i; j++) {
				sum += j;
				System.out.println(sum);
			}
		}
	}
	
	/*Scanner sc = new Scanner(System.in);
	 * 
	 * int sum, max, min;
	 * System.out.print("첫 번째 정수: ");
	 * int no1 = sc.nextInt();
	 * System.out.pritn("두 번째 정수: ");
	 * int no2 = sc.nextInt();
	 * 
	 * if(no1>no2){
	 * max = no1;
	 * min = no2;
	 * }else{
	 * max = no2;
	 * min = no1;
	 * }
	 * for(int i=min; i<=max; i++){
	 * sum += i;
	 * }
	 * System.out.println(min+"에서"+max+"까지의 정수들의 합:"+sum);
	 * 
	 */
}
