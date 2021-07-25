package com.test.part01_inherit.model.dto;

import java.util.Date;

public class Television extends Product {
	// product 클래스 상속받아 구현

	private int inch;

	// 생성자(기본, 매개변수)
	public Television() {
		//super(); 생략되어 있는 채임.
		System.out.println("Television의 기본 생성자");
	}

	//모든 필드를 매개변수로 선언하는 생성자(부모 필드 초기화되는 값까지 받는다)
	public Television(String brand, String productNumber, String productCode,
			String productName, int price, Date date, int inch) {
		super(brand, productNumber,productCode, productName, price, date);
		this.inch = inch;
		System.out.println("television 생성자 호출 완료!");
	}

	// getter,setter
	public void setInch(int inch) {
		this.inch = inch;
	}

	public int getInch() {
		return inch;
	}

	// info
	public String info() {
		return super.info() +", " + this.inch;
	}
}
