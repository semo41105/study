package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DBTest05 {

	public void insert() throws ClassNotFoundException, SQLException {
		// 1.준비
		Connection con = null;
		PreparedStatement pstm = null;

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String id = "KH";
		String pw = "KH";

		// "INSERT INTO MYTEST VALUES("+no+",'"+name"','"+nickname+"')"
		String sql = "INSERT INTO MYTEST VALUES(?, ?, ?)";

		Scanner sc = new Scanner(System.in);
		System.out.println("NO: ");
		int no = sc.nextInt();
		System.out.println("NAME: ");
		String name = sc.next();
		System.out.println("NICKNAME: ");
		String nickname = sc.next();

		// 2.드라이버 등록
		Class.forName(driver);
		// 3.db연결
		con = DriverManager.getConnection(url, id, pw);
		// 4.statement 준비
		pstm = con.prepareStatement(sql);

		pstm.setInt(1, no);
		pstm.setString(2, name);
		pstm.setString(3, nickname);

		// 5.query 실행
		int res = pstm.executeUpdate();

		// 6.결과처리
		if (res > 0) {
			System.out.println("insert 성공");
		} else {
			System.out.println("insert 실패");
		}

		// 7.db종료
		pstm.close();
		con.close();
		sc.close();

	}

	public void delete() throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstm = null;

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String id = "KH";
		String pw = "KH";
		String sql = "DELETE FROM MYTEST WHERE MNO=?";

		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 번호: ");
		int no = sc.nextInt();

		Class.forName(driver);
		con = DriverManager.getConnection(url, id, pw);

		pstm = con.prepareStatement(sql);
		pstm.setInt(1, no);

		int res = pstm.executeUpdate();
		if (res > 0) {
			System.out.println("delete 성공");
		} else {
			System.out.println("delete 실패");
		}
		pstm.close();
		con.close();
		sc.close();

	}

	public void selectAll() throws ClassNotFoundException, SQLException {

		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "KH";
		String pw = "KH";
		String sql = "SELECT * FROM MYTEST";

		Class.forName(driver);
		con = DriverManager.getConnection(url, id, pw);
		pstm = con.prepareStatement(sql);

		rs = pstm.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3));
		}

		rs.close();
		pstm.close();
		con.close();

	}

	public void selectOne() throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "KH";
		String pw = "KH";
		String sql = "SELECT * FROM MYTEST WHERE MNO=?";

		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 번호: ");
		int no = sc.nextInt();

		Class.forName(driver);
		con = DriverManager.getConnection(url, id, pw);

		pstm = con.prepareStatement(sql);
		pstm.setInt(1, no);

		rs = pstm.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3));
		}
		rs.close();
		pstm.close();
		con.close();
		
	}

}
