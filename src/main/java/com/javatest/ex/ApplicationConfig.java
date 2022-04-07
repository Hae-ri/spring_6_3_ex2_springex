package com.javatest.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:applicationCTX.xml")
public class ApplicationConfig {

	@Bean
	public Student student1() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("수영");
		hobbys.add("달리기");
		hobbys.add("노래");
		
		Student student = new Student("홍길동","30세",hobbys); // 생성자
		
		student.setHeight(180); // 프로퍼티
		student.setWeight(90);
		
		return student;
	}
	
	@Bean
	public Student student2() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("활쏘기");
		hobbys.add("말타기");
		hobbys.add("일기쓰기");
		
		Student student = new Student("이순신","50세",hobbys); // 생성자
		
		student.setHeight(190); // 프로퍼티
		student.setWeight(90);
		
		return student;
	} 
	
	
}
