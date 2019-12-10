package com.community.pojo;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties("fruit")
public class FruitProperty {
	private List<Fruit> list;
}
