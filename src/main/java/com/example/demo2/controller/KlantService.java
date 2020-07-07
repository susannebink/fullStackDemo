package com.example.demo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo2.domein.Klant;

@Service
@Transactional
public class KlantService {
	@Autowired
	KlantRepository klantRepository;
	
	public void test() {
		Iterable<Klant> klanten = klantRepository.findAll();
		for (Klant o: klanten) {
			System.out.println("een klant" + o);
		}
		}
}

