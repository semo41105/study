package com.io.part01_byteStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class TestByteStream {
	public void fileSave() {
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("sample.txt");
			//	   new 기반(외부자원);
			//			외부자원: 외부에 저장해둘 곳
			fout.write(97);
			byte[] bar = {98,99,100,101,102,10};
			fout.write(bar);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void fileOpen() {
		//파일로부터 byte단위로 데이터를 읽어올 수 있는 스트림
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("sample.txt");
/*
			//sample.txt 파일의 크기
			int size = (int)new File("sample.txt").length();
			//sample.txt.크기만큼 배열 생성
			byte[] bar = new byte[size];
				fin.read(bar);
				for(int i=0; i<bar.length; i++) {
					System.out.print(bar[i]+" ");
					System.out.print((char)bar[i]+" ");
				}
*/		
			int  val;
			while( (val=fin.read()) != -1 ){
				System.out.print((char)val + " ");
			}
			//아무것도 없으면 -1을 가져오기 때문에 조건문을 저렇게 작성한 것.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
