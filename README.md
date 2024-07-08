# 👩‍💻PERSONAL PROJECT 
>  ## 📌 SPRINGMARKET
- 혼자 공부하고 배운 내용을 기존의 팀 프로젝트에 적용하며 지속적인 리팩토링을 진행하는 프로젝트
<br>

> ## 기존 팀 프로젝트
 > #### BROKURLY [[바로가기]][link]
[link]:https://github.com/cbzkcbzk7/brokurly_personal
- 스프링의 이해를 높이고 실무의 경험을 다각적으로 얻기위해 마켓컬리를 모티브로 eCommerce 쇼핑몰 프로젝트를 구현
<br>

# 📅개발 기간
- 기간 : 2024.07 ~ 현재
<br>

# ⚙️리팩토링 기술스택
- Java
- Spring Framework
  >➕ Spring Boot
  >
  >➕ Spring Security
  >
  >➕ Spring Data JPA

- MyBatis ➡️ <b>JPA</b>
- Maven ➡️ <b>Gradle</b>
- MySQL ➡️ <b>H2</b>
- Javascript
   > 현재 백엔드 중심의 리팩토링 진행 과정으로 템플릿으로 대체하였습니다.
- JSP ➡️ <b>Thymeleaf</b>
<br>
<br>


# 🖥️DB Modeling
![ERD](https://github.com/cbzkcbzk7/brokurly_personal/assets/72380692/4288fd93-a260-406d-b17d-8e36e4553e91)
<br>
<br>
<br>

# 📒Refactoring 
#### 🟢 진행 완료 🟡 진행 중 🔴 예정
<br>
  
  >
  > 🟡 Login 🔴 Sign up

### 🟢 CI / TEST 자동화
- [x] Git action을 사용한 build/test 자동화
  >  git push 마다 빌드와 테스트 자동화 구축을 통하여 코드 신뢰성을 높힘

### 🟢 Spring web 계층 추가 - 뷰 템플릿 영역
- [x] controller, interceptor, filter 등 외부 요청과 응답에 대한 전반적인 영역 분리
  >  Web Layer 계층 추가로 서비스 영역과 웹 영역을 분리하고자 함
      
### 🟡 Spring Security를 이용한 Login
- [ ] Spring Security 이용하여 보안을 강화하고자 함

### 🟢 Dto와 Entity에 Builder pattern을 적용


### 🟢 Domain에서 pk_id db에서 값을 넣어주는 전략 사용
- [X] MyBatis에서 DB auto key 부분 JPA의 로 변경

### 🟢 Null 처리를 위한 Optional() 사용

### 🟢 TEST 임베디드 모드

### 🟢 Login 템플릿 Thymeleaf 추가 및 작업

### 🔴 DB 연결

