package com.test01;

public class DeArrayTest01 {

	public static void main(String[] args) {
//		test1();
		test2();
	}
	
	public static void test1() {
		//����
		int[][] iarr1;
		int iarr2[][];
		
		//�Ҵ�
		iarr1 = new int[3][5];
		iarr2 = new int[3][];
		iarr2[0] = new int[5];
		iarr2[1] = new int[5];
		iarr2[2] = new int[3];
		
		//�����迭(���簢������ �迭), �����迭(�����й��� �迭)
		
		//iarr2 = new int[][5]; �̷� ������ ���� �� ����.
		
		for(int i=0; i<iarr2.length; i++) {
			for(int j=0; j<iarr2[i].length; j++) {
				System.out.print(iarr2[i][j]+" ");
			}
			System.out.println();
		}
		
//		iarr1[0][0] = 1;
//		iarr1[0][1] = 2;
		int val = 1;
		for(int i=0; i<iarr1.length; i++){
			for(int j=0; j<iarr1[i].length; j++) {
				iarr1[i][j] = val++;
			}
		}
		new DeArrayTest01().prn(iarr1);
	}
	
	//������ �迭�� ���޹޾� ����ϴ� �޼ҵ�
	public void prn(int[][] iarr) {
		for(int i=0; i<iarr.length; i++) {
			for(int j=0; j<iarr[i].length; j++) {
				System.out.print("\t"+iarr[i][j]);
			}
			System.out.println();
		}		
	}
	
	public static void test2() {
		//����
		int[][] iarr = new int[3][];
		
		//new DeArrayTest01().prn(iarr);
		
		iarr[0] = new int[5];
		iarr[1] = new int[3];
		iarr[2] = new int[10];
		
		new DeArrayTest01().prn(iarr);
		
		int val=1;
		for(int i=0; i<iarr.length; i++) {
			for(int j=0; j<iarr[i].length; j++) {
				iarr[i][j] = val++;
			}
		}
		new DeArrayTest01().prn(iarr);
		
		System.out.println();
//		int[][] arr = { {1,2,3}, {4,5,6,7,8,9}, {10,11,12,13} };
		int[][] arr = { {1,2,3}, {4,5,6}, {10,11,12,} };
		new DeArrayTest01().prn(arr);
	}
}
