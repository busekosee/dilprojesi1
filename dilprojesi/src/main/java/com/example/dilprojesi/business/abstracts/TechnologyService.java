package com.example.dilprojesi.business.abstracts;

import java.util.List;

import com.example.dilprojesi.business.request.CreateTechnologyRequest;
import com.example.dilprojesi.business.request.DeleteTechnologyRequest;

import com.example.dilprojesi.business.response.GetAllTechnologyResponse;

public interface TechnologyService {
   List<GetAllTechnologyResponse>getAll();
   public void add(CreateTechnologyRequest createtechnologyrequest) throws Exception;
	 
   public void Delete(DeleteTechnologyRequest deltechrequest);
   
}
