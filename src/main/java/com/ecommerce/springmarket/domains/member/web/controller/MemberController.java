package com.ecommerce.springmarket.domains.member.web.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * packageName    : com.ecommerce.springmarket.domains.member.web.controller
 * fileName       : MemberController
 * author         : Sora
 * date           : 2024-07-03
 * description    : This controller for a local login and local sign up.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-03        Sora       최초 생성
 */
@Controller
@RequiredArgsConstructor
public class MemberController{

    @GetMapping("/")
    public String loninForm(){
        return "member/loginForm";
    }
}
