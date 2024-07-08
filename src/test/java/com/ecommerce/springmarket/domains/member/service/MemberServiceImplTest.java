package com.ecommerce.springmarket.domains.member.service;

import com.ecommerce.springmarket.domains.member.domain.Member;
import com.ecommerce.springmarket.domains.member.dtos.Login;
import com.ecommerce.springmarket.domains.member.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.ecommerce.springmarket.domains.member.service
 * fileName       : MemberServiceImplTest
 * author         : Sora
 * date           : 2024-07-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-08        Sora       최초 생성
 */
@Slf4j
@SpringBootTest
@Transactional
class MemberServiceImplTest {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Test
    void encodePwd(){
        String rawPassword1 = "12345";
        String encodedPassword1 = passwordEncoder.encode(rawPassword1);

        log.info("encodedPassword1 = {}", encodedPassword1);

        String rawPassword2 = "1111";
        String encodedPassword2 = passwordEncoder.encode(rawPassword2);
        log.info("encodedPassword2 = {}", encodedPassword2);

        String rawPassword3 = "12345";

        assertThat(passwordEncoder.matches(rawPassword1,encodedPassword1)).isTrue();
        assertThat(passwordEncoder.matches(rawPassword2,encodedPassword2)).isTrue();
        assertThat(passwordEncoder.matches("1111",encodedPassword2)).isTrue();
        assertThat(passwordEncoder.matches(rawPassword3,encodedPassword1)).isTrue();

        assertThat(passwordEncoder.matches(rawPassword2,encodedPassword1)).isFalse();

        assertThatThrownBy(()-> passwordEncoder.matches(null, passwordEncoder.encode("3333")))
                            .isInstanceOf(IllegalArgumentException.class);


    }

    @Test
    void save(){
        //given
        Login login1 = Login.builder()
                .email("test1@gmail.com")
                .pwd("12345")
                .build();

        String rawPassword1 = login1.getPwd();
        String encodedPassword1 = passwordEncoder.encode(rawPassword1);
        login1.setPwd(encodedPassword1);

        Login login2 = Login.builder()
                        .email("test2@gmail.com")
                                .pwd("1111")
                                        .build();

        String rawPassword2 = login2.getPwd();
        String encodedPassword2 = passwordEncoder.encode(rawPassword2);
        login2.setPwd(encodedPassword2);

        log.info("encodedPassword1 = {}", encodedPassword1);
        log.info("encodedPassword2 = {}", encodedPassword2);


        Member member1 = login1.toEntity(login1);
        Member member2 = login2.toEntity(login2);

        //when
        member1 = memberRepository.save(member1);
        member2 = memberRepository.save(member2);

        long countAll = memberRepository.count();

        Login savedLogin1 = member1.of(member1);
        Login savedLogin2 = member2.of(member2);

        //then
        assertThat(login1.getEmail()).isEqualTo(savedLogin1.getEmail());
        assertThat(passwordEncoder.matches("1111", savedLogin2.getPwd())).isTrue();
        assertThat(countAll).isEqualTo(2);

    }

    @Test
    void findByEmail(){
        // given

        // when

        // then



    }





}