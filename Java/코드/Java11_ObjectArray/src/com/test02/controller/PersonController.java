package com.test02.controller;

import java.util.Scanner;

import com.test02.model.dto.Person;

public class PersonController {
	private Person[] people = new Person[2];
	Scanner sc = new Scanner(System.in);
	//ȸ�� �߰�
	public void insertPerson() {
		for(int i = 0; i<people.length; i++) {
			System.out.println("== ��� ���� �Է� ==");
			System.out.println("�̸�: ");
			String name = sc.next();
			System.out.println("����: ");
			int age = sc.nextInt();
			System.out.println("���: ");
			int wealth = sc.nextInt();
			
			//name�� nextLine�϶��� ���⿡ sc.nextLine(); �߰��ؼ� ��� ����
			//next();�� ���ڿ��� �Է¹���. ���� �ϸ� ������ �ν� ���ؼ� ����.
			//nextLine();�� ���� ��� �� �� �� �Է¹���.
			
			people[i] = new Person(name, age, wealth);
		}
	}
	//ȸ�� ��ü ��ȸ
	public void printPerson() {
//		for(int i = 0; i<people.length; i++) {
//			System.out.println(people[i].information());
//		}
		
		//���� for��
		for(Person p : people) { //person ��ü
			System.out.println(p.information());
		}	
	}
	
	//��� ��� ��ȸ
	public void avg() {
		//��� ���ؼ� ���
		int avg = 0;
		int sum = 0;
		
		for(int i=0; i<people.length; i++) {
			sum += people[i].getWealth();
		}
		
		System.out.println(sum/people.length);

		/*int sum = 0;
		 * for(int i=0; i<people.length; i++){
		 * sum += people[i].getWealth();
		 * }
		 * System.out.println("��� ���: "+sum/people.length);
		 * 
		 */

	}
	//ȸ�� �̸� �˻�
	public void searchPerson() {
		//ȸ�� �̸����� �˻� �� ȸ�� ���� ���
		System.out.println("ȸ�� �̸� �˻�: ");
		String search = sc.next();
		for(int i=0; i<people.length; i++) {
			if(people[i].getName().equals(search)) {
				System.out.println(people[i].information());
			}
		}
		
		/*System.out.printl("�˻��� �̸�: ");
		 * String search = sc.next();
		 * 
		 * f0r*int i=0; i<people.length; i++){
		 * if(people[i].getName().equals(search){
		 * System.out.println(people[i].information());
		 * }
		 */

	}
}
