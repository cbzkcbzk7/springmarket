package com.ecommerce.springmarket;

import com.ecommerce.springmarket.domains.member.dtos.Login;
import com.ecommerce.springmarket.domains.member.service.MemberService;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.ModelAttribute;
@Slf4j
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SpringmarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmarketApplication.class, args);
	}


}
