package com.community.pojo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertyTest {

	@Autowired
	FruitProperty fruitProperty;

	@Test
	public void testValue() {
		List<Fruit> fruitData = fruitProperty.getList();
		
		System.out.println(fruitData);
		
		//Fruit(name=banana1, colorName=yellow), Fruit(name=banana2, colorName=green), Fruit(name=banana3, colorName=blue), Fruit(name=banana4, colorName=red)
	}

}


