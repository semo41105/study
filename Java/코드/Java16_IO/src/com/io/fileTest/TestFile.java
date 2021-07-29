package com.io.fileTest;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) {
		//File 클래스
		File file = new File("p.txt");
		System.out.println("파일 객체 생성 완료!");
		
		System.out.println("파일명: "+ file.getName());
		System.out.println("저장경로: "+ file.getPath());
		System.out.println("저장경로: "+ file.getAbsolutePath());
		System.out.println("파일용량: "+ file.length());
		
		try {
			//false: 기존에 파일이 있는 경우, true: 새롭게 생성한 경우
		boolean b = file.createNewFile();
		System.out.println(b);
		
		b=file.delete();
		System.out.println(b);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
