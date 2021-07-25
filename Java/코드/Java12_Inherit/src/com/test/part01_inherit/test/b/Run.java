package com.test.part01_inherit.test.b;

import com.test.part01_inherit.test.a.AAA;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BBB b1 = new BBB();
		b1.setAbc(1);
		b1.setB(2);
		System.out.println(b1.getAbc()+" + "+b1.getB()+" = "+b1.getSum());
		
		BBB b2 = new BBB(3);
		b2.setB(4);;
		System.out.println(b2.getAbc()+" + "+b2.getB()+" = "+b2.getSum());
		
		BBB b3 = new BBB(5,6);
		System.out.println(b3.getAbc()+" + "+b3.getB()+" = "+b3.getSum());
		
		System.out.println("----------------------");
		AAA a1 = new AAA();
		AAA a2 = new BBB(); // 다형성
//		BBB a3 = new AAA(); 에러
	}
}
