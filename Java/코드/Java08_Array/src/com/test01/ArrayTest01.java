package com.test01;

import java.util.Scanner;

public class ArrayTest01 {
	
	public void test1() {
//		int num1=10;
//		int num2=20;
//		int num3=30;
//		int num4=40;
//		int num5=50;
//		
//		int sum=0;
		
//		sum += num1;
//		sum += num2;
//		sum += num3;
//		sum += num4;
//		sum += num5;
		
		//배열 생성
		int[] arr = new int[5];
		
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[3] = 30;
//		arr[4] = 40;
//		arr[5] = 50;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i*10;
			System.out.println(arr[i]);
		}
	}
	
	public void test2() {
		//배열의 선언
		//자료형[] 변수명;
		//자료형 	 변수명[];
		
		//int[] arr;
		//char carr[];
	
		//할당
		//new 연산자는 heap 영역에 공간을 할당하고
		//주소값을 반환하는 연산자
		//arr = new int[];
		//arr = new int[5];
		//carr = new char[10];
		
		//선언과 할당
		int[] iarr = new int[5];
		char carr[] = new char[3];
		
		System.out.println("iarr: " + iarr);
		System.out.println("carr: " + carr);
		
		System.out.println("iarr의 hashcode: " + iarr.hashCode());
		System.out.println("carr의 hashcode: " + carr.hashCode());
		
		System.out.println("iarr의 길이: " + iarr.length);
		System.out.println("carr의 길이: " + carr.length);
		
		//스캐너를 통해 입력받은 정수로 배열 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 입력: ");
		int size = sc.nextInt();
		
		double[] darr = new double[size];
		System.out.println("darr의 hashcode: " + darr.hashCode());
		System.out.println("darr의 길이: "+ darr.length);
		
		darr = new double[30];
		
		System.out.println("수정 후 darr의 hashcode: " + darr.hashCode());
		System.out.println("darr의 길이: " + darr.length);
		
		darr = null;
		System.out.println(darr.length);
	}
	
	public void test3() {
		int[] iarr = new int[5];
		
		for(int i=0; i<iarr.length; i++) {
			System.out.println("iarr["+i+"]의 값: " + iarr[i]);
		}
	
		//int[] iarr2 = new int[] {11,22,33,44,55};
		int[] iarr2 = {11,22,33,44,55};
		for(int i=0; i<iarr2.length; i++) {
			System.out.println(iarr2[i]);
		}
		System.out.println(iarr2.length);
	}
}
