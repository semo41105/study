package com.ch01_String;

public class Run {

	public static void main(String[] args) {
//		method1();
		method2();
	}
	
	public static void method1() {
	
		//1. ���ڿ��� ���ͷ��� ����
		String str = "abc";
		String str1 = "abc";
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		
		//2. ������
		String str2 = new String("abc");
		String str3 = new String("abc");
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		System.out.println();
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
		System.out.println("----------new ��� ��----------");
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
	}
	
	public static void method2() {
		String str = "abc";
		//charAt(�ε���)
		System.out.println(str.charAt(1));
		//concat(��ġ��)
		System.out.println(str.concat("def"));
		//contains(���Կ���)
		System.out.println(str.contains("abd"));
		//equals(��)
		System.out.println(str.contentEquals("abc"));
		//length(����)
		System.out.println(str.length());

		String str1 = "ȫ�浿/��⵵�����ν�/�л�/����";
		//split(���ڱ���)
		String[] strArr = str1.split("/");
		
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		//toUpperCase(�빮�ڷ�), toLowCase(�ҹ��ڷ�)
		System.out.println(str.toUpperCase());
		//substring(�߶󳻱�)
		System.out.println(str1.substring(4,11));
		
		String str2 = "               ab     c       ";
		//trim(���� ����)
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
