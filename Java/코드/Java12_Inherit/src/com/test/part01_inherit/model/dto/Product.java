package com.test.part01_inherit.model.dto;

import java.util.Date;

public class Product {
	
	//모든 상품에 대한 공통적인 요소만 추출하여 부모클래스 생성
	
	private String brand;			//제조사
	private String productNumber;	//상품번호
	private String productCode;		//상품코드
	private String productName;		//상품명
	private int price;				//가격	
	private Date date;				//제조일

	//생성자(기본, 매개변수)
	
	public Product() {
		//super(); 생략되어 있는 채
		System.out.println("Product의 기본 생성자");
		
	}
	public Product(String brand, String productNumber, String productCode,String productName,
			int price, Date date) {
		this.brand = brand;
		this.productNumber = productNumber;
		this.productCode = productCode;
		this.productName = productName;
		this.price = price;
		this.date = date;
		System.out.println("부모 생성자 호출 완료!");
		
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
		return "브랜드: "+brand+" 상품번호: "+productNumber+" 상품코드: "+
	productCode+" 상품이름: "+productName+" 상품가격: "+price+" 제조일: "+date;	
	}
}
