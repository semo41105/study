package com.ch03_stringTokenizer;

import java.util.StringTokenizer;

public class Run {

	public static void main(String[] args) {
		String str = "홍길동,19,부산시 해운대구,남";
		
		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		//한 번 하면 해스모어토큰으로 커서의 위치가 맨 뒤로 갔으므로 더 토큰이 없다고 판단, 2번째 와일문을 실행하지 못함.

		//스플릿은 메서드. 토크나이저는 클래스. 특수한 토큰이라는 존재로 있음.
	}
}
