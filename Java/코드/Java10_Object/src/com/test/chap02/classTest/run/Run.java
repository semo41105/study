package com.test.chap02.classTest.run;

import com.test.chap02.classTest.model.PublicClass;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DefaultClass dc = new DefaultClass();
		//default 클래스는 패키지 외부에서는 접근 불가능
		
		PublicClass pc = new PublicClass();
		pc.test();
		
	}

}
