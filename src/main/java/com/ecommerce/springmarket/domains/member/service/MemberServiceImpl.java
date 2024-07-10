package com.ecommerce.springmarket.domains.member.service;

import com.ecommerce.springmarket.domains.member.domain.Member;
import com.ecommerce.springmarket.domains.member.dtos.Login;
import com.ecommerce.springmarket.domains.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
@Slf4j
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public Login save(Login login) {
        String rawPassword = login.getPwd();
        String encodedPassword = passwordEncoder.encode(rawPassword);

        login.setPwd(encodedPassword);
        Member member = login.toEntity(login);
        memberRepository.save(member);

        return member.of(member);
    }

    @Override
    public Login findByEmail(Login login) {

        try {
            Member foundMember = memberRepository.findByEmail(login.getEmail()).get();

            String tryPassword = login.getPwd();
            String foundPassword = foundMember.getPwd();

            if(matchPassword(tryPassword, foundPassword)) {
                return null;
            }

            return foundMember.of(foundMember);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
    }

    private boolean matchPassword(String tryPassword, String foundPassword) {
        return !passwordEncoder.matches(tryPassword, foundPassword);
    }

}
