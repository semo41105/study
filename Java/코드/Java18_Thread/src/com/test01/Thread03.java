package com.test01;

public class Thread03 {
	public static void main(String[] args) {
		MyThread02 m1 = new MyThread02("�߿�");
		MyThread02 m2 = new MyThread02("�۸�");
		
		long start_time = System.currentTimeMillis();
		m1.start();
		try {
			//m1 thread�� ����� ������
			//�ٸ� thread�� �����.
			m1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		m2.start();
		
		long end_time = System.currentTimeMillis();
		System.out.println("����ð�: "+(end_time - start_time));
	}
}
