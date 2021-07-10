package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    //각각 하나하나 끝날 때마다 호출되는 메서드
    @AfterEach
    public void afterEach(){
        repository.cleatStore();
        //테스트가 끝날 때마다 한번씩 저장소를 비워준다. 테스트는 서로 의존 관계 없이 설계되어야 하기 때문이다.
    }


    @Test
    public void save(){
        Member member = new Member();
        member.setName("spring");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();
        //System.out.println("result = " + (result == member));
        //확인은 가능하지만 늘상 출력할 수 없다.

        //junit.jupiter
        //Assertions.assertEquals(member, result);

        //assertj.core 좀 더 편하게 쓸 수 있게 해줌.
        assertThat(member).isEqualTo(result);

    }

    @Test
    public void findByName(){
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);
        
        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        Member result = repository.findByName("spring1").get();

        assertThat(result).isEqualTo(member1);
    }

    @Test
    public void findAll(){
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring1");
        repository.save(member2);

        List<Member> result = repository.findAll();

        assertThat(result.size()).isEqualTo(2);


    }
}
