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
		//0~10 ���
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
		//0~10 ����
		for(int i=10; i>=0; i--) {
			System.out.println("i = " + i);
		}
	}
	
	public static void testFor3() {
		//�������� �ݵ�� 1�� ������ �ʿ� ����
		for(int i=1; i<10; i+=2) {
			System.out.println(i+" ��° ���");
			}
		System.out.println();
		//�ʱ�İ� �������� 1�� �̻� ���� ����
		for(int i=0, j=10; i<10 && j>0; i++,j--){
			System.out.println("i: " + i+", j: " + j);
		}
		System.out.println();
		for(char ch='a';ch<='z' ;ch++ ) {
			System.out.println(ch);
		}	
	}
	
	public static void testFor4() {
		//1���� 100������ ������ ������ ���� ����,
		//1~���������� ���� ���Ͽ� ���.
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
	 * System.out.println("1����"+ random + "������ ���� ��: "+sum);
	 * 
	 */

	public static void testFor5() {
		//���� �� ���� Ű����� �Է� ��,
		//���� ��~ ū �������� ��
		Scanner sc = new Scanner(System.in);
		int sum = 0;	

		System.out.println("ù ��° �Է�: ");
		int i = sc.nextInt();
			
		System.out.println("�� ��° �Է�: ");
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
	 * System.out.print("ù ��° ����: ");
	 * int no1 = sc.nextInt();
	 * System.out.pritn("�� ��° ����: ");
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
	 * System.out.println(min+"����"+max+"������ �������� ��:"+sum);
	 * 
	 */
}
