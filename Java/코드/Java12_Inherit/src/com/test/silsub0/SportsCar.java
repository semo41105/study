package com.test.silsub0;

public class SportsCar extends Car{
	public SportsCar() {
		System.out.println("sportscar ����");
	}
	public SportsCar(String color) {
		super(color);
		System.out.println(color+"�� sportsCar ����");
	}
	
	@Override
	public void accelPedal() {
		System.out.println("�ӵ��� �� ���� �ö󰩴ϴ�.");
		super.setSpeed(super.getSpeed()+30);
	}
	
	@Override
	public void breakPedal() {
		super.setSpeed(super.getSpeed()-30);
		
		if(super.getSpeed()>0) {
			System.out.println("�ӵ��� �� ���� �پ��ϴ�.");
		}else {
			super.setSpeed(0);
			System.out.println("������ϴ�.");
		}
	}
}
