package com.ecommerce.springmarket.domains.member.service;

import com.ecommerce.springmarket.domains.member.dtos.Login;
import com.ecommerce.springmarket.domains.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * packageName    : com.ecommerce.springmarket.domains.member.service
 * fileName       : MemberServiceImpl
 * author         : Sora
 * date           : 2024-07-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-08        Sora       최초 생성
 */

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;
    @Override
    public Login save(Login login) {
        return null;
    }

    @Override
    public Login findByEmail(String email) {
        return null;
    }
}
