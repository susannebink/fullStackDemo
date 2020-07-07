package com.example.demo2.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.demo2.domein.Tafel;

@Component
public interface TafelRepository extends CrudRepository<Tafel, Long>{

}
