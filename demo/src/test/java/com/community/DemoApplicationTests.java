package com.community;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Value("${property.test.name}")
	private String propertyTestName;
	
	@Value("${propertyTest}")
	private String propertyTest;

	@Value("${nokey:default value}")
	private String defalutValue;

	@Value("${propertyTestList}")
	private String[] propertyTestArray;

	@Value("#{'${propertyTestList}'.split(',')}")
	private List<String> propertyTestList;

	@Test
	public void testValue() {
		assertThat(propertyTestName,is("property depth test"));
		assertThat(propertyTest,is("test"));
		assertThat(defalutValue,is("default value"));
		
		assertThat(propertyTestArray[0],is("a"));
		assertThat(propertyTestList.get(0),is("a"));
	}

}


