package com.ecommerce.springmarket.domains.member.domain;

import com.ecommerce.springmarket.domains.member.dtos.Login;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Optional;

/**
 * packageName    : com.ecommerce.springmarket.domains.member.domain
 * fileName       : Member
 * author         : Sora
 * date           : 2024-07-05
 * description    : This is domain for JPA.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-05        Sora       최초 생성
 */
@Builder
@Getter
@Entity
@NoArgsConstructor // JPA의 사용의 경우 기본생성자가 필수이므로 꼭 생성해준다.
@AllArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String pwd;


    public static Login of(Member member){
        return Login.builder()
                .user(member.getEmail())
                .password(member.getPwd())
                .build();
    }
}
