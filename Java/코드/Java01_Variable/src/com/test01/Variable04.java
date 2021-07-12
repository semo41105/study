package com.test01;

public class Variable04 {

	public static void main(String[] args) {

		//클래스명 변수명 = new 클래스명();
		Variable04 test = new Variable04();
		
		//변수명.메소드명();
		//test.printVarSize();
		
		test.testOverflow();	
	}
	
	//변수의 사이즈 출력
	public void printVarSize() {

		System.out.println("byte: " + Byte.BYTES + "byte");
		System.out.println("short: " + Short.BYTES + "byte");
		System.out.println("int: " + Integer.BYTES + "byte");
		System.out.println("long: " + Long.BYTES + "byte");
		
		System.out.println("float: " + Float.BYTES + "byte");
		System.out.println("double: " + Double.BYTES + "byte");
		
		System.out.println("char: " + Character.BYTES + "byte");
	}
	
	public void testOverflow() {
		//byte bnum = 128;
		
		byte bnum = 127;
		bnum = (byte)(bnum+1); //byte + int =-=> int
		//최대값 127 - -> 최소값 -128

		System.out.println("bnum: " + bnum);	
	}	
}
