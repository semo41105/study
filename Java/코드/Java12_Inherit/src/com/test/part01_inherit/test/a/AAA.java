package com.test.part01_inherit.test.a;


//public class AAA (extends Object)
public class AAA {
	private int abc;
	
	//�⺻������
	public AAA() {
		super();
		System.out.println("AAA ����");
	}
	
	//�Ű�����������
	public AAA(int abc) {
		super();
		this.abc = abc;
		System.out.println("AAA ����(abc �޾Ƽ�)");
	}
	
	//���� ����
	public int getAbc() {
		return abc;
	}
	public void setAbc(int abc) {
		this.abc = abc;
	}
	
	//prn()
	public void prn() {
		System.out.println("AAA�� prn�޼ҵ�");
	}
}
