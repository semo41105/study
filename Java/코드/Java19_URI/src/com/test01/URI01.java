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
	 *	URL: Uniform Resource Locator 위치(주소)
	 *	특정 서버의 한 리소스에 대한 구체적인 위치를 서술
	 *  http://www.naver.com - 네이버의 url
	 *
	 *  URN: Uniform Resource Name    이름(대상)
	 *  콘텐츠를 이루는 한 리소스에 대해, 위치에 영향받지 않는 유일무이한 이름 역할
	 *  urn:isbn:1231231123
	 *  유일무이하니까 복잡해서 잘 쓰진 않는다.
	 * 
	 *  URI: Uniform Resource Identifier 식별자
	 *  URI = URL+URN
	 * 
	 */
	
	
	public static void main(String[] args) throws IOException {

		
		URL url = new URL("https://pbs.twimg.com/profile_images/378800000408073999/d56e5ea929ecc71ee1ef0a55f9e3ecfe_400x400.jpeg");
		
		URLConnection urlConnection = url.openConnection();
		urlConnection.connect();
		
		DataInputStream di = new DataInputStream(urlConnection.getInputStream()); //외부에서 자바로 가져오는 과정
		
		FileOutputStream fo = new FileOutputStream("a.jpg"); //자바에서 그림파일로 내보내는 과정
		
		byte[] b = new byte[1];
		while(di.read(b,0,1) != -1) {
			fo.write(b, 0, 1);
			
		}
		System.out.println("완료");
		
		di.close();
		fo.close();
		
	}
}
