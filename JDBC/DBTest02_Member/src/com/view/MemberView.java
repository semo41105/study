package com.view;

import java.util.List;
import java.util.Scanner;

import com.model.biz.MemberBiz;
import com.model.biz.MemberBizImpl;
import com.model.dto.Member;

public class MemberView {
	static Scanner sc = new Scanner(System.in);

	public static int getMenu() {
		System.out.println("*********");
		System.out.println("1. 전체출력");
		System.out.println("2. 선택출력");
		System.out.println("3. 추가");
		System.out.println("4. 수정");
		System.out.println("5. 삭제");
		System.out.println("6. 종료");
		System.out.println("*********");
		System.out.print("메뉴 선택: ");
		int select = sc.nextInt();
		
		return select;
	}

	public static void main(String[] args) {
		int no = 0;
		MemberBiz memberBiz = new MemberBizImpl();
		
		while(no != 6) {
			no = getMenu();
			
			switch(no) {
			case 1: //전체출력
				List<Member> res = memberBiz.selectAll();
				for(Member m : res) {
					System.out.println(m);
				}
				break;
				
			case 2: //선택출력
				System.out.println("번호 선택: ");
				int n = sc.nextInt();
				Member resOne = memberBiz.selectOne(n);
				System.out.println(resOne);
				break;	
				
			case 3: //추가	
				System.out.println("---추가할 데이터 입력---");
				System.out.print("name: ");
				String name = sc.next();
				System.out.print("age: ");
				int age = sc.nextInt();
				System.out.print("gender[M/F]: ");
				String gender = sc.next();
				System.out.print("loc: ");
				String loc = sc.next();
				System.out.print("job: ");
				String job = sc.next();
				System.out.print("tel: ");
				String tel = sc.next();
				System.out.print("email: ");
				String email = sc.next();
				
				Member insert = new Member(0,name,age,gender,loc,job,tel,email);
				//no값은 0으로 아무렇게나 적어넣었음.
				
				int resIns = memberBiz.insert(insert);
				
				if(resIns>0) {
					System.out.println("insert 성공!");
				}else {
					System.out.println("insert 실패!");
				}
				break;
				
			case 4: //수정
				System.out.println("---수정할 번호 입력---");
				System.out.print("no: ");
				int upNo = sc.nextInt();
				
				System.out.println("---수정 데이터 입력---");
				System.out.print("name: ");
				String upName = sc.next();
				System.out.print("age: ");
				int upAge = sc.nextInt();
				System.out.print("gender[M/F]: ");
				String upGender = sc.next();
				System.out.print("loc: ");
				String upLoc = sc.next();
				System.out.print("job: ");
				String upJob = sc.next();
				System.out.print("tel: ");
				String upTel = sc.next();
				System.out.print("email: ");
				String upEmail = sc.next();
				
				Member update = new Member(upNo, upName, upAge, upGender, upLoc, upJob, upTel, upEmail);
				
				int resUp = memberBiz.update(update);
				if(resUp>0) {
					System.out.println("update 성공");
				}else {
					System.out.println("update 실패");
				}
				
				break;
				
			case 5: //삭제
				System.out.println("삭제할 번호: ");
				int delNo = sc.nextInt();
				
				int resDel = memberBiz.delete(delNo);
				
				if(resDel>0) {
					System.out.println("delete 성공");
				}else {
					System.out.println("delete 실패");
				}
				break;	
				
			case 6: //종료
				
				System.out.println("프로그램 종료!");
				break;
			}
		}
	
	}

}
