package com.example.testWebApp.models.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	public List<Student> getStudents() {	
		return List.of(
				new Student(1L, "mikes", "tam.tommy@gmail.com", 18, LocalDate.of(2003, 7, 7))
				);
	}
}
