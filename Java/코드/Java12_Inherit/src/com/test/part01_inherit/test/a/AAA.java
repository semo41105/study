package com.test.part01_inherit.test.a;


//public class AAA (extends Object)
public class AAA {
	private int abc;
	
	//기본생성자
	public AAA() {
		super();
		System.out.println("AAA 생성");
	}
	
	//매개변수생성자
	public AAA(int abc) {
		super();
		this.abc = abc;
		System.out.println("AAA 생성(abc 받아서)");
	}
	
	//게터 세터
	public int getAbc() {
		return abc;
	}
	public void setAbc(int abc) {
		this.abc = abc;
	}
	
	//prn()
	public void prn() {
		System.out.println("AAA의 prn메소드");
	}
}
