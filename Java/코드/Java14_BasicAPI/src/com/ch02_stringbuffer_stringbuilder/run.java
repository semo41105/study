package com.ch02_stringbuffer_stringbuilder;

public class run {

	public static void main(String[] args) {
		method1();
//		method2();
	}
	public static void method1() {
		String str = "�ݰ���! ";
		System.out.println("str: "+ str + ", �ּ�: " + str.hashCode());
		str += "���� String�̶�� ��";
		System.out.println("str �߰� ��: "+ str + ", �ּ�: "+ str.hashCode());
		//String�� ���ڿ� �� ������ �Ұ���. ���� �� ������ ���ڿ��� ���� �Ҵ�Ǿ� �� �ּҸ� �ѱ�.
		StringBuffer sbf = new StringBuffer("�ȳ�! ");
		System.out.println("sbf: "+sbf+", �ּ�: "+sbf.hashCode());
		sbf.append("�� StringBuffer!");
		System.out.println("sbf �߰� ��: "+sbf+", �ּ�: "+sbf.hashCode());
		
		StringBuilder sbd = new StringBuilder("����! ");
		System.out.println("sbd: "+ sbd+", �ּ�: "+ sbd.hashCode());
		sbd.append("���� �� StringBuilder!!");
		System.out.println("sbd �߰� ��: "+sbd+ ", �ּ�: "+sbd.hashCode());
		//sbf�� ���ڿ� �� ���� ����, ���� ���� ���� ���� ���ڿ��� �����Ǿ� ����Ǹ�
		//�⺻ 16���� ũ��� ������ ���۸� �̿��Ͽ� ũ�� ���� ����		
		//������ safe����� ����(���� ���� ����)
		//sbd�� ������ safe����� �������� ����.
		
	}
	public static void method2() {
		StringBuilder sb = new StringBuilder("�� ");
		
//		sb.append("�谡 �ҷ���");
//		sb.append("~~:)");
		sb.append("�谡 �ҷ���").append("~:)"); //�޼ҵ� ü�̴�
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		//insert
		sb.insert(0,"���������� �Ծ ");
		//delete
		sb.delete(0, 9);
			
		System.out.println(sb);
		
		//reverse
		sb.reverse();
		System.out.println(sb);
	}
}
