package com.example.demo;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("clientone")
public interface MyFeign {

	@GetMapping("home")
	public String getHome();
}
