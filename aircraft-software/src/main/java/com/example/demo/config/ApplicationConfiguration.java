package com.example.demo.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.utils.ValidationUtil;
import com.example.demo.utils.ValidationUtilImpl;


@Configuration
public class ApplicationConfiguration {
	@Bean
	public ValidationUtil validationUtil() {
		return new ValidationUtilImpl();
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
}
