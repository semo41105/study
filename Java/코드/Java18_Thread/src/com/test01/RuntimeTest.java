package com.test01;

import java.io.IOException;

public class RuntimeTest {
	public static void main(String[] args) {
		//runtime object
		//운영체제 기반의 프로그램을 실행시키거나 운영체제에 대한 정보를 제공
		
		Runtime rt = Runtime.getRuntime();
		
		try {
			Process prc = rt.exec("\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\"");
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
