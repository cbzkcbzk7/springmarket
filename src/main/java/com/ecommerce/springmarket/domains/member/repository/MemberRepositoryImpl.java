package com.ecommerce.springmarket.domains.member.repository;

import com.ecommerce.springmarket.domains.member.domain.Member;
import com.ecommerce.springmarket.domains.member.dtos.Login;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * packageName    : com.ecommerce.springmarket.domains.member.repository
 * fileName       : MemberRepositoryImpl
 * author         : Sora
 * date           : 2024-07-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-07        Sora       최초 생성
 */
@Transactional
@RequiredArgsConstructor
@Repository
public class MemberRepositoryImpl implements MemberRepository{

    private final MemberJpaRepository memberJpaRepository;

    @Override
    public Member save(Member member) {
        return memberJpaRepository.save(member);
    }

    @Override
    public Optional<Member> findByEmail(String email) {
       return memberJpaRepository.findByEmail(email);
    }

    @Override
    public long count() {
        return memberJpaRepository.count();
    }
}
