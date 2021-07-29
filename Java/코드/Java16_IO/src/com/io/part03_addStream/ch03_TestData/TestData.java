package com.io.part03_addStream.ch03_TestData;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestData {
	
	public void test() {
		try (	DataInputStream din = new DataInputStream(new FileInputStream("score.txt"));
				DataOutputStream dout = new DataOutputStream(new FileOutputStream("score.txt"));){
		
			//파일에 자료형별로 가득
			//자료뿐만 아니라 타입도 같이 저장된다고 보면 됨.
			dout.writeUTF("홍길동");
			dout.writeInt(95);
			dout.writeChar('A');
			
			dout.writeUTF("이순신");
			dout.writeInt(77);
			dout.writeChar('C');
			
			dout.writeUTF("JAMES");
			dout.writeInt(81);
			dout.writeChar('B');
		
			while(true) {
				System.out.println(din.readUTF()+", "+din.readInt()+", "+din.readChar());
			}
		
		} catch(EOFException e) {
			System.out.println("파일 읽기 완료");
			//파일의 끝에 가면 생기는 에러.. 잡아준다.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
