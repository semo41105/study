package com.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.dto.Member;

import static common.JDBCTemplate.*;

public class MemberDaoImpl implements MemberDao {

	@Override
	public List<Member> selectAll(Connection con) {
		Statement stmt = null;
		ResultSet rs = null;
		List<Member> res = new ArrayList<Member>();

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(selectAll);

			while (rs.next()) {
				Member tmp = new Member();
				tmp.setM_no(rs.getInt(1));
				tmp.setM_name(rs.getString("M_NAME"));
				tmp.setM_age(rs.getInt(3));
				tmp.setM_gender(rs.getString("M_GENDER"));
				tmp.setM_location(rs.getString(5));
				tmp.setM_job(rs.getString(6));
				tmp.setM_tel(rs.getString(7));
				tmp.setM_email(rs.getString(8));

				res.add(tmp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(stmt);
		}
		return res;
	}

	@Override
	public Member selectOne(Connection con, int no) {
		PreparedStatement pstm = null;
		ResultSet rs = null;
		Member res = null;

		try {
			pstm = con.prepareStatement(selectOne);
			pstm.setInt(1, no);

			rs = pstm.executeQuery();

			if (rs.next()) {
				res = new Member();
				res.setM_no(rs.getInt(1));
				res.setM_name(rs.getString(2));
				res.setM_age(rs.getInt(3));
				res.setM_gender(rs.getString(4));
				res.setM_location(rs.getString(5));
				res.setM_job(rs.getString(6));
				res.setM_tel(rs.getString(7));
				res.setM_email(rs.getString(8));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstm);
		}
		return res;
	}

	@Override
	public int insert(Connection con, Member m) {
		//준비
		PreparedStatement pstm = null;
		int res = 0;
				
		//쿼리실행
		try {
			pstm = con.prepareStatement(insert);
			pstm.setString(1, m.getM_name());
			pstm.setInt(2, m.getM_age());
			pstm.setString(3, m.getM_gender());
			pstm.setString(4, m.getM_location());
			pstm.setString(5, m.getM_job());
			pstm.setString(6, m.getM_tel());
			pstm.setString(7, m.getM_email());
			
			res = pstm.executeUpdate();
			

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstm);
		}
		//결과처리
		return res;
	}

	@Override
	public int delete(Connection con, int no) {
		PreparedStatement pstm = null;
		int res = 0;
		
		try {
			pstm = con.prepareStatement(delete);
			pstm.setInt(1, no);
			
			res = pstm.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstm);
		}
		
		return res;
	}

	@Override
	public int update(Connection con, Member m) {
		PreparedStatement pstm = null;
		int res = 0;
		
//		" UPDATE TB_MEMBER SET M_NAME=?, M_AGE=?, M_GENDER=?, M_LOCATION=?, M_JOB=?, M_TEL=?, M_EMAIL=? "
//		+ " WHERE M_NO=? ";

		try {
			pstm = con.prepareStatement(update);
			pstm.setString(1, m.getM_name());
			pstm.setInt(2, m.getM_age());
			pstm.setString(3, m.getM_gender());
			pstm.setString(4, m.getM_location());
			pstm.setString(5, m.getM_job());
			pstm.setString(6, m.getM_tel());
			pstm.setString(7, m.getM_email());
			pstm.setInt(8, m.getM_no());
			
			res = pstm.executeUpdate();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstm);
		}
		
		return res;
	}

}
