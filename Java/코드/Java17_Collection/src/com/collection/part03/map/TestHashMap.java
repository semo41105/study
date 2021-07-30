package com.collection.part03.map;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
	
	public void test() {
		HashMap hmap = new HashMap();
		
		//put()를 이용하여 저장. 반드시 키와 밸류 쌍으로 저장.
		hmap.put("one", new Date());
		hmap.put(12, "red"); // 12 => new Integer(12) autoBoxing 처리됨
		hmap.put(33, 123);
		
		System.out.println("hmap: "+ hmap);
		
		//키는 중복 저장되지 않음(set) : 최근 키의 밸류값 덮어씀.
		hmap.put(12, "yellow");
		System.out.println("hmap: "+ hmap);
		
		//밸류는 중복저장 됨(list)
		hmap.put(11, "yellow");
		hmap.put(7,"yellew");
		System.out.println("hmap: "+ hmap);
	
		System.out.println("키 7의 밸류: "+ hmap.get(7));
		hmap.remove(7);
		System.out.println("hmap: "+ hmap);
		
		System.out.println("hmap에 저장된 객체 수: "+hmap.size());
	}

	public void test2() {
		//Map에 저장된 객체 정보 연속처리
		HashMap<String,String> hmap = new HashMap<String,String>();
		
		hmap.put("one", "java");
		hmap.put("two", "oracle 11g");
		hmap.put("three", "jdbc");
		hmap.put("four", "html5");
		hmap.put("five", "css3");
		
		//1. keySet()
		Set<String> keys = hmap.keySet();
		Iterator<String> keyIt = keys.iterator();
		
		while(keyIt.hasNext()){
			String key = keyIt.next();
			String val = hmap.get(key);
			System.out.println(key+"="+val);
		}
		
		//2.entrySet()
		//Map의 내부 클래스인 EntrySet을 이용
		System.out.println("-----entrySet()-----");
		Set set = hmap.entrySet();
		
		Iterator entryIt = set.iterator();
		while(entryIt.hasNext()) {
			Map.Entry entry = (Map.Entry)entryIt.next();
			System.out.println(entry.getKey()+"="+entry.getValue());
			//1에서는 키 값만 줄세웠지만 지금은 키값과 밸류값 다 줄세움.	
		}
	}
}
