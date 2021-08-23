package com.test02.model.view;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.Scanner;

import com.test02.model.dao.MyTestDao;
import com.test02.model.dto.MyTest;

public class MyTestView {
	
	static Scanner sc = new Scanner(System.in);
	
	public static int getMenu() {
		System.out.println("1. 전체출력");
		System.out.println("2. 추가");
		System.out.println("3. 수정");
		System.out.println("4. 삭제");
		System.out.println("5. 종료");
		System.out.println("========");
		
		System.out.print("번호 선택: ");
		int select = sc.nextInt();
		
		return select;
	}
	
	public static void main(String[] args) {
		int no = 0;
		
		int mno = 0;
		String name = null;
		String nickName = null;
		
		Connection con = getConnection();
		MyTestDao dao = new MyTestDao(con);
		
		do {
			no = getMenu();
			
			switch(no) {
			//전체 출력
			case 1:
				System.out.println("****전체출력****");
				System.out.println( dao.getAll() );
				break;
			//추가
			case 2:
				System.out.print("추가할 번호: ");
				mno = sc.nextInt();
				System.out.print("추가할 이름: ");
				name = sc.next();
				System.out.print("추가할 별명: ");
				nickName = sc.next();
				
				MyTest dto = new MyTest(mno, name, nickName);
				int res = dao.getInsert(dto);
				
				if(res>0) {
					System.out.println("insert 성공!");
				}else {
					System.out.println("insert 실패!");
				}
				break;		
				
			//수정	
			case 3:
				System.out.print("수정할 번호: ");
				mno = sc.nextInt();
				System.out.print("이름: ");
				name = sc.next();
				System.out.print("별명: ");
				nickName = sc.next();
				
				MyTest update = new MyTest(mno, name, nickName);
				int res_update = dao.getUpdate(update);
				
				if(res_update>0) {
					System.out.println("수정 성공!!");
				}else {
					System.out.println("수정 실패!!");
				}
				break;
				
				
			//삭제	
			case 4:
				System.out.println("삭제할 번호: ");
				int del = sc.nextInt();
				
				int del_res = dao.getDelete(del);
				
				if(del_res>0) {
					System.out.println("삭제 성공!!");
					
				}else {
					System.out.println("삭제 실패!!");
				}
				break;				
				
				
			//종료	
			case 5:
				System.out.println("종료!!");
				close(con);
				break;
			}
			
			
		}while(no != 5); //5는 프로그램을 종료시키는 숫자라고 생각하면 됨.
		
	}

}
