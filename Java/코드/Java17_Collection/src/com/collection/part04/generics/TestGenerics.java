package com.collection.part04.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestGenerics {
	public void test() {
		List list = new ArrayList();
		
		list.add(new String("Object Saved"));
		list.add(new Book());
		list.add(new Student());
		list.add(new Car());
		
		System.out.println("����� ��ü ��: "+list.size());
		System.out.println("list: "+list);
		
		for(int i=0; i<list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj.toString());
			
			if(obj instanceof Book) {
				((Book)obj).printBook();
			}
			if(obj instanceof Car) {
				((Car)obj).printCar();
			}
			if(obj instanceof Student) {
				((Student)obj).score();
			}
		}
	}
	
	public void test2() {
		//���׸���
		ArrayList<Book> list = new ArrayList<Book>();
		ArrayList list2 = new ArrayList();
		
//		list.add("test generics"); �ȵ���
		list.add(new Book());
		list.add(new Book());
		
		list2.add(new Book());
		list2.add(new Book());
		
		for(Book b : list) {
			b.printBook();
		}
		
		for(Object ob : list2) {
			((Book)ob).printBook();
		}
	}
	
	
	public void test3() {
		HashMap<String, Book> map = new HashMap<String, Book>();
		
		map.put("one", new Book("java"));
		map.put("two", new Book("oracle"));
		map.put("three", new Book("jdbc"));
		
		//Map.Entry�� �̿��Ͽ� Iterator�� �����ϰ� Ű ����� ���
		Set<Map.Entry<String, Book>> entry = map.entrySet();
		
		Iterator<Map.Entry<String, Book>> it = entry.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Book> ent = it.next();
			String key = ent.getKey();
			Book val = ent.getValue();
			
			System.out.println(key + ":" + val);
		}
		
		Set<String> keys = map.keySet();
		
		Iterator<String> keyIt = keys.iterator();
		while(keyIt.hasNext()) {
			String key = keyIt.next();
			Book b = map.get(key);
			System.out.println(key+"="+b);
		}
	}
}

	//�� Ŭ���� ���� �ȿ� ���� ���� Ŭ���� ����
	class Book {
		private String title;

		public Book() {
		}

		public Book(String title) {
			this.title = title;
		}

		public void printBook() {
			System.out.println("printBook() call");
		}

		@Override
		public String toString() {
			return "Book";
		}
	}

	class Student {
		public Student() {
		}

		public void score() {
			System.out.println("score() call");

		}

		@Override
		public String toString() {
			return "Student";
		}
	}

	class Car {
		public Car() {
		}

		public void printCar() {
			System.out.println("printCar() call");

		}

		@Override
		public String toString() {
			return "Car";
		}
}
