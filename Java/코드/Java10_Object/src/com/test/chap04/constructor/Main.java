package com.test.chap04.constructor;

import java.util.Date;

public class Main {

	public static void main(String[] args) {

		//기본생성자
		User u1 = new User();
		
		u1.info();
		
		//매개변수생성자(String, String, String)
		User u2 = new User("user01", "pass01", "홍길동");
		u2.info();
		
		User u3 = new User("user02","pass02","이순신", new Date());
		u3.info();
	}
}
