package com.test02.view;

import java.util.Scanner;

import com.test02.controller.PersonController;

public class PersonMenu {
	public void mainMenu() {
		Scanner sc = new Scanner(System.in);
		PersonController pc = new PersonController();
		
		while(true) {
			System.out.println("==== �޴� ====");
			System.out.println("1. ȸ�� �߰�");
			System.out.println("2. ȸ�� ��ü ��ȸ");
			System.out.println("3. ��� ��� ��ȸ");
			System.out.println("4. ȸ�� �̸����� �˻�");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ����: ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				pc.insertPerson();
				break;
			case 2:
				pc.printPerson();
				break;
			case 3:
				pc.avg();
				break;
			case 4:
				pc.searchPerson();
				break;
			case 9:
				System.out.println("���α׷� �����մϴ�.");
				return;
				//�޼ҵ尡 ����ȴ�.
			default:
				System.out.println("�ٽ� �Է����ּ���.");
				break;
			}
		}	
	}	
}
