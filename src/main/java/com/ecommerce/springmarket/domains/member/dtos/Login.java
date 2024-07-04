package com.ecommerce.springmarket.domains.member.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

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
@Data
public class Login {

    @NotBlank
    private String custId;

    @NotBlank
    private String pwd;
}
