package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@Autowired
	MyFeign myfeign;

	@GetMapping("client")
	public String getClient() {
		String s=myfeign.getHome();
		return "hello from client two" +s;
		
	}
}
