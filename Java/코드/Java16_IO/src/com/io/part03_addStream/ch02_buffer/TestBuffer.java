package com.io.part03_addStream.ch02_buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBuffer {
	public void input() {
		BufferedReader br = null;	
		
		try {
			//fr = new FileReader("sample2.txt");
			//br = new BufferedReader(fr);
			
			br = new BufferedReader(new FileReader("sample2.txt"));
			// new 보조스트림(new 스트림[보조, 기반 아무거나 들어갈 수 있음. 다만 보조스르림일 경우 또 괄호 new 필요](외부자원));
			// 보조스트림 괄호 안에는 다른 스트림이 들어간다. 기반스트림 괄호 안에는 외부자원이 들어간다.
			
			String tmp;
			while((tmp=br.readLine()) != null) {
				//더 이상 읽어올 값이 없을 때에 null이 뜸.
				//read는 바이트나 문자 단위로 하나하나 읽어왔다는 것에 차이가 있음.
				//줄 단위임.
				System.out.println(tmp);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}

	public void output() {
		//bufferedWriter를 이용하여 스트림을 생성한 후
		//"안녕하세요"
		//"반갑습니다"
		//라고 sample2.txt에 출력해보자.
	/*	BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("sample2.txt"));
			String tmp;
			String tmp1 = "안녕하세요";
			String tmp2 = "반갑습니다";
			bw.write(tmp1);
			bw.write("\n"+tmp2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	*/	
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("sample2.txt"));) {
			bw.write("안녕하세요\n");
			bw.write("반갑습니다");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
