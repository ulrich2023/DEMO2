package com.example.demo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.modeles.Personne;

@RestController
public class PersonneController {
	
	@GetMapping("/")
	public String getInfo() {
		return "hello controller";
	}
	
	@GetMapping("/personnes")
	public Personne getPersonne() {
	return new Personne("Tchanga","Ulrich",19,"tchangaulrich@gmail.com");	
	}

}
