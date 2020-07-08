package com.power.schoology.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.power.schoology.model.ResponseData;
import com.power.schoology.service.SchoologyService;

/**
 * 
 * @author jkn
 */
@RestController
@RequestMapping("/api/v1")
public class SchoologyController {

	@Autowired
	private SchoologyService schoologyService;
	
	@CrossOrigin
	@GetMapping("/search")
	public ResponseEntity<ResponseData> searchResult(@RequestParam String searchKey){
		ResponseData response = schoologyService.getSearchResult(searchKey);
		 return ResponseEntity.ok().body(response);
	}
}
