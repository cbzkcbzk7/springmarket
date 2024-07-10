package com.ecommerce.springmarket.domains.member.repository;

import com.ecommerce.springmarket.domains.member.domain.Member;
import com.ecommerce.springmarket.domains.member.dtos.Login;

import java.util.Optional;

/**
 * packageName    : com.ecommerce.springmarket.domains.member.repository
 * fileName       : MemberRepository
 * author         : Sora
 * date           : 2024-07-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-07        Sora       최초 생성
 */
public interface MemberRepository {

    Member save(Member member);
    Optional<Member> findByEmail(String email);

    long count();
}
