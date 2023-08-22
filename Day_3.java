package com.problem.gold3.emerald;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Day_3 {
	@Value("1")
	public int id;
	@Value("Shruthi")
	public String name;
	@Value("22")
	public int age;
	@Value("20000")
	public long salary;
	@RequestMapping("/day")
	public String day() {
		return id+"-"+name+"-"+age+"-"+salary;
	}
	}

