package com.example.demo2.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo2.controller.KlantService;
import com.example.demo2.domein.Klant;


@RestController
public class KlantEndpoint {

	@Autowired
	KlantService klantservice;

}