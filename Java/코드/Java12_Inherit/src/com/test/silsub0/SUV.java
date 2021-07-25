package com.test.silsub0;

public class SUV extends Car{
	public SUV() {
		System.out.println("suv 생성");
	}
	
	public SUV(String color) {
		super(color);
		System.out.println(color+"색 suv 생성");
	}
	
	@Override
	public void accelPedal() {
		System.out.println("속도가 적당히 올라갑니다.");
		super.setSpeed(super.getSpeed()+15);
	}
	@Override
	public void breakPedal() {
		super.setSpeed(super.getSpeed()-15);
		
		if(super.getSpeed()>0) {
			System.out.println("속도가 적당히 줄어듭니다.");
		}else {
			super.setSpeed(0);
			System.out.println("멈췄습니다.");
		}
	}
}
