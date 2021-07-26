package com.ch03_stringTokenizer;

import java.util.StringTokenizer;

public class Run {

	public static void main(String[] args) {
		String str = "ȫ�浿,19,�λ�� �ؿ�뱸,��";
		
		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		//�� �� �ϸ� �ؽ������ū���� Ŀ���� ��ġ�� �� �ڷ� �����Ƿ� �� ��ū�� ���ٰ� �Ǵ�, 2��° ���Ϲ��� �������� ����.

		//���ø��� �޼���. ��ũ�������� Ŭ����. Ư���� ��ū�̶�� ����� ����.
	}
}
