package com.ecommerce.springmarket.domains.member.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * packageName    : com.ecommerce.springmarket.domains.member.dtos
 * fileName       : Login
 * author         : Sora
 * date           : 2024-07-04
 * description    : Login Dto
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-04        Sora       최초 생성
 */
@Getter
public class Login {

    @NotBlank
    private String email;

    @NotBlank
    private String pwd;
}
