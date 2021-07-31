package com.test01;

public class Thread03 {
	public static void main(String[] args) {
		MyThread02 m1 = new MyThread02("æﬂøÀ");
		MyThread02 m2 = new MyThread02("∏€∏€");
		
		long start_time = System.currentTimeMillis();
		m1.start();
		try {
			//m1 thread∞° ¡æ∑·µ… ∂ß±Ó¡ˆ
			//¥Ÿ∏• thread∏¶ ∏ÿ√·¥Ÿ.
			m1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		m2.start();
		
		long end_time = System.currentTimeMillis();
		System.out.println("Ω««‡Ω√∞£: "+(end_time - start_time));
	}
}
