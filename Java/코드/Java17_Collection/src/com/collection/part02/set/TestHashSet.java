package com.collection.part02.set;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {		
	public void test() {
		HashSet hset = new HashSet();
		
		hset.add(new String("java"));
		hset.add(new Integer(123));
		hset.add(new Double(56.78));
		hset.add(new Date());
		
		System.out.println("hast: "+hset);
		
		hset.add(new String("java"));
		hset.add(new Integer(123));
		System.out.println("hast: "+hset);//중복 허용되지 않음.
		System.out.println("저장된 객체 수: "+hset.size());
		
		//1.
		Object[] arr = hset.toArray();//hset만큼 배열을 생성함.
		for(int i=0;i<arr.length; i++) {
			System.out.println(i+" : "+arr[i]);
		}
		
		//2.
		Iterator iter = hset.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
			
		//일회용이기 때문에 더이상 출력되지 않는다.	
			while(iter.hasNext()) {
				System.out.println(iter.next());	
		}
		hset.clear();
		System.out.println("empty: "+ hset.isEmpty());
	}
}

	public void test2() {
		Set set = new HashSet();
		
		set.add(new Score("홍길동",99));
		set.add(new Score("이순신",78));
		set.add(new Score("강감찬",82));
		set.add(new Score("김가나",64));
		System.out.println("set: "+set);
		
		set.add(new Score("김다라",78));
		set.add(new Score("김마바",82));	
		System.out.println("set: "+set);
	}
}
