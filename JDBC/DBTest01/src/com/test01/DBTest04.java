package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBTest04 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection con = null;
		Statement stmt = null;
		int res = 0;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "KH";
		String pw = "KH";
		
		//쿼리문 준비
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 번호: ");
		int no = sc.nextInt();
		String sql = "DELETE FROM MYTEST WHERE MNO="+no;
		System.out.println(sql);
		
		//드라이버 등록, db연결, Statement객체 준비, 쿼리 실행, 결과값 처리(성공or실패 출력)
		Class.forName(driver);
		con = DriverManager.getConnection(url,id,pw);
		stmt = con.createStatement();
		res = stmt.executeUpdate(sql);		
		
		if(res>0) {
			System.out.println("delete 성공");			
		}else {
			System.out.println("delete 실패");
		}

		//종료
		stmt.close();
		con.close();	
	}
}
