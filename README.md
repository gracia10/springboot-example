# springboot-example
https://spring.io/projects/spring-boot

------
## Github branch 종류  

master  배포목적. 배포가능 상태만 관리   
develop 개발목적. 개발 안정 상태만 관리   
feature 기능추가목적. develop에 merge해서 사용. feature/기능이름   
hotfix  버그수정목적. master/develop 모두 merge.   
 
------

## @SpringBootApplication 

### @Configuration:  
class를 application context의 Bean 정의 소스로 태그합니다.
 
### @EnableAutoConfiguration:  
Tells Spring Boot to start adding beans based on
classpath settings, other beans, and various property settings. For example,
if spring-webmvc is on the classpath, this annotation flags the application
as a web application and activates key behaviors, such as setting up a DispatcherServlet.
  
### @ComponentScan:  
Spring에게 현재 패키지 스캔지시. look for other components, configurations,
and services in the hello package, letting it find the controllers.
