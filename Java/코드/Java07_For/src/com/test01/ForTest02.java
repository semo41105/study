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
		//������
		//������ 2�ܺ��� 9�ܱ��� ���
		
		//��ü �ݺ��ϴ� for
		for(int dan = 2; dan<=9; dan++) {
			//�� ���� ����ϴ� for
			for(int su = 1; su<10; su++)
				System.out.println(dan+"*"+su+"="+(dan*su));
		}
		System.out.println();
	}
	
	public static void testFor3() {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("����� �� ��: ");
		int row = sc.nextInt();
			
		for(int r=1; r<=row; r++) {
			//�� �ٿ� '+'���� 5�� ���, for�� �̿��Ͽ� �ۼ�

			for(int k=0; k<=4; k++) {
				System.out.print("+");
			}
			System.out.println();			
		}		
	}
	
	public static void testFor4() {
		//�� �ٿ� ��ǥ���ڸ� �Էµ� �� ���� ĭ ����ŭ ���
		//��, �� ���� ĭ ���� ��ġ�ϴ� ��ġ���� �� ��ȣ�� ���� ������ ���
		/*
		 * 1*****
		 * *2****
		 * **3***
		 * ***4**
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� �Է��ϼ���: ");
		int row = sc.nextInt();
		System.out.print("ĭ ���� �Է��ϼ���: ");
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
	 * System.out.print("�� ��: ");
	 * int row = sc.nextInt();
	 * System.out.print("ĭ ��: ");
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
