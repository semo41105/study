package com.test01.run;

import java.util.Scanner;

import com.test01.model.dto.Book;

public class ObjectTest {

	public static void main(String[] args) {
		Book bk1 = new Book("�ڹ��� ����", "ȫ�浿", "����", 10000);
		Book bk2 = new Book("HTML�� ����", "�̼���", "KH", 20000);
		Book bk3 = new Book("������", "�����", "���ǻ�", 30000);
	
		//���
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		System.out.println();
		//���� �˻�
		Scanner sc = new Scanner(System.in);
		System.out.println("�˻��� å ����: ");
		String search = sc.nextLine();
		
		if(bk1.getTitle().equals(search)) {
			System.out.println(bk1.information());
		}else if(bk2.getTitle().equals(search)) {
			System.out.println(bk2.information());
		}else if(bk3.getTitle().equals(search)) {
			System.out.println(bk3.information());
		}
	}
}
