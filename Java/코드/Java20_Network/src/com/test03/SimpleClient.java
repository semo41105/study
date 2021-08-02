/*package com.test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SimpleClient {
	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket clientSocket = null;
		// 서버로 데이터를 전송할 스트림
		PrintWriter out = null;
		// 서버에서 데이터를 받을 스트림
		BufferedReader in = null;

		// 키보드로 입력받을 스트림
		BufferedReader stdIn = null;
		System.out.println();
		System.out.println("server에 접속합니다...");
		clientSocket = new Socket("localhost", 8888);

		// 서버로 데이터 전송할 스트림
		out = new PrintWriter(clientSocket.getOutputStream(), true);

		// 서버에서 데이터 읽어올 스트림
		in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

		// 콘솔이랑 연결된 스트림
		stdIn = new BufferedReader(new InputStreamReader(System.in));

		// -------------------
		String inputLine;
		while ((inputLine = stdIn.readLine()) != null) {
			out.println(inputLine); // 서버로 전송
			System.out.println("Server로부터: " + in.readLine());
		}

		stdIn.close();
		in.close();
		out.close();
		clientSocket.close();

	}
}
*/
package com.test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SimpleClient {
   public static void main(String[] args) throws UnknownHostException, IOException {
      
      Socket clientSocket = null;
      //서버로 데이터를 전송할 스트림
      PrintWriter out = null;
      //서버에서 데이터를 받을 스트림
      BufferedReader in = null;
      
      //키보드로 입력 받을 스트림
      BufferedReader stdIn = null;
      System.out.println("[클라이언트]");
      System.out.println("server에 접속합니다...");
      clientSocket = new Socket("localhost",8888);
      
      out = new PrintWriter(clientSocket.getOutputStream(), true);
      
      in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
      
      stdIn = new BufferedReader(new InputStreamReader(System.in));
      
      //---------------------
      String inputLine;
      while( (inputLine = stdIn.readLine()) != null ) {
         out.println(inputLine);  //서버로 전송
         System.out.println("Server로 부터: " + in.readLine());
      }
      
      stdIn.close();
      in.close();
      out.close();
      clientSocket.close();
   }
}
