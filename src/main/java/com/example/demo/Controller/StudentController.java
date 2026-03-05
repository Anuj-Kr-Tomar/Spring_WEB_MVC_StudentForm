package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Binfing.Student;
import com.example.demo.Entity.StudentEntity;
import com.example.demo.Repo.StudentRepository;

@Controller
public class StudentController {
	
	@Autowired
	private StudentRepository repo;
	
	
	
	// method to load student form
	
	@GetMapping("/")
	public String LoadForm(Model model) {
		
		LoadFormMethod(model);
		
	
		return "index";
	}




	private void LoadFormMethod(Model model) {
		List<String>CourseList = new ArrayList<String>();
		CourseList.add("java");
		CourseList.add("Devops");
		CourseList.add("AWS");
		CourseList.add("Cloud");
		
		List<String>TimingList = new ArrayList<String>();
		TimingList.add("Morning");
		TimingList.add("Evening");
		TimingList.add("Afternoon");
		
		Student std = new Student();
		model.addAttribute("student", std);
		model.addAttribute("courses", CourseList);
		model.addAttribute("Timings", TimingList);
	}
	
	
	
	
	// method to save student form
	   @PostMapping("/save")
       public String handleSubmit(Student s , Model model) {
    	System.out.println(s);
    	   
    	StudentEntity entity = new StudentEntity();
    	BeanUtils.copyProperties(s, entity);
    	entity.setTimings(Arrays.toString(s.getTimings()));
    	repo.save(entity);
    	
    	model.addAttribute("msg", "Student Saved");
    	
    	LoadFormMethod(model);
    	
		return "index";
	  }
	
	// method to display saved students form
	   
	   
	   
	   @GetMapping("/viewstudents")
	   public String showStudents(Model model) {
		   
		   List<StudentEntity> studentsData = repo.findAll();
		   model.addAttribute("data", studentsData);
		   
		   return "data";
	   }
	
}
