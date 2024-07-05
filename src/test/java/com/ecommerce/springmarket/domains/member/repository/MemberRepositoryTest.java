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
        Member member = Member.builder()
                .email("test@email.com")
                .pwd("1111")
                .build();

        // when
        Member saveMember = memberRepository.save(member);
        Member findMember = memberRepository.findByEmail(member.getEmail());

        // then
        assertThat(saveMember.getEmail()).isEqualTo("test@email.com");
        assertThat(saveMember.getEmail()).isEqualTo(findMember.getEmail());

    }
}