package com.test02.controller;

import java.util.Scanner;

import com.test02.model.dto.Person;

public class PersonController {
	private Person[] people = new Person[2];
	Scanner sc = new Scanner(System.in);
	//회원 추가
	public void insertPerson() {
		for(int i = 0; i<people.length; i++) {
			System.out.println("== 사원 정보 입력 ==");
			System.out.println("이름: ");
			String name = sc.next();
			System.out.println("나이: ");
			int age = sc.nextInt();
			System.out.println("재산: ");
			int wealth = sc.nextInt();
			
			//name이 nextLine일때는 여기에 sc.nextLine(); 추가해서 사용 가능
			//next();는 문자열만 입력받음. 띄어쓰기 하면 공백을 인식 못해서 끝남.
			//nextLine();은 띄어쓰기 등등 한 줄 다 입력받음.
			
			people[i] = new Person(name, age, wealth);
		}
	}
	//회원 전체 조회
	public void printPerson() {
//		for(int i = 0; i<people.length; i++) {
//			System.out.println(people[i].information());
//		}
		
		//향상된 for문
		for(Person p : people) { //person 객체
			System.out.println(p.information());
		}	
	}
	
	//평균 재산 조회
	public void avg() {
		//평균 구해서 출력
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
		 * System.out.println("평균 재산: "+sum/people.length);
		 * 
		 */

	}
	//회원 이름 검색
	public void searchPerson() {
		//회원 이름으로 검색 후 회원 정보 출력
		System.out.println("회원 이름 검색: ");
		String search = sc.next();
		for(int i=0; i<people.length; i++) {
			if(people[i].getName().equals(search)) {
				System.out.println(people[i].information());
			}
		}
		
		/*System.out.printl("검색할 이름: ");
		 * String search = sc.next();
		 * 
		 * f0r*int i=0; i<people.length; i++){
		 * if(people[i].getName().equals(search){
		 * System.out.println(people[i].information());
		 * }
		 */

	}
}
