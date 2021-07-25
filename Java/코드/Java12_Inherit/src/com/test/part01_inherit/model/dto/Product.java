package com.test.part01_inherit.model.dto;

import java.util.Date;

public class Product {
	
	//��� ��ǰ�� ���� �������� ��Ҹ� �����Ͽ� �θ�Ŭ���� ����
	
	private String brand;			//������
	private String productNumber;	//��ǰ��ȣ
	private String productCode;		//��ǰ�ڵ�
	private String productName;		//��ǰ��
	private int price;				//����	
	private Date date;				//������

	//������(�⺻, �Ű�����)
	
	public Product() {
		//super(); �����Ǿ� �ִ� ä
		System.out.println("Product�� �⺻ ������");
		
	}
	public Product(String brand, String productNumber, String productCode,String productName,
			int price, Date date) {
		this.brand = brand;
		this.productNumber = productNumber;
		this.productCode = productCode;
		this.productName = productName;
		this.price = price;
		this.date = date;
		System.out.println("�θ� ������ ȣ�� �Ϸ�!");
		
	}
	
	//getter&setter
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	//info
	
	public String info() {
		return "�귣��: "+brand+" ��ǰ��ȣ: "+productNumber+" ��ǰ�ڵ�: "+
	productCode+" ��ǰ�̸�: "+productName+" ��ǰ����: "+price+" ������: "+date;	
	}
}
