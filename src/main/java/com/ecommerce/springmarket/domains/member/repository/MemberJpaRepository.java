package com.ecommerce.springmarket.domains.member.repository;

import com.ecommerce.springmarket.domains.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * packageName    : com.ecommerce.springmarket.domains.member.repository
 * fileName       : MemberJpaRepository
 * author         : Sora
 * date           : 2024-07-05
 * description    : This is for a JPA interface of member
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-05        Sora       최초 생성
 */
public interface MemberJpaRepository extends JpaRepository<Member,Long> {

    Optional<Member> findByEmail(String email);

}
