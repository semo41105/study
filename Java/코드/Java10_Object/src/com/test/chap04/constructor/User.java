package com.test.chap04.constructor;

import java.util.Date;

public class User {
	
	private String userId;
	private String userPwd;
	private String userName;
	private Date enrollDate;
	
	//기본생성자 -> 객체 생성할 때만 사용
	public User() {System.out.println("기본 생성자 실행!!");
	
		this.userId = "lee01";
	}
	
	//같은 이름의 생성자 or 메소드의 경우 에러 발생
//	public User() {}
	
	//매개변수생성자-> 객체 생성과 필드 초기화 두 가지 목적
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		//필드보다 지역변수가 우선순위를 받는거라.. this를 사용해야 함
	}
	
	public User(String userId, String userPwd, String userName, Date enrollDate) {
		this(userId, userPwd, userName);//첫 줄에 써야 함.
		
		//같은 클래스 안에서 다른 생성자를 불러내는 역할. 괄호 안에 아무것도 안 적으면 기본 생성자 호출됨.
			
		/*
		 * this.userId = userId;
		 * this.userPwd = userPwd;
		 * this.userName = userName;
		 * 
		 */
		
		this.enrollDate = enrollDate;
	}

	//출력용 메소드
	public void info() {
		System.out.println(userId + ", "+userPwd + ", "+userName+", "+enrollDate);
	}
}
