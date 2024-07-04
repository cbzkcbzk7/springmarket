package com.ecommerce.springmarket.domains.member.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


/**
 * packageName    : com.ecommerce.springmarket.domains.member.config
 * fileName       : SecurityConfig
 * author         : Sora
 * date           : 2024-07-04
 * description    : This is for config of security.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-07-04        Sora       최초 생성
 */
@Configuration      // Ioc 설정
@EnableWebSecurity // 해당 파일로 security 활성화
public class SecurityConfig {

    // 특정 Http 요청에 대한 웹 기반 보안 구성
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http 	.authorizeHttpRequests((authorize) -> authorize
                .requestMatchers("/", "/member/login/**").permitAll()
                .anyRequest().authenticated());

        return http.build();
    }

    /**
     *  DIP : 구현체가 아닌 인터페이스에 의존
     */
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
