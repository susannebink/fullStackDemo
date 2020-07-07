package com.example.demo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TafelService {
	@Autowired
	TafelRepository tafelrepository;
	
	public void test() {
		System.out.println("Hoe doet het");
		
	}
}
