package com.test02;

public class MyCal {
	//접근제한자 메모리 리턴타입 메소드명(매개변수[파라미터])
	public static void sum(int i, int j) {
		//두 숫자를 더하는 기능을 가지는 메소드
		int res = i + j;
		System.out.println("sum: " + res);
	}

	public static int sub(int i, int j) {
		int res = i - j;
		
		return res;
	}
	
	public static double mul(double i, double j) {
		double res = i * j;
		
		return res;
	}
	
	public static void div(int i, int j) {
		// '/' : 나눈 후의 몫
		int div01 = i / j;
		// '%' : 나눈 후의 나머지
		int div02 = i % j;
		
		System.out.printf("%d / %d 의 몫: %d\n", i,j,div01);
		//i, j, div01이 차례대로 %d에 들어감. \n은 개행(다음 줄로)
		System.out.println(i+" / " + j + " 의 나머지: " +div02);
	}
}
