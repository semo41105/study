package com.poly.test01;

public abstract class Animal {
	//�߻�޼ҵ� => ��ӽ� ��ӹ޴� class�� �ݵ�� �����ؾ� ��.
	public abstract void bark();
	
	public void eat(String animal) {
		System.out.println(animal+"�Դ´�.");
	}
}
