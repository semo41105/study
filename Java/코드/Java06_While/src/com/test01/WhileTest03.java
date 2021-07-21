package com.test01;

public class WhileTest03 {

	public static void main(String[] args) {
		//1. 1~100까지의 숫자를 역순으로 출력
		prn01();
		//2. 1~100까지의 숫자 중, 2의 배수만 출력
		prn02();
		//3. 1~100까지의 숫자 중, 7의 배수의 갯수와 총 합을 출력
		prn03();
	}

	public static void prn01() {
		int i = 100;
		while(i>0) {
			System.out.println(i);
			i--;
		}	
	}
	
	public static void prn02() {
		int j = 1;
		while(j<101) {
			if(j%2==0) {
				System.out.println(j);
				}
			j++;
		}		
	}

	public static void prn03() {
		int k = 1;
		int n = 0;
		int sum = 0;
		while(k<101) {
			if(k%7==0) {
				n++;
				sum += k;
			}
			k++;				
		}
		System.out.println("7의 배수의 갯수: "+ n);
		System.out.println("7의 배수의 총 합: "+ sum);
		
		/*
		 * while(k<=100{
		 * if(k%7==0){
		 * sum += k;
		 * n++;
		 * }
		 * }
		 */
		
	}
}
