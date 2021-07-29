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
		
			//���Ͽ� �ڷ������� ����
			//�ڷ�Ӹ� �ƴ϶� Ÿ�Ե� ���� ����ȴٰ� ���� ��.
			dout.writeUTF("ȫ�浿");
			dout.writeInt(95);
			dout.writeChar('A');
			
			dout.writeUTF("�̼���");
			dout.writeInt(77);
			dout.writeChar('C');
			
			dout.writeUTF("JAMES");
			dout.writeInt(81);
			dout.writeChar('B');
		
			while(true) {
				System.out.println(din.readUTF()+", "+din.readInt()+", "+din.readChar());
			}
		
		} catch(EOFException e) {
			System.out.println("���� �б� �Ϸ�");
			//������ ���� ���� ����� ����.. ����ش�.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
