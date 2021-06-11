package com.example.demo.utils;

import java.util.Set;

import javax.validation.ConstraintViolation;

public interface ValidationUtil {

	<T> boolean isValid(T entity);
	
	<T> Set<ConstraintViolation<T>> getViolations(T entity);
}
