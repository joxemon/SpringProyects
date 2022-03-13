package com.joxemon.spring.security.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joxemon.spring.security.dto.Book;

@RestController
@RequestMapping("/books-rest")
public class RestControler {

	@GetMapping(path="/{id}", produces = "application/json")
    public Book getBook(@PathVariable int id) {
        return findBookById(id);
    }

	private Book findBookById(int id) {
		return Book.builder().withName("libro de los dias").build();
	}

	
}
