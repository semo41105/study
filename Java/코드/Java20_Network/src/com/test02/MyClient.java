package com.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class MyClient {
	public static void main(String[] args) throws IOException {
		//소켓 생성
		DatagramSocket ds = new DatagramSocket(9999);
		System.out.println("[클라이언트]");
		
		//데이터를 받을 배열
		byte[] buff = new byte[1024];
		
		//패킷 받음
		DatagramPacket receiveP = new DatagramPacket(buff, buff.length);
		ds.receive(receiveP);
		System.out.println(new String(receiveP.getData()));
		
		//종료
		ds.close();
		ds.disconnect();
	}
}
