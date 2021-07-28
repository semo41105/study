package com.chap01.runtime.controller;

import java.util.Scanner;
//Exception�� ErrorŬ���� ��� ObjectŬ������ �ڼ��̸� ��� ������ �ְ� ������ ExceptionŬ����.
//Checked Exception: �ݵ�� ���� ó���ؾ� ��.
//Unchecked Exception: �ݵ�� ����ó�������� �ʾƵ� ��.
public class RuntimeException {
	//�ҽ� �������� �ذ� ������ ������ ���ܶ�� ��. ����ó���� ���� �ذ�.
	//�ý��� ����: ��ǻ�� ���۵����� ���� ����, �ҽ� �������� �ذ� �Ұ�
	//������ ����: ���α׷��� ������ ���� �ҽ� ���� ���� ����, �ҽ� ������ �����Ͽ� �ذ�
	//��Ÿ�� ����: �Է� ���� Ʋ�Ȱų�, �迭�� �ε��� ������ ����ų�, ������ ���� �� �ַ� if�� ������� ���� ó��
	//�ҽ� �ڵ� �������� �ذ� ����, ġ������ ���ܻ�Ȳ�� ǥ���� ������ �ʴ´�.
	//ArrayIndexOutofBoundsException: �迭�� ������ �߸��� �ε��� ���� ����ϴ� ���
	//ClassCastException: ����� �� ���� ����ȯ ������ �����ϴ� ���
	//NullPointerException: ���������� null�� �ʱ�ȭ�� ��Ȳ���� �޼ҵ带 ȣ���ϴ� ���
	
	Scanner sc = new Scanner(System.in);
	
	public void ArithEx() {
		int ran = 0;
		double res = 0.0;
		
		while(true) {
			System.out.print("���� �ϳ� �Է�: ");
			int no = sc.nextInt();
			
			if(no!=0) {
			
			ran = (int)((Math.random()*10)+1);
			res = ran/(double)no;
			
			System.out.printf("%d / %d = %.2f\n", ran, no, res);
			}else {
				System.out.println("0�� �ƴ� ���� �Է��ϼ���.");
			}
		}
	}
	
	public void classNArrayEx() {
		//ClassCastException
		
		try {
			//Ʈ���̴� �ڵ带 �ۼ��ϴ� �κ�
/*		Character ch = 'a';	
		Object obj = ch;
		System.out.println(obj);
		
		String str = (String)obj; //ClassCastException
		System.out.println(str); //����X
	*/	
	/*		
		//ArrayIndexOutOfBoundsException
		int[] arr = new int[2];
		arr[0] = 1;
		arr[1] = 2;
		
		arr[2] = 3; //ArrayIndexOutOfBoundsException �߻�!
		System.out.println("���⵵ ����ɱ�?"); //���� �� ��.
			
	*/		
		//NullPointerException
			String str = null;
//			int length = str.length();
			
		}catch(ClassCastException e) {
			System.out.println("ClassCastException �߻�!!!! ���� ��Ҵ�~~~");
			e.printStackTrace();
			//Ʈ���̿��� ���� �߻��� �޾Ƽ� ó�����ִ� �κ�
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�����ε����ͼ���");
			e.printStackTrace();
		}catch(NullPointerException e) {
			System.out.println("null�ε�..");
			
		}finally {
			//���ܰ� �߻��ϵ� ���� ������ �����
			System.out.println("�̰� ������ ����!!");
		}
	}
/*	RuntimeException �ļ� Ŭ����
	ArithmeticException: 0���� ������ ��� �߻�. if������ ������ ���� 0���� �˻�
	NullPointerException: Null�� ���� ������ ��ü ��� ���� �õ� �� �߻�. ��ü ��� ���� ���� ������ null���� Ȯ��
	NegativeArraySizeException: �迭 ũ�⸦ ������ ������ ��� �߻�.�迭 ũ�⸦ 0���� ũ�� �����ؾ� ��
	ArrayIndexOutOfBoundsException: �迭�� index������ �Ѿ �����ϴ� ���. �迭��.lengt�� ����Ͽ� �迭�� ���� Ȯ��
	ClassCastException: Cast������ ��� �� Ÿ�� ����. instanceof�����ڷ� ��üŸ�� Ȯ�� �� cast����
	
*/
}
