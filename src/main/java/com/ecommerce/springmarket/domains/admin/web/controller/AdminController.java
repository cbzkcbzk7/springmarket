package com.ecommerce.springmarket.domains.admin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * packageName    : com.ecommerce.springmarket.domains.admin.web.controller
 * fileName       : AdminController
 * author         : Sora
 * date           : 2024-08-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-03        Sora       최초 생성
 */
@Controller
public class AdminController {

    @GetMapping("/admin")
    public String adminLoginForm(){
        return "/admin/adminLoginForm";
    }
}
