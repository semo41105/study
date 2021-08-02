package com.test01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetTest {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println(addr); //localhost: 내 컴퓨터, 127.0.0.1 
		
		System.out.println("localhost: "+ addr.getHostAddress());
		System.out.println("host name: "+ addr.getHostName());
		
		InetAddress[] addrs = InetAddress.getAllByName("www.naver.com");
		
		for(int i=0; i<addrs.length; i++) {
			System.out.println(addrs[i].getHostName() + " : "+addrs[i].getHostAddress());
		}
	}
}
