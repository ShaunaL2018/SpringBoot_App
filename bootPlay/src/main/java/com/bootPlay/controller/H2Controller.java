package com.bootPlay.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootPlay.service.H2Service;

@RestController
public class H2Controller {
		
	@Autowired
	private H2Service h2Service;
	
//	public H2Controller() {
//		
//	}	
	
//	public H2Controller(H2Service service){
//		h2Service = service;
//	}
	
	@GetMapping("/getAllH2Data")
	public ArrayList<String> getAllH2Data() {
		
		//ArrayList<String> data = new ArrayList<String>();
		return h2Service.getAllH2Data();
	}
	
	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
    @GetMapping("/hello")
	public String getTitle(){
		return "Hello World, It's Me Shauna";
	}

}
