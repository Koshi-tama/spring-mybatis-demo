package com.tamatech.demo.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.tamatech.demo.model.Teacher;
import com.tamatech.demo.service.TeacherService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class DataLoader implements ApplicationRunner {
	
	private final TeacherService service;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		for(int i=0; i<5; i++) {
			var teacher = new Teacher();
			teacher.setUserName("ƒeƒXƒg");
			teacher.setEmail("test@gmail.com");
			service.save(teacher);
		}
	}
}
