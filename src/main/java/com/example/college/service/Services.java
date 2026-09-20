package com.example.college.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.college.dto.ResponseStructure;
import com.example.college.dto.StudentDto;
import com.example.college.entity.Adress;
import com.example.college.entity.Student;
import com.example.college.reposetory.AdressRepository;
import com.example.college.reposetory.StudentRepository;

@Service
public class Services {
	@Autowired
	StudentRepository srp;
	
	@Autowired
	AdressRepository adp;
	
	public ResponseStructure<Student> saveStudent(StudentDto st) {
		ResponseStructure<Student> rs = new ResponseStructure<>();
		Student s = new Student();
		s.setName(st.getName());
		s.setAge(st.getAge());
		s.setPhone(st.getPhone());
		Adress a = new Adress();
		a.setCity(st.getAddress().getCity());
		a.setPincode(st.getAddress().getPincode());
		s.setAdress(a);
		adp.save(a);
		srp.save(s);
		rs.setStatuscode(HttpStatus.FOUND.value());
		rs.setMessage("candidate saved successfully");
		rs.setData(s);
		return rs;
	}
}
