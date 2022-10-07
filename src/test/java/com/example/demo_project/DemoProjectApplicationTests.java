package com.example.demo_project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo_project.service.ifs.ActiveService;
import com.example.demo_project.service.ifs.PersonService;

@SpringBootTest
class DemoProjectApplicationTests {

	@Autowired
	private PersonService personService;
	
	@Autowired
	private ActiveService active;
	
	@Test
	public void contextLoads() {
		active.fly("SSS", 2);
		personService.getPersonInfo("SSSSS");
	}

}
