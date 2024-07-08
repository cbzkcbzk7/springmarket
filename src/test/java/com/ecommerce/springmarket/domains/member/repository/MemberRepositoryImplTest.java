package com.ecommerce.springmarket.domains.member.repository;

import com.ecommerce.springmarket.domains.member.domain.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * packageName    : com.ecommerce.springmarket.domains.member.repository
 * fileName       : MemberRepositoryImplTest
 * author         : Sora
 * date           : 2024-07-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-07        Sora       최초 생성
 */
@DataJpaTest
class MemberRepositoryImplTest {

    @Autowired
    private MemberJpaRepository memberJpaRepository;

    @Test
    void save() {
        // given
        Member member1 = Member.builder()
                .email("test1@email.com")
                .pwd("1111")
                .build();

        Member member2 = Member.builder()
                .email("test2@email.com")
                .pwd("2222")
                .build();

        Member member3 = Member.builder()
                .email("test3@email.com")
                .pwd("333")
                .build();

        // when
        Member saveMember1 = memberJpaRepository.save(member1);

        memberJpaRepository.save(member2);
        memberJpaRepository.save(member3);

        Member findMember = memberJpaRepository.findByEmail(member1.getEmail()).get();
        Long countAll = memberJpaRepository.count();


        // then
        assertThat(saveMember1.getEmail()).isEqualTo("test1@email.com");
        assertThat(saveMember1.getEmail()).isEqualTo(findMember.getEmail());

        assertThat(countAll).isEqualTo(3);
    }

    @Test
    void findByEmail() {
        //given
        Member member1 = Member.builder()
                .email("test2@email.com")
                .pwd("2222")
                .build();


        Member member2 = Member.builder()
                .email("test3@email.com")
                .pwd("3333")
                .build();


        //when
        Member saveMember = memberJpaRepository.save(member1);
        Member findMember = memberJpaRepository.findByEmail(saveMember.getEmail()).get();



        //then
        assertThat(findMember.getEmail()).isEqualTo("test2@email.com");  // 찾는 email이 있을 경우

    }

}