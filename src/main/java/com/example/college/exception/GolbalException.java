package com.example.college.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.college.dto.ResponseStructure;

@RestControllerAdvice
public class GolbalException {
	
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseStructure<String> handler(){
		ResponseStructure<String> rs = new ResponseStructure<String>();
		rs.setStatuscode(HttpStatus.NOT_FOUND.value());
		rs.setMessage("Student Not Found !!");
		rs.setData(null);
		return rs;
	}
}
