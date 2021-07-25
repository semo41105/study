package com.test.part01_inherit.model.dto;

import java.util.Date;

public class Desktop extends Computer {
	private boolean allInOne; // 일체형여부

	// 생성자(기본, 매개변수(상위클래스필드+하위클래스필드))
	public Desktop() {
	}

	public Desktop(String brand, String productNumber, String productCode, String productName, int price, Date date,
			String cpu, int hdd, int ram, String os, boolean allInone) {

		super(brand, productNumber, productCode, productName, price, date, cpu, hdd, ram, os);
		this.allInOne = allInone;
	}

	// getter,setter
	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	// @Override //어노테이션
	public String info() {
		return super.info() + ", " + this.allInOne;
	}

}
