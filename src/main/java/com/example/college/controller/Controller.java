package com.example.college.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.college.dto.ResponseStructure;
import com.example.college.dto.StudentDto;
import com.example.college.entity.Student;
import com.example.college.service.Services;

@RestController
public class Controller {
	
	@Autowired
	Services sr;
	
	@PostMapping("college/save")
	public ResponseStructure<Student> save(@RequestBody StudentDto stdto) {
		return sr.saveStudent(stdto);
	}
	
	@GetMapping("college/findbyid")
	public ResponseStructure<Student> find(@RequestParam int id) {
		return sr.findbyid(id);
	}
}
