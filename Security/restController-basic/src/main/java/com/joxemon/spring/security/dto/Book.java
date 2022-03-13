package com.joxemon.spring.security.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@JsonInclude(Include.NON_NULL)
public class Book {

	private String name;
	private String author;
	private String code;
	
	@Generated("SparkTools")
	private Book(Builder builder) {
		this.name = builder.name;
		this.author = builder.author;
		this.code = builder.code;
	}
	
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}
	
	@Generated("SparkTools")
	public static final class Builder {
		private String name;
		private String author;
		private String code;

		private Builder() {
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withAuthor(String author) {
			this.author = author;
			return this;
		}

		public Builder withCode(String code) {
			this.code = code;
			return this;
		}

		public Book build() {
			return new Book(this);
		}
	}
	
	
}
