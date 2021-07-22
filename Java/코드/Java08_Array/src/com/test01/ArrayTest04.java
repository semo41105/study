package com.test01;

public class ArrayTest04 {
	public static void main(String[] args) {
//		new ArrayTest04().shallowCopy();
//		new ArrayTest04().deepCopy1();
//		new ArrayTest04().deepCopy2();
		new ArrayTest04().deepCopy3();
	}
	//얕은 복사는 원본의 주소만 복사 // 깊은 복사는 원본과 똑같은 갯수의 방을 만들어준 후 반복문을 사용하여 방을 원본과 같은 값으로 채워준다??
	
	public void shallowCopy() {
		//얕은복사는 주소만 복사
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = originArr;
		//원본 배열 출력
		for(int i=0; i<originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		System.out.println();
		
		//복사한 배열 출력
		for(int i=0; i<copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println();
		
		//원본배열 값 변경
		originArr[0] = 99;
		
		//복사한 배열 값 변경
		copyArr[2] = 22;
		
		//원본 배열 출력
		for(int i=0; i<originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		System.out.println();
		//복사한 배열 출력
		for(int i=0; i<copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println();
		//hashcode
		System.out.println("originArr의 hashcode: "+ originArr.hashCode());
		System.out.println("copyArr의 hashcode: " + copyArr.hashCode());
	}
	
	public void deepCopy1() {
		//깊은 복사  - 동일한 새로운 배열을 하나 생성하고 값 복사
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[5];
		
		//for문을 이용하여 값 복사
		for(int i=0; i<originArr.length; i++){
			copyArr[i] = originArr[i];
		}
			//원본 배열 출력
			for(int i=0; i<originArr.length; i++) {
				System.out.print(originArr[i]+" ");
			}
			
			System.out.println();
			
			//복사한 배열 출력
			for(int i=0; i<copyArr.length; i++) {
				System.out.print(copyArr[i]+" ");
			}
			
			System.out.println();

			//원본배열 값 변경
			originArr[0] = 99;
			
			//복사한 배열 값 변경
			copyArr[2] = 22;
			
			//원본 배열 출력
			for(int i=0; i<originArr.length; i++) {
				System.out.print(originArr[i]+" ");
			}
			
			System.out.println();
			
			//복사한 배열 출력
			for(int i=0; i<copyArr.length; i++) {
				System.out.print(copyArr[i]+" ");
			}
			
			System.out.println();
			
			//해시코드
			System.out.println("originArr의 hashcode: "+originArr.hashCode());
			System.out.println("copyArr의 hashcode: "+copyArr.hashCode());
		}
		
	public void deepCopy2() {
		//arraycopy()
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		
		//arraycopy(Object src, int srcPos, Object dest, int destPos, length)
		// src: 원본배열, srcPos: 복사 시작위치,
		// dest: 카피배열, destPos: 붙여넣기 시작위치,
		// length: 복사될 길이
		System.arraycopy(originArr, 0, copyArr, 3, originArr.length);
		//원본 배열 출력
		for(int i=0; i<originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		
		System.out.println();
		
		//복사한 배열 출력
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
		
		//원본 배열 출력
		for(int i=0; i<originArr.length; i++) {
			System.out.print(originArr[i]+" ");		
		}

		System.out.println();
				
		//복사한 배열 출력
		for(int i=0; i<copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");		
		}
			
		System.out.println();
	}
}
