package hellojpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hellojpa.entiity.Member;
import hellojpa.entiity.Team;

public class Main {
	
	public static void main(String[] args) {
		EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("hello");
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		try {
			
			Team team = new Team();
			team.setName("teamA");
			em.persist(team);
			
			//등록
			Member member = new Member();
			member.setName("hello");
//			member.setTeam(team);
			em.persist(member);
			team.getMembers().add(member);
			
			//
			em.flush();
			em.clear();
			
			//조회
//			Member findMember = em.find(Member.class, member.getId());
			
			//참조를 사용해서 연관관계 조회
			//Team findTeam = findMember.getTeam();
			
			//findTeam.getName();
			
			//List<Member> members = findTeam.getMembers();
			//for (Member member1 : members) {
			//	System.out.println("member1= "+ member1);
			//}
			//조회
//			Team findTeam = em.find(Team.class, team.getId());
			
			//역방향 조회
//			int memberSize = findTeam.getMembers().size();
//			System.out.println(memberSize );
			//저장
//			em.persist(member);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}finally {
			em.close();
		}
		System.out.println("hello");
		emf.close();
	}
}
