package com.example.demo2.domain;

import javax.persistence.*;

@Entity
public class Klant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String name;
}
