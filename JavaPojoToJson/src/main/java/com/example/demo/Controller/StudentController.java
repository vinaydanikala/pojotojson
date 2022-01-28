package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
@RestController
public class StudentController {
	@GetMapping("/student")
	public List<Student> getStudent(){
		ArrayList<Student> studentlist = new ArrayList<Student>();
		studentlist.add(new Student(1,"Vinay","Kumar","vinykumar@gmail.com"));
		studentlist.add(new Student(2,"Ravi","Kumar","Ravikumar@gmail.com"));
		studentlist.add(new Student(3,"Vijay","Kumar","Vijaykumar@gmail.com"));
		studentlist.add(new Student(4,"Ramesh","Singh","Rameshsingh@gmail.com"));
		studentlist.add(new Student(5,"Vignesh","Sai","Vigneshsai@gmail.com"));
		studentlist.add(new Student(6,"Balaji","Singh","Balajisingh@gmail.com"));
		return studentlist; 
	}

}
