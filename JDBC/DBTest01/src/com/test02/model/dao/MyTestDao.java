package com.test02.model.dao;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.test02.model.dto.MyTest;

//CRUD작업
public class MyTestDao {
	private Connection con;

	public MyTestDao() {
	}

	public MyTestDao(Connection con) {
		this.con = con;
	}

	// select
	public List<MyTest> getAll() {
		Statement stmt = null;
		ResultSet rs = null;

		String sql = " SELECT * FROM MYTEST ";
		List<MyTest> list = new ArrayList<MyTest>();

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				MyTest tmp = new MyTest(rs.getInt(1), rs.getString(2), rs.getString(3));

				list.add(tmp);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(stmt);
		}

		return list;
	}
	
	public int getInsert(MyTest dto) {
		PreparedStatement pstm = null;
		String sql = " INSERT INTO MYTEST VALUES(?,?,?) ";
		int res = 0;
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, dto.getMno());
			pstm.setString(2, dto.getNickname());
			pstm.setString(3, dto.getNickname());
			
			res = pstm.executeUpdate();
			
			if(res>0) {
				commit(con);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstm);
		}
		
		return res;
	}
	
	public int getUpdate(MyTest update) {
		PreparedStatement pstm = null;
		String sql = " UPDATE MYTEST SET MNAME=?, NICKNAME=? WHERE MNO=? ";
		int res = 0;
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, update.getMname());
			pstm.setString(2, update.getNickname());
			pstm.setInt(3, update.getMno());
		
			res = pstm.executeUpdate();
			if(res>0) {
				commit(con);
			}
		
		} catch (SQLException e) {
			System.out.println("[error] update 에러");
			e.printStackTrace();
		}finally {
			close(pstm);
		}
			
		
		return res;
	}
	
	public int getDelete(int del) {
		PreparedStatement pstm = null;
		String sql = " DELETE FROM MYTEST WHERE MNO=? ";
		int res = 0;
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, del);
			
			res = pstm.executeUpdate();
			if(res>0) {
				commit(con);
			}
		} catch (SQLException e) {
			System.out.println("[error] delete 에러");
			e.printStackTrace();
		}finally {
			close(pstm);
		}
		return res;
		
	}

}
