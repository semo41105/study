package com.test.chap01;

public class Score {
	private String name = "ȫ�浿";
	private int kor = 90;
	private int eng = 84;
	private int mat = 97;
	
	//������
	public Score() {}
	
	//������ ���ϴ� �޼ҵ�
	public void total() {
		int sum;
		sum = kor+eng+mat;
		System.out.println(name+"���� �� ������ "+sum+"�� �Դϴ�.");		
		//return kor+eng+mat;
	}
	
	//����� ��ȸ�ϴ� �޼ҵ�
	public void average() {
		double aver;
		aver = ((kor+eng+mat)/3);
		System.out.println(name+"���� ��� ������ "+aver+"�� �Դϴ�.");	
		// double aver = sum()/3;
	}
	
	//���� ���� ������ ���� ������ ã�� �޼ҵ�
	public void maximum() {
		String max;
		if(kor>eng) {
			if(kor>mat) {
				max = "����";
				System.out.println(name+"���� ���� ���� ������ ������ "+max+" �Դϴ�.");
			}else if(kor<mat) {
				max = "����";
				System.out.println(name+"���� ���� ���� ������ ������ "+max+" �Դϴ�.");
			}
		}else if(eng>mat){
				max = "����";
				System.out.println(name+"���� ���� ���� ������ ������ "+max+" �Դϴ�.");
		}
		/*int max = 0;
		 * String subject = "";
		 * if(kor>eng){
		 * if(kor>mat){
		 * max=kor;
		 * subject="kor";
		 * }else{
		 * max=mat;
		 * subject="mat";
		 * }
		 * }else{
		 * if(eng>mat){
		 * max=eng;
		 * subject="eng";
		 * }{else{
		 * max=mat;
		 * subject="mat";
		 * } 
		 * }
		 * System.out.println("���� ���� ������ ���� ������ "+subject+"�̰�, ������ "+max+" �Դϴ�.");
		 * 
		 */
				
	}
	
	//���� ���� ������ ���� ������ ã�� �޼ҵ�
	public void minimum() {
		String min;
		if(kor<eng) {
			if(kor<mat) {
				min = "����";
				System.out.println(name+"���� ���� ���� ������ ������ "+min+" �Դϴ�.");
			}else if(kor<mat) {
				min = "����";
				System.out.println(name+"���� ���� ���� ������ ������ "+min+" �Դϴ�.");
			}
		}else if(eng>mat){
				min = "����";
				System.out.println(name+"���� ���� ���� ������ ������ "+min+" �Դϴ�.");
		}
	}
	
	//��� ������ Ȯ���ϰ� ����� �ű�� �޼ҵ�
	public void grade() {
		int aver;
		aver = ((kor+eng+mat)/3);
		if(aver>=90) {
			char gra = 'A';
			System.out.println(name+"���� ��� ������ "+aver+"���̸�, ����� "+gra+"��� �Դϴ�.");
		}else if(aver<90||aver>=80) {
			char gra = 'B';
			System.out.println(name+"���� ��� ������ "+aver+"���̸�, ����� "+gra+"��� �Դϴ�.");
		}else if(aver<80||aver>=70) {
			char gra = 'C';
			System.out.println(name+"���� ��� ������ "+aver+"���̸�, ����� "+gra+"��� �Դϴ�.");
		}else {
			char gra = 'D';
			System.out.println(name+"���� ��� ������ "+aver+"���̸�, ����� "+gra+"��� �Դϴ�.");
		}
		
		/*
		 * double avg = sum()/3;
		 * char grade;
		 * switch((int)avg/10{
		 * case 10:
		 * case 9:
		 * grade = 'A';
		 * break;
		 * case 8:
		 * grade = 'B';
		 * break;
		 * case 7:
		 * grade = 'C';
		 * default:
		 * grade = 'F';
		 * }
		 * System.out.println("�����"+grade+"�Դϴ�.")
		 */
	}
	
	//����� �ʵ� ������ Ȯ���� �� �ִ� info() �޼ҵ�
	public void info() {
		System.out.println("�̸�: "+name);
		System.out.println("���� ����: "+kor);
		System.out.println("���� ����: "+mat);
		System.out.println("���� ����: "+eng);	
	}
}
