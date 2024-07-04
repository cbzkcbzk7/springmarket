package com.ecommerce.springmarket.domains.member.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

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

}