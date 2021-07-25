package com.test.part02_override.book.run;

import com.test.part02_override.book.model.Book;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("수학의 정석", "김수학", 100);
		Book b2 = new Book("자바의 정석", "박자바", 300);
		
//		System.out.println("b1= " +b1.toString());
//		System.out.println("b2= "+ b2.toString());
		
		System.out.println("b1= "+b1);
		System.out.println("b2= "+b2);
		
		//객체 비교
		System.out.println("b1 == b2? : "+(b1 == b2));
		System.out.println("b1.equals(b2): "+ b1.equals(b2));
		
		Book b3 = b1;
		System.out.println("b1과 b3는 같은 객체인가? : "+ b1.equals(b3));
		
		//주소는 다르지만 값이 같은 객체는 동등객체
		//주소값까지 같은 객체는 동일객체
		Book b4 = new Book("수학의 정석", "김수학", 100);
		System.out.println("b1과 b4는 같은 객체인가? : "+b1.equals(b4));
		System.out.println("b1의 hashcode: "+b1.hashCode());
		System.out.println("b4의 hashcode: "+b4.hashCode());	
	}
}
