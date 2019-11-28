package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;

@Configuration
public class BookConfiguration {
	@Bean(name ="book")
	public Book getBook() {
		Book book = new Book();
		book.setName("Java");
		book.setAuthor(getAuthor());
		book.setPrice(1000.00);
		return book;
		
	}
	@Bean(name="author")
	public Author getAuthor() {
		Author author = new Author();
		author.setName("Madhu");
		author.setPenName("Apsara");
		return author;
	}
}
