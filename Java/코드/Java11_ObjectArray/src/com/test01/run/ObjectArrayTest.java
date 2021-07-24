package com.test01.run;

import java.util.Scanner;

import com.test01.model.dto.Book;

public class ObjectArrayTest {

	public static void main(String[] args) {
		//��ü�迭
		/*
		//���� �� �Ҵ�
		Book[] bk = new Book[3];
		//�ʱ�ȭ
		bk[0] = new Book("�ڹ��� ����","ȫ�浿","����",10000);
		bk[1] = new Book("HTML�� ����","��â��","KH",15000);
		bk[2] = new Book("���α׷���","�̼���","KH",30000);
		*/
		//���� �� �Ҵ�� �ʱ�ȭ
		Book[] bk = {
				new Book("�ڹ��� ����","ȫ�浿","����",10000),
				new Book("HTML�� ����","��â��","KH",15000),
				new Book("���α׷���","�̼���","KH",30000)
					};
					
		System.out.println(bk);
		System.out.println(bk[0]);
		System.out.println(bk[0].getTitle());
		System.out.println();
		
		//���� ���
		for(int i=0; i<bk.length; i++) {
			System.out.println(bk[i].information());
		}
		
		//���� �˻�
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� å ����: ");
		String search = sc.nextLine();
		
		for(int i=0; i<bk.length; i++) {
			if(bk[i].getTitle().equals(search)) {
				System.out.println(bk[i].information());
			}
		}
	}
}
