package com.example.demo_project.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Person;
import com.example.demo_project.service.ifs.PersonService;

@Service
public class PersonServiceImpl implements PersonService{

	@Override
	
		public void getPersonInfo(String id) {
			Person per = new Person();
			per.setId(id);
			per.setAge(24);
			per.setName("SSS");
			per.setCity("Tokyo");
			System.out.println(per.getId());
			System.out.println(per.getName());
			System.out.println(per.getAge());
			System.out.println(per.getCity());
		}

	@Override
	public void printPersonAttributes(String id) {
		// TODO Auto-generated method stub
		
	}
		
	}

