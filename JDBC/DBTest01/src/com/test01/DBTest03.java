package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBTest03 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = null;
		Statement stmt = null;
		//ResultSet X
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String id = "KH";
		String pw = "KH";
		
		
		int no = 0;
		String name = null;
		String nickname = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("번호 입력: ");
		no = sc.nextInt();
		System.out.println("이름 입력: ");
		name = sc.next();
		System.out.println("별명 입력: ");
		nickname = sc.next();
		
		//insert query
		//INSERT INTO MYTEST VALUES(  ,'  ','  ')
		String sql = "INSERT INTO MYTEST VALUES("+no+", '"+name+"', '"+nickname+"')";
		System.out.println(sql);
		
		Class.forName(driver);
		con = DriverManager.getConnection(url,id,pw);
		
		stmt = con.createStatement();
		int res = stmt.executeUpdate(sql);
		
		if(res>0) {
			System.out.println("insert 성공");			
		}else {
			System.out.println("insert 실패");
		}
		
		stmt.close();
		con.close();
		
	}
}
