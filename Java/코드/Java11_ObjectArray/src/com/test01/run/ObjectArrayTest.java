package com.test01.run;

import java.util.Scanner;

import com.test01.model.dto.Book;

public class ObjectArrayTest {

	public static void main(String[] args) {
		//객체배열
		/*
		//선언 및 할당
		Book[] bk = new Book[3];
		//초기화
		bk[0] = new Book("자바의 정석","홍길동","나무",10000);
		bk[1] = new Book("HTML의 정석","이창진","KH",15000);
		bk[2] = new Book("프로그래밍","이순신","KH",30000);
		*/
		//선언 및 할당과 초기화
		Book[] bk = {
				new Book("자바의 정석","홍길동","나무",10000),
				new Book("HTML의 정석","이창진","KH",15000),
				new Book("프로그래밍","이순신","KH",30000)
					};
					
		System.out.println(bk);
		System.out.println(bk[0]);
		System.out.println(bk[0].getTitle());
		System.out.println();
		
		//도서 출력
		for(int i=0; i<bk.length; i++) {
			System.out.println(bk[i].information());
		}
		
		//도서 검색
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 책 제목: ");
		String search = sc.nextLine();
		
		for(int i=0; i<bk.length; i++) {
			if(bk[i].getTitle().equals(search)) {
				System.out.println(bk[i].information());
			}
		}
	}
}
