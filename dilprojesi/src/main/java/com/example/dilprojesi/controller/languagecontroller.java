package com.example.dilprojesi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dilprojesi.business.abstracts.LanguageService;

import com.example.dilprojesi.business.request.CreateLanguageRequest;

import com.example.dilprojesi.business.request.DeleteLanguageRequest;

import com.example.dilprojesi.business.response.GetAllLanguageResponse;


@RestController
@RequestMapping
 public class languagecontroller{
	private LanguageService languageservice;
@Autowired
	public languagecontroller(LanguageService languageservice) {
		super();
		this.languageservice = languageservice;
	}
@GetMapping("/getall")
 public List<GetAllLanguageResponse> getAll(){
	return languageservice.getAll();
	
}

@PostMapping("/add")
public void add(CreateLanguageRequest createlanguageRequest) throws Exception {
	languageservice.add(createlanguageRequest);
}
@DeleteMapping("/delete")
public void delete(DeleteLanguageRequest deletelanguageRequest) {
	languageservice.delete(deletelanguageRequest);
	
}
}

	
	 
	 
