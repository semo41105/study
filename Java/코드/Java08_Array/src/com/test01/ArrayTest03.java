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
		
		tmp=num1; //임시로 값을 백업해 줌. 
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
		//정렬
		int[] iarr = {2,5,4,6,1,3};
		
		//순차정렬
		for(int i=0; i<iarr.length; i++) {
			//i인덱스가 증가할 때마다 처음부터 해당하는 인덱스까지 값을 비교하는 반복문
			for(int j=0; j<i; j++) {
				System.out.println("현재 인덱스 위치: "+i+", "+j);
				if(iarr[i]<iarr[j]) {
					System.out.println("교환 발생");
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
