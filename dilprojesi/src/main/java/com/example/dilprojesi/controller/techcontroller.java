package com.example.dilprojesi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dilprojesi.business.abstracts.TechnologyService;
import com.example.dilprojesi.business.request.CreateTechnologyRequest;
import com.example.dilprojesi.business.request.DeleteTechnologyRequest;
import com.example.dilprojesi.business.response.GetAllTechnologyResponse;

@RestController
@RequestMapping
 public class techcontroller{
	private TechnologyService technologyservice;
@Autowired
	public techcontroller(TechnologyService technologservice) {
		super();
		this.technologyservice = technologservice;
	}
@GetMapping("/getall")
 public List<GetAllTechnologyResponse> getAll(){
	return technologyservice.getAll();
	
}

@PostMapping("/add")
public void add(CreateTechnologyRequest createTechnologyRequest) throws Exception {
	technologyservice.add(createTechnologyRequest);
}
@DeleteMapping("/delete")
public void delete(DeleteTechnologyRequest deleteTechnologyRequest) {
	technologyservice.Delete(deleteTechnologyRequest);
	
}
	
	 
	 
 }

  