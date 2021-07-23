package com.test.chap01;

public class Score {
	private String name = "홍길동";
	private int kor = 90;
	private int eng = 84;
	private int mat = 97;
	
	//생성자
	public Score() {}
	
	//총합을 구하는 메소드
	public void total() {
		int sum;
		sum = kor+eng+mat;
		System.out.println(name+"님의 총 점수는 "+sum+"점 입니다.");		
		//return kor+eng+mat;
	}
	
	//평균을 조회하는 메소드
	public void average() {
		double aver;
		aver = ((kor+eng+mat)/3);
		System.out.println(name+"님의 평균 점수는 "+aver+"점 입니다.");	
		// double aver = sum()/3;
	}
	
	//제일 높은 점수를 받은 과목을 찾는 메소드
	public void maximum() {
		String max;
		if(kor>eng) {
			if(kor>mat) {
				max = "국어";
				System.out.println(name+"님의 제일 높은 점수의 과목은 "+max+" 입니다.");
			}else if(kor<mat) {
				max = "수학";
				System.out.println(name+"님의 제일 높은 점수의 과목은 "+max+" 입니다.");
			}
		}else if(eng>mat){
				max = "영어";
				System.out.println(name+"님의 제일 높은 점수의 과목은 "+max+" 입니다.");
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
		 * System.out.println("제일 높은 점수를 받은 과목은 "+subject+"이고, 점수는 "+max+" 입니다.");
		 * 
		 */
				
	}
	
	//제일 낮은 점수를 받은 과목을 찾는 메소드
	public void minimum() {
		String min;
		if(kor<eng) {
			if(kor<mat) {
				min = "국어";
				System.out.println(name+"님의 제일 낮은 점수의 과목은 "+min+" 입니다.");
			}else if(kor<mat) {
				min = "수학";
				System.out.println(name+"님의 제일 낮은 점수의 과목은 "+min+" 입니다.");
			}
		}else if(eng>mat){
				min = "영어";
				System.out.println(name+"님의 제일 낮은 점수의 과목은 "+min+" 입니다.");
		}
	}
	
	//평균 점수를 확인하고 등급을 매기는 메소드
	public void grade() {
		int aver;
		aver = ((kor+eng+mat)/3);
		if(aver>=90) {
			char gra = 'A';
			System.out.println(name+"님의 평균 점수는 "+aver+"점이며, 등급은 "+gra+"등급 입니다.");
		}else if(aver<90||aver>=80) {
			char gra = 'B';
			System.out.println(name+"님의 평균 점수는 "+aver+"점이며, 등급은 "+gra+"등급 입니다.");
		}else if(aver<80||aver>=70) {
			char gra = 'C';
			System.out.println(name+"님의 평균 점수는 "+aver+"점이며, 등급은 "+gra+"등급 입니다.");
		}else {
			char gra = 'D';
			System.out.println(name+"님의 평균 점수는 "+aver+"점이며, 등급은 "+gra+"등급 입니다.");
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
		 * System.out.println("등급은"+grade+"입니다.")
		 */
	}
	
	//저장된 필드 값들을 확인할 수 있는 info() 메소드
	public void info() {
		System.out.println("이름: "+name);
		System.out.println("국어 점수: "+kor);
		System.out.println("수학 점수: "+mat);
		System.out.println("영어 점수: "+eng);	
	}
}
