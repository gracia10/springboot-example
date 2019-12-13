package com.example.service;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.domain.Book;

@Service
public class BookRestService {

    private final RestTemplate restTemplate;

    public BookRestService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.rootUri("/rest/test").build();
    }

    public Book getRestBook() {
        return this.restTemplate.getForObject("/rest/test", Book.class);
    }
}


/* RestTemplateBuilder 	: RestTemplate 핸들링하는 빌더 객체. (timeout 설정..)
*
*  getForObject			: Get통신하는 메서드. ("요청URI",응답 담을 Object)
*/