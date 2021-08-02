package com.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class MyServer {

	// 서버 생성 UDP
	public static void main(String[] args) throws IOException {

		//소켓 생성
		DatagramSocket ds = new DatagramSocket(); //9999는 포트
		System.out.println("[서버]");
		
		//보낼 data
		byte[] buff = "연습입니다.".getBytes();//바이트 배열로 바꿔서 담아 줌.
		
		//datagramPacket 생성
		DatagramPacket sendP = new DatagramPacket(buff, buff.length, InetAddress.getByName("localhost"),9999);
		
		//전송
		ds.send(sendP);
		System.out.println("전송완료");
		
		//종료
		ds.close();
		ds.disconnect();
	}
}
