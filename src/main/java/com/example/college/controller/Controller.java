package com.example.college.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.college.entity.Student;
import com.example.college.service.Services;

@RestController
public class Controller {
	
	@Autowired
	Services sr;
	
	@GetMapping("college/save")
	public Student save(@RequestBody Student stu) {
		return sr.saveStudent(stu);
	}
}
