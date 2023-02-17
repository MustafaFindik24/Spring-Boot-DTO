package com.app.dto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DtoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DtoApplication.class, args);
	}
	//TODO UserUpdateDto kullandığımda update ettikten sonra eski veriler null olarak değiştirildi bunu engelleyebilir miyiz?

}
