package com.test.silsub0;

public class SportsCar extends Car{
	public SportsCar() {
		System.out.println("sportscar 생성");
	}
	public SportsCar(String color) {
		super(color);
		System.out.println(color+"색 sportsCar 생성");
	}
	
	@Override
	public void accelPedal() {
		System.out.println("속도가 더 빨리 올라갑니다.");
		super.setSpeed(super.getSpeed()+30);
	}
	
	@Override
	public void breakPedal() {
		super.setSpeed(super.getSpeed()-30);
		
		if(super.getSpeed()>0) {
			System.out.println("속도가 더 빨리 줄어듭니다.");
		}else {
			super.setSpeed(0);
			System.out.println("멈췄습니다.");
		}
	}
}
