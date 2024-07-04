package com.ecommerce.springmarket.domains.member.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

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
}
