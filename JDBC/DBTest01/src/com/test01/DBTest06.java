package com.test01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//import common.JDBCTemplate;
import static common.JDBCTemplate.*;
//모든 메서드를 추가하기 위해 *. 가끔 겟커넥션으로 되어있을 수 있으니 수시로 확인하기.

public class DBTest06 /* extends JDBCTemplate */ {
	public void selectAll() {
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;

		String sql = "SELECT * FROM MYTEST";

		try {
			con = getConnection();
			pstm = con.prepareStatement(sql);

			rs = pstm.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + ":" + rs.getString(2) + ":" + rs.getString(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstm);
			close(con);
		}

	}

	public void selectOne() {
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = " SELECT * FROM MYTEST WHERE MNO=? ";

		Scanner sc = new Scanner(System.in);
		System.out.println("조회할 번호: ");
		int mno = sc.nextInt();

		try {
			con = getConnection();
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, mno);

			rs = pstm.executeQuery();

			if (rs.next()) {
				System.out.println(rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstm);
			close(con);
		}

	}

	public void insert() {
		Connection con = null;
		PreparedStatement pstm = null;
		int res = 0;

		int no = 0;
		String name = null;
		String nickName = null;

		String sql = "INSERT INTO MYTEST VALUES(?, ?, ?)";

		Scanner sc = new Scanner(System.in);
		System.out.print("번호 입력: ");
		no = sc.nextInt();
		System.out.print("이름 입력: ");
		name = sc.next();
		System.out.print("별명 입력: ");
		nickName = sc.next();

		try {
			con = getConnection();
			pstm = con.prepareStatement(sql);

			pstm.setInt(1, no);
			pstm.setString(2, name);
			pstm.setString(3, nickName);

			res = pstm.executeUpdate();

			if (res > 0) {
				System.out.println("insert 성공");
				commit(con);
//				con.commit(); 이렇게 해도 되긴 하는데 템플릿으로 오버로딩해놨으니 commit(con);을 사용
				selectAll();
			} else {
				System.out.println("insert 실패");
				rollback(con); // 실행 결과에 따라 커밋과 롤백을 해줄 수 있음.
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstm);
			close(con);
		}

	}

	public void delete() {
		Connection con = null;
		PreparedStatement pstm = null;
		int res = 0;
		
		String sql = "DELETE FROM MYTEST WHERE MNO=?";
		
		int no = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 번호 입력: ");
		no = sc.nextInt();
		
		try {
			con = getConnection();
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, no);
			
			res = pstm.executeUpdate();
			if(res>0){
				System.out.println("delete 성공");
				commit(con);				
			}else {
				System.out.println("delete 실패");
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			close(pstm);
			close(con);
			
		}
	}
}
