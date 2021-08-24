package com.model.biz;

import java.sql.Connection;
import java.util.List;

import com.model.dao.MemberDao;
import com.model.dao.MemberDaoImpl;
import com.model.dto.Member;

import static common.JDBCTemplate.*;

public class MemberBizImpl implements MemberBiz {
	MemberDao dao = new MemberDaoImpl();

	@Override
	public List<Member> selectAll() {
		Connection con = getConnection();
		List<Member> res = dao.selectAll(con);
		close(con);
		return res;
	}

	@Override
	public Member selectOne(int no) {
		Connection con = getConnection();
		Member m = dao.selectOne(con, no);
		close(con);
		return m;
	}

	@Override
	public int insert(Member m) {
		Connection con = getConnection();
		Member tmp = m;
		tmp.setM_gender(tmp.getM_gender().toUpperCase());

		int res = dao.insert(con, tmp);
		if (res > 0) {
			commit(con);
		} else {
			rollback(con);
		}

		close(con);
		return res;
	}

	@Override
	public int delete(int no) {
		Connection con = getConnection();
		int res = dao.delete(con, no);
		
		if(res>0) {
			commit(con);
		}
		close(con);
		return res;
	}

	@Override
	public int update(Member m) {
		Connection con = getConnection();

		int res = dao.update(con, m);
		if (res > 0) {
			commit(con);
		}
		close(con);
		return res;
	}

}
