package com.test02.model.dto;

public class Person {
	
	private String name;
	private int age;
	private int wealth;
	
	//생성자(기본생성자, 매개변수생성자)
	public Person() {}
	public Person(String name, int age, int wealth) {
		this.name = name;
		this.age = age;
		this.wealth = wealth;
	}
	
	//getter&setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWealth() {
		return wealth;
	}
	public void setWealth(int wealth) {
		this.wealth = wealth;
	}

	//information
	public String information() {
		return "이름: "+name+", 나이: "+age+", 재산: "+wealth;
	}
}
