package com.test01;

public class Thread02 {
	public static void main(String[] args) {
		MyThread02 t1 = new MyThread02("이유나");
		MyThread02 t2 = new MyThread02("장미경");

		//scheduling
		//우선순위, 순환할당
		t1.setPriority(10);
		t2.setPriority(5);
		
		t1.start();
		t2.start();
	}
}

class MyThread02 extends Thread{
	public MyThread02(String name) {
		super(name);
	}
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println(this.getName()+" = " + i);
		}
		System.out.println(this.getName() + "끝!!");
	}
}
