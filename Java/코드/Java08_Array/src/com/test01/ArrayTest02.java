package com.test01;

public class ArrayTest02 {
	public static void main(String[] args) {
		
		String[] sarr = {"apple", "banana", "orange"};
	//	for(int i=0; i<sarr.length; i++) {
	//		System.out.println(sarr[i]);
	//	}
	//	
		ArrayTest02 at02 = new ArrayTest02();

		//�迭�� ������ �Է�
		char[] ch = new char[26];
		for(int i=0; i<ch.length; i++) {
			ch[i] = (char)((int)'a'+i);
		}
		//1.a~z ������ �迭 ���
//		prn(ch);	
		//2. ch�� �Ųٷ� ���
		reverse(ch);
		//3.ch�� �빮�ڷ� �ٲپ ���
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
		
		//�迭�� �ϳ� �� ����, �������� �����͸� �Ѱ��൵ �ȴ�.
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
		 * �ƴϸ�..
		 * ch[i] = Character.toUpperCase(ch[i]);
		 * } 
		 * for(int i=0; i<ch.length; i++){
		 * System.out.print(ch[i] + " ");
		 * }
		 */
	}
}
	