package com.collection.part01.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ArrayListTest {
	public void test() {
		ArrayList alist = new ArrayList();

		// 다형성
		List list = new ArrayList();
		Collection clist = new ArrayList();

		// 저장 arrayList는 객체만 저장 가능, index적용(순서유지)

		// alist에 "apple"추가
		alist.add("apple");
		alist.add(123);
		alist.add(45.67);
		alist.add(new Date());

		System.out.println("alist: " + alist);
		// alist.toString()이 내부적으로 오버라이드 되어서 출력되는 것임. 그래서 []가 자동으로 씌워지고..
		// System.out.println("alist: "+ alist.toString());

		// 인덱스가 지정되어 있기에 for문으로 접근 가능
		for (int i = 0; i < alist.size(); i++) {
			System.out.println(i + " : " + alist.get(i));
		}

		// 중복허용
		alist.add("apple");
		System.out.println("alist: " + alist);

		// 원하는 인덱스에 객체 추가, 중간에 추가하는 경우 하나씩 뒤로 밀리게 된다.
		alist.add(1, "banana");
		System.out.println("alist: " + alist);

		// 삭제
		alist.remove(2);
		System.out.println("alist: " + alist);

		// 수정
		alist.set(1, new Boolean(true));
		System.out.println("alist: " + alist);

		/////////////
		ArrayList alist2 = new ArrayList();
		alist2.add("apple");
		alist2.add("orange");
		alist2.add("mango");
		alist2.add("banana");

		System.out.println("alist2: " + alist2);

		Collections.sort(alist2);
		System.out.println("alist2: " + alist2);
	}
}
