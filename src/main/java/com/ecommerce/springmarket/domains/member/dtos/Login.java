package com.ecommerce.springmarket.domains.member.dtos;

import com.ecommerce.springmarket.domains.member.domain.Member;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

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
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Login {

    @NotBlank
    private String user;

    @NotBlank
    private String password;

    public Member toEntity(Login login){
        return Member.builder()
                .email(login.user)
                .pwd(login.password)
                .build();
    }
}
