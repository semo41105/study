package silsub1.run;

import silsub1.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�⺻ �����ڸ� �̿��� ��ü ����
		Member m = new Member();
		
		
		//getter�� �� ��ȸ
				System.out.println(m.getMemberId());
				System.out.println(m.getMemberPwd());
				System.out.println(m.getMemberName());
				System.out.println(m.getAge());
				System.out.println(m.getGender());
				System.out.println(m.getPhone());
				System.out.println(m.getEmail());
	
		
		//setter�� �� ����
		m.setMemberId("user01");
		m.setMemberPwd("pass01");
		m.setMemberName("Lee Yuna");
		m.setAge(19);
		m.setGender('F');
		m.setPhone("010-1234-5678");
		m.setEmail("yuna@naver.com");
		
		//getter�� �� ��ȸ
		System.out.println(m.getMemberId());
		System.out.println(m.getMemberPwd());
		System.out.println(m.getMemberName());
		System.out.println(m.getAge());
		System.out.println(m.getGender());
		System.out.println(m.getPhone());
		System.out.println(m.getEmail());
		
		
	}

}
