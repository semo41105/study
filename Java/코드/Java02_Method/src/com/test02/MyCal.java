package com.test02;

public class MyCal {
	//���������� �޸� ����Ÿ�� �޼ҵ��(�Ű�����[�Ķ����])
	public static void sum(int i, int j) {
		//�� ���ڸ� ���ϴ� ����� ������ �޼ҵ�
		int res = i + j;
		System.out.println("sum: " + res);
	}

	public static int sub(int i, int j) {
		int res = i - j;
		
		return res;
	}
	
	public static double mul(double i, double j) {
		double res = i * j;
		
		return res;
	}
	
	public static void div(int i, int j) {
		// '/' : ���� ���� ��
		int div01 = i / j;
		// '%' : ���� ���� ������
		int div02 = i % j;
		
		System.out.printf("%d / %d �� ��: %d\n", i,j,div01);
		//i, j, div01�� ���ʴ�� %d�� ��. \n�� ����(���� �ٷ�)
		System.out.println(i+" / " + j + " �� ������: " +div02);
	}
}
