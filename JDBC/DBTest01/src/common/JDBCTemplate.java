package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTemplate {
		
	//1.연결
	public static Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("[Error] 드라이버 등록 실패");
			e.printStackTrace();
		}
				
		Connection con = null;
		
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","KH","KH");
			con.setAutoCommit(false);
		} catch (SQLException e) {
			System.out.println("[Error] 오라클 연결 실패");
			e.printStackTrace();
		}
	
		return con;
		
	}
	
	//2.해제
	public static void close(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Statement stmt) {
		try {
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//3.저장
	public static void commit(Connection con) {
		try {
			con.commit();
		} catch (SQLException e) {
			System.out.println("[Error] commit 에러");
			e.printStackTrace();
		}
		
	}

	
	//4.취소
	public static void rollback(Connection con) {
		try {
			con.rollback();
		} catch (SQLException e) {
			System.out.println("[Error] rollback 에러");
			e.printStackTrace();
		}
	}
	
}
