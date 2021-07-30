package com.collection.part03.map;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
	
	public void test() {
		HashMap hmap = new HashMap();
		
		//put()�� �̿��Ͽ� ����. �ݵ�� Ű�� ��� ������ ����.
		hmap.put("one", new Date());
		hmap.put(12, "red"); // 12 => new Integer(12) autoBoxing ó����
		hmap.put(33, 123);
		
		System.out.println("hmap: "+ hmap);
		
		//Ű�� �ߺ� ������� ����(set) : �ֱ� Ű�� ����� ���.
		hmap.put(12, "yellow");
		System.out.println("hmap: "+ hmap);
		
		//����� �ߺ����� ��(list)
		hmap.put(11, "yellow");
		hmap.put(7,"yellew");
		System.out.println("hmap: "+ hmap);
	
		System.out.println("Ű 7�� ���: "+ hmap.get(7));
		hmap.remove(7);
		System.out.println("hmap: "+ hmap);
		
		System.out.println("hmap�� ����� ��ü ��: "+hmap.size());
	}

	public void test2() {
		//Map�� ����� ��ü ���� ����ó��
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
		//Map�� ���� Ŭ������ EntrySet�� �̿�
		System.out.println("-----entrySet()-----");
		Set set = hmap.entrySet();
		
		Iterator entryIt = set.iterator();
		while(entryIt.hasNext()) {
			Map.Entry entry = (Map.Entry)entryIt.next();
			System.out.println(entry.getKey()+"="+entry.getValue());
			//1������ Ű ���� �ټ������� ������ Ű���� ����� �� �ټ���.	
		}
	}
}
