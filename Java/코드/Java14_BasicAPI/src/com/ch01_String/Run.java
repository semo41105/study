package com.ch01_String;

public class Run {

	public static void main(String[] args) {
//		method1();
		method2();
	}
	
	public static void method1() {
	
		//1. 문자열을 리터럴로 생성
		String str = "abc";
		String str1 = "abc";
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		
		//2. 생성자
		String str2 = new String("abc");
		String str3 = new String("abc");
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		System.out.println();
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
		System.out.println("----------new 사용 후----------");
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
	}
	
	public static void method2() {
		String str = "abc";
		//charAt(인덱스)
		System.out.println(str.charAt(1));
		//concat(합치기)
		System.out.println(str.concat("def"));
		//contains(포함여부)
		System.out.println(str.contains("abd"));
		//equals(비교)
		System.out.println(str.contentEquals("abc"));
		//length(길이)
		System.out.println(str.length());

		String str1 = "홍길동/경기도의정부시/학생/으어";
		//split(문자구분)
		String[] strArr = str1.split("/");
		
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		//toUpperCase(대문자로), toLowCase(소문자로)
		System.out.println(str.toUpperCase());
		//substring(잘라내기)
		System.out.println(str1.substring(4,11));
		
		String str2 = "               ab     c       ";
		//trim(공백 제거)
		System.out.println(str2);
		System.out.println(str2.trim());

		///
		String str3 = "Hello Java World";
		System.out.print(str3.substring(0,5));
		System.out.print(str3.substring(6,10));
		System.out.print(str3.substring(11,16));
		//System.out.println(str3.replace(" ". "");
		//System.out.println(str3.replaceAll(" ". "");
	}
}
