package com.ecommerce.springmarket.domains.member.repository;

import com.ecommerce.springmarket.domains.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName    : com.ecommerce.springmarket.domains.member.repository
 * fileName       : MemberRepository
 * author         : Sora
 * date           : 2024-07-05
 * description    : This is for a JPA repository of member
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-05        Sora       최초 생성
 */
@Repository
public interface MemberRepository extends JpaRepository<Member,Long> {

    Member save(Member member);
    Member findByEmail(String email);
    long count();


}
