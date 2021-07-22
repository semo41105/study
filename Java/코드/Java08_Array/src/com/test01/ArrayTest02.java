package com.test01;

public class ArrayTest02 {
	public static void main(String[] args) {
		
		String[] sarr = {"apple", "banana", "orange"};
	//	for(int i=0; i<sarr.length; i++) {
	//		System.out.println(sarr[i]);
	//	}
	//	
		ArrayTest02 at02 = new ArrayTest02();

		//배열에 데이터 입력
		char[] ch = new char[26];
		for(int i=0; i<ch.length; i++) {
			ch[i] = (char)((int)'a'+i);
		}
		//1.a~z 일차원 배열 출력
//		prn(ch);	
		//2. ch를 거꾸로 출력
		reverse(ch);
		//3.ch를 대문자로 바꾸어서 출력
//		upper(ch);
	}
	
	public static void prn(char[] ch) {
		/*
		 * a b c d e f
		 * g h i j k l
		 * m n o p q r
		 * s t u v w x
		 * y z
		 */
		System.out.print(ch[0] + " ");
		for(int j=1; j<ch.length; j++) {			
			if(j%6==0) {
				System.out.println();
				System.out.print(ch[j] + " ");
			}
			if(j%6!=0){
				System.out.print(ch[j] + " ");
			}
		}
		/*
		 * for(int i=0; i<ch.length; i++){
		 * System.out.print(ch[i]+"");
		 * if(i%6==5){
		 * System.out.println();
		 * }
		 * }
		 */
		}

	public static void reverse(char[] ch) {
		int tmp = 0;
		
		for(int i=ch.length; i>0; i--) {
			System.out.print(ch[i-1] + " ");
			if(tmp%6==5) {
				System.out.println();
				
			}
			tmp++;
		}
		
		//배열을 하나 더 생성, 역순으로 데이터를 넘겨줘도 된다.
		tmp=0;
		char re[] = new char[26];
		for(int i = ch.length-1; i>=0; i--) {
			re[tmp] = ch[i];
			}
		}
		
	public static void upper(char[] ch) {
		System.out.print((char)((int)ch[0]-32));
		for(int j=1; j<ch.length; j++) {			
			if(j%6==0) {
				System.out.println();
				System.out.print((char)((int)ch[j]-32));
			}
			if(j%6!=0){
				System.out.print((char)((int)ch[j]-32));
			}
		}
		/*
		 * for(int i=0; i<ch.length; i++){
		 * ch[i] = (char)((int)ch[i]-32);
		 * 아니면..
		 * ch[i] = Character.toUpperCase(ch[i]);
		 * } 
		 * for(int i=0; i<ch.length; i++){
		 * System.out.print(ch[i] + " ");
		 * }
		 */
	}
}
	