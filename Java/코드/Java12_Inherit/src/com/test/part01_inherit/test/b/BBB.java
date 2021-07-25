package com.test.part01_inherit.test.b;

import com.test.part01_inherit.test.a.AAA;

public class BBB extends AAA{
	private int b;
	
	public BBB() {
		super(); //부모의 생성자 -> AAA();
		System.out.println("BBB 생성");
	}
	
	public BBB(int b) {
		super(b);	//부모의 생성자 -> AAA(abc);
		this.b = b;
		System.out.println("BBB 생성(b받아서)");
	}
	
	public BBB(int abc, int b) {
		super(abc);
		this.b = b;
		System.out.println("BBB 생성(abc, b 받아서)");
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	public int getSum() {
		return super.getAbc() + this.getB();
	}
	
	@Override
	public void prn() {
		System.out.println("BBB.prn()");
	}
}
