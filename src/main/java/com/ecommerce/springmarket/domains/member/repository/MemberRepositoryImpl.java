package com.ecommerce.springmarket.domains.member.repository;

import com.ecommerce.springmarket.domains.member.domain.Member;
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

    private final MemberJpaRepository repository;

    @Override
    public Member save(Member member) {
        return repository.save(member);
    }

    @Override
    public Optional<Member> findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public long count() {
        return repository.count();
    }
}
