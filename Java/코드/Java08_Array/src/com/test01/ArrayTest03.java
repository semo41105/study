package com.test01;

public class ArrayTest03 {
	
	public static void main(String[]args) {
		ArrayTest03 at03 = new ArrayTest03();
		at03.test1();
		at03.test2();
	}
	public void test1() {
		int num1=4;
		int num2=5;
		
		System.out.println("num1: "+ num1);
		System.out.println("num2: "+ num2);
		
		int tmp;
		
		tmp=num1; //�ӽ÷� ���� ����� ��. 
		num1=num2;
		num2=tmp;

		System.out.println("num1: "+ num1);
		System.out.println("num2: "+ num2);		
		
		int[] arr = {2,1,3};
		
		int tmp2;
		
		tmp2=arr[0];
		arr[0] = arr[1];
		arr[1] = arr[2];
		arr[2] = tmp2;
	}
	
	public void test2() {
		//����
		int[] iarr = {2,5,4,6,1,3};
		
		//��������
		for(int i=0; i<iarr.length; i++) {
			//i�ε����� ������ ������ ó������ �ش��ϴ� �ε������� ���� ���ϴ� �ݺ���
			for(int j=0; j<i; j++) {
				System.out.println("���� �ε��� ��ġ: "+i+", "+j);
				if(iarr[i]<iarr[j]) {
					System.out.println("��ȯ �߻�");
					int tmp;
					tmp = iarr[i];
					iarr[i] = iarr[j];
					iarr[j] = tmp;
				}
			}
			for(int k=0; k<iarr.length; k++) {
				System.out.print(iarr[k]+" ");	
			}
			System.out.println();	
		}
	}
}
