package com.test01;

public class Thread01 {
	public static void main(String[] args) {
		System.out.println("---main start---");
		MyThread m1 = new MyThread();
		Thread t1 = new Thread(m1);
		t1.start(); //thread -> 자동으로 run() 호출
		
		Thread t2 = new Thread(new MyThread());
		t2.start();
		
		System.out.println("---main stop---");
	}
}

class MyThread implements Runnable{
	
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("i= "+i);
		}
	}
}
