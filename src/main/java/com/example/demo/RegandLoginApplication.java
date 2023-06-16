package com.example.demo;
import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class RegandLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegandLoginApplication.class, args);
		System.out.println("/////////////////////sai///////////////////////////////////////");

	}
	@RequestMapping("/s")
	public String hellow(){
		return "hello sai";
	}
	@RequestMapping("/v")
	public List<Student> Stu(){
		return List.of(
				new Student(
						1,
						"sai",
						"sai@gmail.com",
						LocalDate.of(2000, Month.AUGUST,15),
						21)

		);
	}
	@RequestMapping("/d")
	public String dvr(){
		return "dddddddddd";
	}

}
