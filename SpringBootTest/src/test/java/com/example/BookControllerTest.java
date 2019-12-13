package com.example;

import java.time.LocalDateTime;
import java.util.Collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.example.controller.BookController;
import com.example.domain.Book;
import com.example.service.BookService;

import static org.hamcrest.Matchers.contains;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(SpringRunner.class)
@WebMvcTest(BookController.class)
public class BookControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private BookService bookService;
	
	@Test
    public void Book_MVC_테스트() throws Exception {
        Book book = new Book("Spring Boot Book", LocalDateTime.now());
        given(bookService.getBookList()).willReturn(Collections.singletonList(book));
        mvc.perform(get("/books"))
                .andExpect(status().isOk())
                .andExpect(view().name("book"))
                .andExpect(model().attributeExists("bookList"))
                .andExpect(model().attribute("bookList", contains(book)));
    }
}

/* @WebMvcTest
 * 
 * 컨트롤러 테스트 하는데 적합함. @SpringBoot Test 보다 가볍다.
 * 컨트롤러 명시 필수. 해당 컨트롤러와 관련된 빈만 의존성 로드한다!
 * 
 *  @MockBean -- @WebMvcTest는 @Service를 다루지 않아, MockBaen을 활용해 가짜 객체(목객체)를 사용한다.
 *    
 */
