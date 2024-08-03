package com.ecommerce.springmarket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

/**
 * packageName    : com.ecommerce.springmarket.config
 * fileName       : SecurityConfig
 * author         : Sora
 * date           : 2024-08-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-03        Sora       최초 생성
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {


    // authorizeHttpRequests() : 특정 url 요청을 거부하거나 허용할 수 있음
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests((auth) ->
                auth.requestMatchers("/", "/member/login/**").permitAll()     // permitAll() : 모두 허용
                        .requestMatchers("/adimn").hasRole("ADMIN")   // hasRole() : 해당 role만 접근 허용
                        .requestMatchers("/my/**").hasAnyRole("ADMIN","USER") // hasAnyRole() : 여러가지의 롤 설정
                        .anyRequest().authenticated()); // anyRequest() : 위에서 처리하지 못한 나머지 경로


        return http.build();

    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
