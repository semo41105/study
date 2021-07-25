package com.test.part01_inherit.model.dto;

import java.util.Date;

public class Television extends Product {
	// product Ŭ���� ��ӹ޾� ����

	private int inch;

	// ������(�⺻, �Ű�����)
	public Television() {
		//super(); �����Ǿ� �ִ� ä��.
		System.out.println("Television�� �⺻ ������");
	}

	//��� �ʵ带 �Ű������� �����ϴ� ������(�θ� �ʵ� �ʱ�ȭ�Ǵ� ������ �޴´�)
	public Television(String brand, String productNumber, String productCode,
			String productName, int price, Date date, int inch) {
		super(brand, productNumber,productCode, productName, price, date);
		this.inch = inch;
		System.out.println("television ������ ȣ�� �Ϸ�!");
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
