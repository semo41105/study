package com.ch04_wrapperClass;

public class Run {
	//WrapperClass
	//	Boxing : �⺻�ڷ���->wrapper Ŭ���� ��ü (AutoBoxing)
	//UnBoxing : wrapper Ŭ���� ��ü -> �⺻ �ڷ���(AutoUnBoxing)
	public static void main(String[] args) {
		//boxing
		int no = 10;
		Integer i = new Integer(no);
		Integer i2 = new Integer(15);
		Double d = new Double(11.0);
		
		System.out.println(i.equals(i2));
		System.out.println(i.compareTo(i2)); //������ i2�� ū ��, ����� i�� ū ��, 0�� ������

		//AutoBoxing
		Integer i3 = 10;
		Double d2 = 5.0;
		
		//Unboxing
		int pi = i.intValue();
		double pd = d.doubleValue();
		
		//AutoUnboxing
		int a = i;
		int b = i2;
		System.out.println(a+b);
		abox(20); //20�� int��. int�� Integer�� ��üȭ�� �Ǿ�� �ϴµ�..
					//autoboxing�� �Ͼ�ٴ� �� �� �� ����. ���⼭ object�� ���� �Ϳ� �������� ������� �� �� ���� 

		//
		System.out.println("-------------------");
		Integer sti = new Integer("12");
		
		int sti2 = new Integer("300");//�����ڽ��� ���� sit2�� �� �� �ִ�
		
		int ii = Integer.parseInt("3");
		double dd = Double.parseDouble("0.2");
		boolean b1 = Boolean.parseBoolean("true");
		
		//1.5 ���� ���� ����. �ش��ϴ� ��Ʈ���� ��������� ��ȯ
		ii = Integer.valueOf("3");
		dd = Double.valueOf("0.2");
		
		String s1 = Integer.valueOf(3).toString();
		String c = Character.valueOf('a').toString();
		
		s1 = ii+"";
	}
	
	public static void abox(Object obj) {
		System.out.println(obj);
	}
}
