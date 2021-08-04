package com.io.fileTest;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) {
		//File Ŭ����
		File file = new File("p.txt");
		System.out.println("���� ��ü ���� �Ϸ�!");
		
		System.out.println("���ϸ�: "+ file.getName());
		System.out.println("������: "+ file.getPath());
		System.out.println("������: "+ file.getAbsolutePath());
		System.out.println("���Ͽ뷮: "+ file.length());
		try {
			//false: ������ ������ �ִ� ���, true: ���Ӱ� ������ ���
		boolean b = file.createNewFile();
		System.out.println(b);
		
		b=file.delete();
		System.out.println(b);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
