package com.io.part03_addStream.ch04_object;

import java.io.Serializable;

public class Member implements Serializable{

	private static final long serialVersionUID = 1L;
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	
	private String email;
	
	public Member() {
		super();
	}

	public Member(String userId, String userPwd, String userName, int age) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [userId=" + userId + ", userPwd=" + userPwd + ", userName=" + userName + ", age=" + age + "]";
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}	
}
