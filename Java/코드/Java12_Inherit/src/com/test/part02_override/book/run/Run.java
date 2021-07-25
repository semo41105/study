package com.test.part02_override.book.run;

import com.test.part02_override.book.model.Book;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("������ ����", "�����", 100);
		Book b2 = new Book("�ڹ��� ����", "���ڹ�", 300);
		
//		System.out.println("b1= " +b1.toString());
//		System.out.println("b2= "+ b2.toString());
		
		System.out.println("b1= "+b1);
		System.out.println("b2= "+b2);
		
		//��ü ��
		System.out.println("b1 == b2? : "+(b1 == b2));
		System.out.println("b1.equals(b2): "+ b1.equals(b2));
		
		Book b3 = b1;
		System.out.println("b1�� b3�� ���� ��ü�ΰ�? : "+ b1.equals(b3));
		
		//�ּҴ� �ٸ����� ���� ���� ��ü�� ���ü
		//�ּҰ����� ���� ��ü�� ���ϰ�ü
		Book b4 = new Book("������ ����", "�����", 100);
		System.out.println("b1�� b4�� ���� ��ü�ΰ�? : "+b1.equals(b4));
		System.out.println("b1�� hashcode: "+b1.hashCode());
		System.out.println("b4�� hashcode: "+b4.hashCode());	
	}
}
