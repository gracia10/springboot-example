package com.example;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = {"property.value=propertyTest"}, classes = {SpringBootTestApplication.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringBootTestApplicationTests {

	@Value("${property.value}")
	private String propertyValue;

	@Test
	public void contextLoads() {
		assertThat(propertyValue, is("propertyTest"));
	}

}


/*
 * @SpringBootTest(										
 * value = "value=test", 										프로퍼티 추가. value OR properties 한개만 사용
 * properties = {"property.value=propertyTest"}, 
 * classes = {SpringBootTestApplication.class}, 				어플리케이션 컨텍스트에 로드할 클래스 지정. * @SpringBootConfiguration을 찾아서 로드
 * webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT	어플리케이션 웹 환경설정. * Mock서블릿
 * )
 * 
 * @ActiveProfiles("프로필명")
 * @Transactional 			- 수정된 데이터 롤백
 */