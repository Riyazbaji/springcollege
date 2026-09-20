package com.example.college.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	public Student saveStudent(Student st) {
		Student s = new Student();
		s.setName(st.getName());
		s.setAge(st.getAge());
		s.setPhone(st.getPhone());
		Adress a = new Adress();
		a.setCity(st.getAdress().getCity());
		a.setPincode(st.getAdress().getPincode());
		a.setState(st.getAdress().getState());
		a.setVillage(st.getAdress().getVillage());
		s.setAdress(a);
		adp.save(a);
		srp.save(s);
		return s;
	}
}
