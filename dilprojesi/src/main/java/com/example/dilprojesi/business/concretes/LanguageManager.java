package com.example.dilprojesi.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dilprojesi.Dataaccess.abstracts.LanguageRepository;
import com.example.dilprojesi.business.abstracts.LanguageService;
import com.example.dilprojesi.business.request.CreateLanguageRequest;
import com.example.dilprojesi.business.request.CreateTechnologyRequest;
import com.example.dilprojesi.business.request.DeleteLanguageRequest;
import com.example.dilprojesi.business.request.DeleteTechnologyRequest;
import com.example.dilprojesi.business.response.GetAllLanguageResponse;
import com.example.dilprojesi.entities.Technology;
import com.example.dilprojesi.entities.language;
@Service
public class LanguageManager implements LanguageService{
	private LanguageRepository languagerepository;
@Autowired
	public LanguageManager(LanguageRepository languagerepository) {
		super();
		this.languagerepository = languagerepository;
	}

	@Override
	public List<GetAllLanguageResponse> getAll() {
		List<language>languages=languagerepository.findAll();
		List<GetAllLanguageResponse>languageresponse= new ArrayList<GetAllLanguageResponse>();
		for(language language1:languages) {
			GetAllLanguageResponse responseitem= new GetAllLanguageResponse();
			responseitem.setId(language1.getId());
			responseitem.setName(language1.getName());
			languageresponse.add(responseitem);
		}
		
		return languageresponse;
	}

	
	

	@Override
	public void delete(DeleteLanguageRequest deletelanguageRequest) {
		List<language>languages1=languagerepository.findAll();
		for(language tech1:languages1) {
			if(tech1.getName()==deletelanguageRequest.getName());
			this.languagerepository.delete(tech1);
			break;
		}
	}

	@Override
	public void add(CreateLanguageRequest createlanguageRequest) {
		List<language>languages=languagerepository.findAll();
		for(language tech:languages) {
			try {
					if(createlanguageRequest.getName().isEmpty()) ;
						
			}
			 catch (Exception e) {
				
				System.out.println(e.getMessage());
			}
			{
				tech.setName(createlanguageRequest.getName());
				this.languagerepository.save(tech);
			}
		}
		
	}

}
	

