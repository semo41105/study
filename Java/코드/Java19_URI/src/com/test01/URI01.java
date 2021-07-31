package com.test01;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class URI01 {

	/* 
	 * java.net: URL, Adress, TCP,UDP
	 * 
	 *	URL: Uniform Resource Locator ��ġ(�ּ�)
	 *	Ư�� ������ �� ���ҽ��� ���� ��ü���� ��ġ�� ����
	 *  http://www.naver.com - ���̹��� url
	 *
	 *  URN: Uniform Resource Name    �̸�(���)
	 *  �������� �̷�� �� ���ҽ��� ����, ��ġ�� ������� �ʴ� ���Ϲ����� �̸� ����
	 *  urn:isbn:1231231123
	 *  ���Ϲ����ϴϱ� �����ؼ� �� ���� �ʴ´�.
	 * 
	 *  URI: Uniform Resource Identifier �ĺ���
	 *  URI = URL+URN
	 * 
	 */
	
	
	public static void main(String[] args) throws IOException {

		
		URL url = new URL("https://pbs.twimg.com/profile_images/378800000408073999/d56e5ea929ecc71ee1ef0a55f9e3ecfe_400x400.jpeg");
		
		URLConnection urlConnection = url.openConnection();
		urlConnection.connect();
		
		DataInputStream di = new DataInputStream(urlConnection.getInputStream()); //�ܺο��� �ڹٷ� �������� ����
		
		FileOutputStream fo = new FileOutputStream("a.jpg"); //�ڹٿ��� �׸����Ϸ� �������� ����
		
		byte[] b = new byte[1];
		while(di.read(b,0,1) != -1) {
			fo.write(b, 0, 1);
			
		}
		System.out.println("�Ϸ�");
		
		di.close();
		fo.close();
		
	}
}
