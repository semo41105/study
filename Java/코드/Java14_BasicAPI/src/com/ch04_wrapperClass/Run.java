package com.ch04_wrapperClass;

public class Run {
	//WrapperClass
	//	Boxing : 기본자료형->wrapper 클래스 객체 (AutoBoxing)
	//UnBoxing : wrapper 클래스 객체 -> 기본 자료형(AutoUnBoxing)
	public static void main(String[] args) {
		//boxing
		int no = 10;
		Integer i = new Integer(no);
		Integer i2 = new Integer(15);
		Double d = new Double(11.0);
		
		System.out.println(i.equals(i2));
		System.out.println(i.compareTo(i2)); //음수면 i2가 큰 것, 양수면 i가 큰 것, 0은 같을때

		//AutoBoxing
		Integer i3 = 10;
		Double d2 = 5.0;
		
		//Unboxing
		int pi = i.intValue();
		double pd = d.doubleValue();
		
		//AutoUnboxing
		int a = i;
		int b = i2;
		System.out.println(a+b);
		abox(20); //20은 int형. int가 Integer로 객체화가 되어야 하는데..
					//autoboxing이 일어난다는 걸 알 수 있음. 여기서 object로 변한 것에 다형성이 적용됨을 알 수 있음 

		//
		System.out.println("-------------------");
		Integer sti = new Integer("12");
		
		int sti2 = new Integer("300");//오토언박싱을 통해 sit2에 들어갈 수 있다
		
		int ii = Integer.parseInt("3");
		double dd = Double.parseDouble("0.2");
		boolean b1 = Boolean.parseBoolean("true");
		
		//1.5 버전 이후 가능. 해당하는 스트링을 밸류값으로 전환
		ii = Integer.valueOf("3");
		dd = Double.valueOf("0.2");
		
		String s1 = Integer.valueOf(3).toString();
		String c = Character.valueOf('a').toString();
		
		s1 = ii+"";
	}
	
	public static void abox(Object obj) {
		System.out.println(obj);
	}
}
