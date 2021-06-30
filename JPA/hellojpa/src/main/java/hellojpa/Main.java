package hellojpa;

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
			member.setTeamId(team.getId());
			em.persist(member);
			
			//조회
			Member findMember = em.find(Member.class, member.getId());
			Long teamId = findMember.getTeamId();
			
			//연관관계가 없음
			Team findTeam = em.find(Team.class, teamId);
			
			//저장
			em.persist(member);
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
