package com.example.demo.Binfing;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
	private Integer id;
	private String name;
	private String email;
	private String gender;
	private String course;
	private String[] timings;
}
