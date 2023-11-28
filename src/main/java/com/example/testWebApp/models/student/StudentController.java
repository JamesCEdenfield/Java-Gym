package com.example.testWebApp.models.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.testWebApp.models.student.StudentService;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {
	
	
	public final StudentService studentService; //create an instance of studentService class
	 
	@Autowired  
	public StudentController(StudentService studentService) {
		this.studentService = studentService;           //constructor for this class that is created 
														//using an instance of the studentService class
	}
	
	
	@GetMapping
	public List<Student> getStudents() {
		return studentService.getStudents();  //uses the getStudents method from the studentService Class
		}
	
	
}

	

