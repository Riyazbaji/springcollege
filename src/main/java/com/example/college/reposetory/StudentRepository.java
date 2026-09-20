package com.example.college.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.college.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
