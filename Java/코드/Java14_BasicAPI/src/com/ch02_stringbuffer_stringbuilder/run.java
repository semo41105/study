package com.ch02_stringbuffer_stringbuilder;

public class run {

	public static void main(String[] args) {
		method1();
//		method2();
	}
	public static void method1() {
		String str = "반가워! ";
		System.out.println("str: "+ str + ", 주소: " + str.hashCode());
		str += "나는 String이라고 해";
		System.out.println("str 추가 후: "+ str + ", 주소: "+ str.hashCode());
		//String은 문자열 값 수정이 불가능. 수정 시 수정된 문자열이 새로 할당되어 새 주소를 넘김.
		StringBuffer sbf = new StringBuffer("안녕! ");
		System.out.println("sbf: "+sbf+", 주소: "+sbf.hashCode());
		sbf.append("난 StringBuffer!");
		System.out.println("sbf 추가 후: "+sbf+", 주소: "+sbf.hashCode());
		
		StringBuilder sbd = new StringBuilder("하이! ");
		System.out.println("sbd: "+ sbd+", 주소: "+ sbd.hashCode());
		sbd.append("아이 엠 StringBuilder!!");
		System.out.println("sbd 추가 후: "+sbd+ ", 주소: "+sbd.hashCode());
		//sbf는 문자열 값 수정 가능, 수정 삭제 등이 기존 문자열에 수정되어 적용되며
		//기본 16문자 크기로 지정된 버퍼를 이용하여 크기 증가 가능		
		//쓰레드 safe기능을 제공(성능 저하 요인)
		//sbd는 쓰레드 safe기능을 제공하지 않음.
		
	}
	public static void method2() {
		StringBuilder sb = new StringBuilder("난 ");
		
//		sb.append("배가 불러요");
//		sb.append("~~:)");
		sb.append("배가 불러요").append("~:)"); //메소드 체이닝
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		//insert
		sb.insert(0,"제육볶음을 먹어서 ");
		//delete
		sb.delete(0, 9);
			
		System.out.println(sb);
		
		//reverse
		sb.reverse();
		System.out.println(sb);
	}
}
