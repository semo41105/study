package com.test01.run;

import java.util.Scanner;

import com.test01.model.dto.Book;

public class ObjectTest {

	public static void main(String[] args) {
		Book bk1 = new Book("자바의 정석", "홍길동", "나무", 10000);
		Book bk2 = new Book("HTML의 정석", "이순신", "KH", 20000);
		Book bk3 = new Book("오리진", "댄브라운", "출판사", 30000);
	
		//출력
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		System.out.println();
		//도서 검색
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 책 제목: ");
		String search = sc.nextLine();
		
		if(bk1.getTitle().equals(search)) {
			System.out.println(bk1.information());
		}else if(bk2.getTitle().equals(search)) {
			System.out.println(bk2.information());
		}else if(bk3.getTitle().equals(search)) {
			System.out.println(bk3.information());
		}
	}
}
