package com.ecommerce.springmarket.domains.member.service;

import com.ecommerce.springmarket.domains.member.dtos.Login;

/**
 * packageName    : com.ecommerce.springmarket.domains.member.service
 * fileName       : MemberService
 * author         : Sora
 * date           : 2024-07-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-08        Sora       최초 생성
 */
public interface MemberService {

    Login save(Login login);

    Login findByEmail(String email);

}
