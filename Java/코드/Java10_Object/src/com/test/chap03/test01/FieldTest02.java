package com.test.chap03.test01;

public class FieldTest02 {
	public static int staticNum;
	
	public static final int STATIC_NUM=1;
	//����ʵ� => �ݵ�� ����� ���ÿ� �ʱ�ȭ
	public final static int STATIC_NUM2=2;//�̷��� ������ �ٲ� ������.
	
	public void test() {
		//�������������� static Ű���带 ���� ���� ����X
//		static int localStaticNum;
	}
}
