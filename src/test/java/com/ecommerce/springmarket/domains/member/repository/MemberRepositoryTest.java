package com.ecommerce.springmarket.domains.member.repository;

import com.ecommerce.springmarket.domains.member.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.ecommerce.springmarket.domains.member.repository
 * fileName       : MemberRepositoryTest
 * author         : Sora
 * date           : 2024-07-05
 * description    : This is for test of JPA
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-05        Sora       최초 생성
 */
@DataJpaTest
class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    void save(){
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
        Member saveMember1 = memberRepository.save(member1);

                             memberRepository.save(member2);
                             memberRepository.save(member3);

        Member findMember = memberRepository.findByEmail(member1.getEmail());
        Long    countAll   = memberRepository.count();

        // then
        assertThat(saveMember1.getEmail()).isEqualTo("test1@email.com");
        assertThat(saveMember1.getEmail()).isEqualTo(findMember.getEmail());

        assertThat(countAll).isEqualTo(3);
    }
    @Test
    void findByEmail(){
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
        Member saveMember = memberRepository.save(member1);
        Member findMember = memberRepository.findByEmail(saveMember.getEmail());

        Member findNullMember = memberRepository.findByEmail(member2.getEmail());

        //then
        assertThat(findMember.getEmail()).isEqualTo("test2@email.com");  // 찾는 email이 있을 경우
        assertThatThrownBy(()-> findNullMember.getEmail())
                .isInstanceOf(NullPointerException.class);

    }
}