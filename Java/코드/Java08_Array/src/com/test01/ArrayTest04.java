package com.test01;

public class ArrayTest04 {
	public static void main(String[] args) {
//		new ArrayTest04().shallowCopy();
//		new ArrayTest04().deepCopy1();
//		new ArrayTest04().deepCopy2();
		new ArrayTest04().deepCopy3();
	}
	//���� ����� ������ �ּҸ� ���� // ���� ����� ������ �Ȱ��� ������ ���� ������� �� �ݺ����� ����Ͽ� ���� ������ ���� ������ ä���ش�??
	
	public void shallowCopy() {
		//��������� �ּҸ� ����
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = originArr;
		//���� �迭 ���
		for(int i=0; i<originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		System.out.println();
		
		//������ �迭 ���
		for(int i=0; i<copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println();
		
		//�����迭 �� ����
		originArr[0] = 99;
		
		//������ �迭 �� ����
		copyArr[2] = 22;
		
		//���� �迭 ���
		for(int i=0; i<originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		System.out.println();
		//������ �迭 ���
		for(int i=0; i<copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println();
		//hashcode
		System.out.println("originArr�� hashcode: "+ originArr.hashCode());
		System.out.println("copyArr�� hashcode: " + copyArr.hashCode());
	}
	
	public void deepCopy1() {
		//���� ����  - ������ ���ο� �迭�� �ϳ� �����ϰ� �� ����
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[5];
		
		//for���� �̿��Ͽ� �� ����
		for(int i=0; i<originArr.length; i++){
			copyArr[i] = originArr[i];
		}
			//���� �迭 ���
			for(int i=0; i<originArr.length; i++) {
				System.out.print(originArr[i]+" ");
			}
			
			System.out.println();
			
			//������ �迭 ���
			for(int i=0; i<copyArr.length; i++) {
				System.out.print(copyArr[i]+" ");
			}
			
			System.out.println();

			//�����迭 �� ����
			originArr[0] = 99;
			
			//������ �迭 �� ����
			copyArr[2] = 22;
			
			//���� �迭 ���
			for(int i=0; i<originArr.length; i++) {
				System.out.print(originArr[i]+" ");
			}
			
			System.out.println();
			
			//������ �迭 ���
			for(int i=0; i<copyArr.length; i++) {
				System.out.print(copyArr[i]+" ");
			}
			
			System.out.println();
			
			//�ؽ��ڵ�
			System.out.println("originArr�� hashcode: "+originArr.hashCode());
			System.out.println("copyArr�� hashcode: "+copyArr.hashCode());
		}
		
	public void deepCopy2() {
		//arraycopy()
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		
		//arraycopy(Object src, int srcPos, Object dest, int destPos, length)
		// src: �����迭, srcPos: ���� ������ġ,
		// dest: ī�ǹ迭, destPos: �ٿ��ֱ� ������ġ,
		// length: ����� ����
		System.arraycopy(originArr, 0, copyArr, 3, originArr.length);
		//���� �迭 ���
		for(int i=0; i<originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		
		System.out.println();
		
		//������ �迭 ���
		for(int i=0; i<copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		
		System.out.println();
	}
	
	public void deepCopy3() {
		//clone()
		int[] originArr = { 1,2,3,4,5 };
		int[] copyArr = new int[10];
		
		System.out.println(copyArr.hashCode());
		
		copyArr = originArr.clone();
		
		System.out.println(copyArr.hashCode());
		
		//���� �迭 ���
		for(int i=0; i<originArr.length; i++) {
			System.out.print(originArr[i]+" ");		
		}

		System.out.println();
				
		//������ �迭 ���
		for(int i=0; i<copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");		
		}
			
		System.out.println();
	}
}
