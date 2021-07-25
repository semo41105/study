package com.test.part01_inherit.model.dto;

import java.util.Date;

public class Computer extends Product {
	private String cpu;
	private int hdd;
	private int ram;
	private String os;

	// 생성자(기본, 매개변수)
	public Computer() {// super();
	}

	// 부모클래스의 필드+자식클래스의 필드를 모두 매개변수로 받아 초기화
	public Computer(String brand, String productNumber, String productCode, 
			String productName,int price, Date date, 
			String cpu, int hdd, int ram, String os) {
		
		super(brand, productNumber, productCode, productName, price, date);
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.os = os;
	}
	//getter,setter
	//부모클래스에서 상속받은 건 이미 만들어져 있으므로 안 해도 됨. 여기에 있는 것만..
	
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;		
	}
	public int getHdd() {
		return hdd;
	}
	public void setHdd(int hdd) {
		this.hdd = hdd;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	
	public String info() {
		return super.info()+", "+this.cpu+", "+this.hdd+", "+this.ram+", "+this.os;
	}
}
