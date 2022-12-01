package com.example.dilprojesi.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dilprojesi.Dataaccess.abstracts.TechnologyRepository;
import com.example.dilprojesi.business.abstracts.TechnologyService;
import com.example.dilprojesi.business.request.CreateTechnologyRequest;
import com.example.dilprojesi.business.request.DeleteTechnologyRequest;

import com.example.dilprojesi.business.response.GetAllLanguageResponse;
import com.example.dilprojesi.business.response.GetAllTechnologyResponse;
import com.example.dilprojesi.entities.Technology;
import com.example.dilprojesi.entities.language;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 @Service
public class TechnologyManager implements TechnologyService {
  private TechnologyRepository techrepository;
 @Autowired
public TechnologyManager(TechnologyRepository techrepository) {
	super();
	this.techrepository = techrepository;
}

@Override
public List<GetAllTechnologyResponse> getAll() {
	
	
		List<Technology>technologies=techrepository.findAll();
		List<GetAllTechnologyResponse>techresponse= new ArrayList<GetAllTechnologyResponse>();
		for(Technology technology:technologies) {
			GetAllTechnologyResponse response= new GetAllTechnologyResponse();
			response.setId(technology.getId());
			response.setName(technology.getName());
			
		}
		
		return techresponse;
	

}

@Override
public void add(CreateTechnologyRequest createtechnologyrequest) throws Exception {
	List<Technology>technologies=techrepository.findAll();
	for(Technology tech:technologies) {
		try {
				if(createtechnologyrequest.getName().isEmpty()) ;
					
		}
		 catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		{
			tech.setName(createtechnologyrequest.getName());
			this.techrepository.save(tech);
		}
	}
	
}

@Override
public void Delete(DeleteTechnologyRequest deltechrequest) {
	List<Technology>technologies1=techrepository.findAll();
	for(Technology tech1:technologies1) {
		if(tech1.getName()==deltechrequest.getName());
		this.techrepository.delete(tech1);
		break;
	}
	
	
}



  
}
