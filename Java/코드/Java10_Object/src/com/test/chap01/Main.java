package com.test.chap01;

public class Main {

	public static void main(String[] args) {
		//객체 생성
		Account a = new Account();
		Account b = new Account();
		
		//잔액조회
		a.display();
		
		//100만원 입금
		a.in(1000000);
		a.display();
		
		//추가로 150만원 입금
		a.in(1500000);;
		a.display();
		
		//용돈이 필요해서 50만원 인출
		a.out(500000);
		a.display();
		
		//a.balance -= 2000000;
		//a.display();
	}
}
