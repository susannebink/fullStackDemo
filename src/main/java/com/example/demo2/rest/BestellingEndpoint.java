package com.example.demo2.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo2.controller.BestellingService;
import com.example.demo2.domein.Bestelling;


@RestController
public class BestellingEndpoint {

	@Autowired
	BestellingService bestellingservice;

}