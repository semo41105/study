package com.poly.test04;

public class MTest {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.bark();
		cat.eat("��ġ");
		
		Dog dog = new Dog();
		dog.bark();
		dog.bite();
		dog.eat("����");
		
		Eagle eagle = new Eagle();
		eagle.fly();
		eagle.bark();
		eagle.eat("���");
	}
}
