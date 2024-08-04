package com.ecommerce.springmarket;

import com.ecommerce.springmarket.domains.member.dtos.Login;
import com.ecommerce.springmarket.domains.member.repository.MemberRepository;
import com.ecommerce.springmarket.domains.member.service.MemberService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * packageName    : com.ecommerce.springmarket
 * fileName       : DataInit
 * author         : Sora
 * date           : 2024-07-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-10        Sora       최초 생성
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class DataInit {

    private final MemberService memberService;
  //  @PostConstruct
    public void login(){
//        Login login = new Login();
//        login.setEmail("test@email.com");
//        login.setPwd("1111");
//        Login savedMember =  memberService.save(login);
//        log.info("saveMember = {}", savedMember);

    }
}
