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
		
		//�迭 ����
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
		//�迭�� ����
		//�ڷ���[] ������;
		//�ڷ��� 	 ������[];
		
		//int[] arr;
		//char carr[];
	
		//�Ҵ�
		//new �����ڴ� heap ������ ������ �Ҵ��ϰ�
		//�ּҰ��� ��ȯ�ϴ� ������
		//arr = new int[];
		//arr = new int[5];
		//carr = new char[10];
		
		//����� �Ҵ�
		int[] iarr = new int[5];
		char carr[] = new char[3];
		
		System.out.println("iarr: " + iarr);
		System.out.println("carr: " + carr);
		
		System.out.println("iarr�� hashcode: " + iarr.hashCode());
		System.out.println("carr�� hashcode: " + carr.hashCode());
		
		System.out.println("iarr�� ����: " + iarr.length);
		System.out.println("carr�� ����: " + carr.length);
		
		//��ĳ�ʸ� ���� �Է¹��� ������ �迭 ����
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ���� �Է�: ");
		int size = sc.nextInt();
		
		double[] darr = new double[size];
		System.out.println("darr�� hashcode: " + darr.hashCode());
		System.out.println("darr�� ����: "+ darr.length);
		
		darr = new double[30];
		
		System.out.println("���� �� darr�� hashcode: " + darr.hashCode());
		System.out.println("darr�� ����: " + darr.length);
		
		darr = null;
		System.out.println(darr.length);
	}
	
	public void test3() {
		int[] iarr = new int[5];
		
		for(int i=0; i<iarr.length; i++) {
			System.out.println("iarr["+i+"]�� ��: " + iarr[i]);
		}
	
		//int[] iarr2 = new int[] {11,22,33,44,55};
		int[] iarr2 = {11,22,33,44,55};
		for(int i=0; i<iarr2.length; i++) {
			System.out.println(iarr2[i]);
		}
		System.out.println(iarr2.length);
	}
}
