package com.my.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.my.dto.MyBoardDto;

public class MyBoardDao extends SqlMapConfig{
	private String namespace = "com.my.myboard.";
	
	//전체출력
	public List<MyBoardDto> selectAll(){
		List<MyBoardDto> res = new ArrayList<MyBoardDto>();
		
		SqlSession session = null;
		
		//오토커밋을 설정한 것이다.
		session = getSqlSessionFactory().openSession(true);
		
		//res = session.selectList("com.my.myboard.selectAll");
		//중복되는 부분이 많으니 필드에 지정해둔 namespace 사용하여 편하게 입력
		res = session.selectList( namespace +"selectAll" );
		
		session.close();
		
		return res;
	}
	
	//선택출력
	public MyBoardDto selectOne(int myno) {
		SqlSession session = null;
		MyBoardDto res = null;
		
		try {
			//혹시 모를 예외를 대비한 try catch
			session = getSqlSessionFactory().openSession(true);
			res = session.selectOne( namespace + "selectOne", myno );
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}

		return res;
	}
	
	//추가
	public int insert(MyBoardDto dto) {
		
		SqlSession session = null;
		int res = 0;
		
		try {
			session = getSqlSessionFactory().openSession(true);
			
			res = session.insert( namespace + "myinsert", dto);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		return res;
	}
	
	//수정
	public int update(MyBoardDto dto) {
		
		SqlSession session = null;
		int res = 0;
		
		try {
			session = getSqlSessionFactory().openSession(true);
			
			res = session.update( namespace + "myupdate", dto);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		return res;
	}
	
	//삭제
	public int delete(int myno) {
		
		SqlSession session = null;
		int res = 0;
		
		try {
			session = getSqlSessionFactory().openSession(true);
			
			res = session.delete( namespace + "mydelete", myno);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		return res;
	}
	
	
	
	
	
	
}
