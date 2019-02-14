package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Information;
import com.example.demo.service.InformationService;

@RestController
@RequestMapping("nbp")
@CrossOrigin(origins = "http://localhost:4200")
public class InformationController {

	private InformationService informationService;
	
	@Autowired
	public InformationController(InformationService informationService) {
		this.informationService = informationService;
	}
	
	@RequestMapping(value="/all",method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Information> getInformation(){
		return new ResponseEntity<Information>(informationService.getInformation(),HttpStatus.OK);
	}
	
}
