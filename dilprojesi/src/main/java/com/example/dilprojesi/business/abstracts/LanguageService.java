package com.example.dilprojesi.business.abstracts;

import java.util.List;

import com.example.dilprojesi.business.request.CreateLanguageRequest;
import com.example.dilprojesi.business.request.CreateTechnologyRequest;
import com.example.dilprojesi.business.request.DeleteLanguageRequest;
import com.example.dilprojesi.business.request.DeleteTechnologyRequest;
import com.example.dilprojesi.business.response.GetAllLanguageResponse;


public interface LanguageService {
	 List<GetAllLanguageResponse>getAll();
	
	
	void add(CreateLanguageRequest createlanguageRequest);

	void delete(DeleteLanguageRequest deletelanguageRequest);
}
