package com.example.demo2.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo2.controller.TafelService;

@RestController
public class TafelEndpoint {
	
	@Autowired
	TafelService tafelservice;
	
	@GetMapping("/Tara")
	public void uitproberen() {
		System.out.println("Hij doet het");
		tafelservice.test();
	}
	
}
