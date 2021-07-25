package com.test.silsub0;

public class SUV extends Car{
	public SUV() {
		System.out.println("suv ����");
	}
	
	public SUV(String color) {
		super(color);
		System.out.println(color+"�� suv ����");
	}
	
	@Override
	public void accelPedal() {
		System.out.println("�ӵ��� ������ �ö󰩴ϴ�.");
		super.setSpeed(super.getSpeed()+15);
	}
	@Override
	public void breakPedal() {
		super.setSpeed(super.getSpeed()-15);
		
		if(super.getSpeed()>0) {
			System.out.println("�ӵ��� ������ �پ��ϴ�.");
		}else {
			super.setSpeed(0);
			System.out.println("������ϴ�.");
		}
	}
}
