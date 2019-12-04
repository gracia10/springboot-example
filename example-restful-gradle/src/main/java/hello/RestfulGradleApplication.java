package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestfulGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulGradleApplication.class, args);
	}

}

/*
 * @SpringBootApplication 
 * 
 * @Configuration: class를 application context의 Bean 정의 소스로 태그합니다.
 * 
 * @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on
 * classpath settings, other beans, and various property settings. For example,
 * if spring-webmvc is on the classpath, this annotation flags the application
 * as a web application and activates key behaviors, such as setting up a
 * DispatcherServlet.
 * 
 * @ComponentScan: Spring에게 현재 패키지 스캔지시. look for other components, configurations,
 * and services in the hello package, letting it find the controllers.
 */