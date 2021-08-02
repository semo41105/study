/*package com.test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
	public static void main(String[] args) {
		//서버 생성
		ServerSocket serverSocket = null;
		
		//접속된 클라이언트 소켓
		Socket serviceSocket = null;
		
		//출력객체
		PrintWriter out = null;
		
		//클라이언트로부터 읽어들인 내용을 담을 객체
		BufferedReader in = null;
		
		try {
			serverSocket = new ServerSocket(8888);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			System.out.println("[서버]");
			System.out.println("client를 기다립니다.");
			
			try {
				serviceSocket = serverSocket.accept();
				System.out.println("client가 접속했습니다...");
				
				//1. client에게 받은 내용을 라인 단위로 읽자.
				in = new BufferedReader(new InputStreamReader(serviceSocket.getInputStream()));
				
				//2. client에게 받은 내용을 보내주자.
				out = new PrintWriter(serviceSocket.getOutputStream(), true);
				//true는 자동으로 flush를 할 수 있게 하는 값임.(오토플러시 여부)
				
				String inputLine;
				while((inputLine = in.readLine()) != null) {
					System.out.println("클라이언트가 보낸 메시지: "+inputLine);
					out.println(inputLine+" (다시 받음)");
				}
				
				out.close();
				in.close();
				serviceSocket.close();
				serverSocket.close();	
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
*/
package com.test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
   public static void main(String[] args) {
      //서버 생성
      ServerSocket serverSocket = null;
      //접속된 클라이언트 소켓
      Socket serviceSocket = null;
      //출력객체
      PrintWriter out = null;
      //클라이언트로부터 읽어들인 내용을 담을 객체
      BufferedReader in = null;
      
      try {
         serverSocket = new ServerSocket(8888);
      } catch (IOException e) {
         e.printStackTrace();
      }
      
      while(true) {
         System.out.println("[서버]");
         System.out.println("client를 기다립니다.");
         
         try {
            serviceSocket = serverSocket.accept();
            System.out.println("client가 접속했습니다...");
            
            //1. client에게 받은 내용을 라인단위로 읽자.
            in = new BufferedReader(new InputStreamReader(serviceSocket.getInputStream()));
            
            //2. client에게 받은 내용을 보내주자.
            out = new PrintWriter(serviceSocket.getOutputStream(), true);
            
            String inputLine;
            while((inputLine = in.readLine())!=null) {
               System.out.println("클라이언트가 보낸 메시지 : "+inputLine);
               out.println(inputLine+" (다시받음)");
            }
         
            out.close();
            in.close();
            serviceSocket.close();
            serverSocket.close();
               
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
      //try catch문이 많이 거슬린다면 throws로 처리
   }
}
