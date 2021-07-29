package com.io.part03_addStream.ch04_object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestObject {
	public void fileSave() {
//		 Member(String userId, String userPwd, String userName, int age) 
		Member[] mar = {
				new Member("user01","pass01","홍길동",20),
				new Member("user02","pass02","이순신",21),
				new Member("user03","pass03","논개",22)
		};
		
		ObjectOutputStream objOut = null;	
	
			try {
				objOut = new ObjectOutputStream(new FileOutputStream("member.txt"));
				
				for(int i=0; i<mar.length; i++) {
					objOut.writeObject(mar[i]);
				}								
				objOut.flush();
				
			} catch(FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}	
	}
	
	public void fileOpen() {
		Member[] mar = new Member[3];
		
		try {
			ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("member.txt"));
		
		for(int i=0; i<mar.length; i++) {
			mar[i] = (Member)objIn.readObject();
		}
		
		for(Member m : mar) {
			System.out.println(m);
		}
		//향상된 for문. 방의 처음부터 끝까지 훑으면서 m에 담아서 {}안의 내용을 실행. 		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
