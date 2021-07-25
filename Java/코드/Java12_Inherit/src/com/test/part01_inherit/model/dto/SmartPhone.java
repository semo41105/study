package com.test.part01_inherit.model.dto;

import java.util.Date;

public class SmartPhone extends Computer {
	private String agency;

	// ������(�⺻, �Ű�����(����Ŭ�����ʵ�+����Ŭ�����ʵ�))
	public SmartPhone() {
	}

	public SmartPhone(String brand, String productNumber, String productCode, String productName, int price, Date date,
			String cpu, int hdd, int ram, String os, String agency) {
		super(brand, productNumber, productCode, productName, price, date, cpu, hdd, ram, os);
		this.agency = agency;
	}

	// getter,setter
	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	// @Override
	public String info() {
		return super.info() + ", " + this.agency;
	}
}
