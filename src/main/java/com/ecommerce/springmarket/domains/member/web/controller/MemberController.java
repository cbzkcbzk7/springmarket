package com.ecommerce.springmarket.domains.member.web.controller;


import com.ecommerce.springmarket.domains.member.dtos.Login;
import com.ecommerce.springmarket.domains.member.service.MemberService;
import jakarta.annotation.PostConstruct;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


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
@Slf4j
@Controller
@RequiredArgsConstructor
public class MemberController{

    private final MemberService memberService;

    @GetMapping("/")
    public String loginForm(@ModelAttribute("login") Login login) {
        return "/member/loginForm";
    }

    // @Valid : error 메세지를 위한 validation
    @PostMapping("/member/login")
    public String login(){
        System.out.println("test!!!!!!!!!");

//         Login foundMember = memberService.findByEmail(login);
//         if(foundMember == null){
//             return "fail";
//         }
//         log.info("foundMember = {}", foundMember);

         return "/admin/adminLoginForm";
    }

}
